/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.dukat

import org.json.JSONArray
import org.json.JSONObject
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.parser.Tag
import java.io.File
import java.net.URL

fun main(args: Array<String>) {
    val dir = File("../idl")
    println(dir.absolutePath)
    dir.mkdirs()

    var packageFilter: String? = null
    val argsIterator = args.iterator()
    while (argsIterator.hasNext()) {
        val arg = argsIterator.next()

        when (arg) {
            "--pkg" -> if (argsIterator.hasNext()) packageFilter =
                argsIterator.next() else throw IllegalArgumentException("argument $arg requires argument")
            else -> throw IllegalArgumentException("Argument $arg is unknown")
        }
    }

    val urlsPerFiles =
        urls.filter { packageFilter == null || it.second == packageFilter }.groupBy { it.second + ".idl" }

    urlsPerFiles.forEach { e ->
        val fileName = e.key
        val pkg = e.value.first().second

        File(dir, fileName).bufferedWriter().use { w ->
            w.appendLine("package $pkg;")
            w.appendLine()
            w.appendLine()

            e.value.forEach { (url) ->
                println("Loading $url...")

                w.appendLine("// Downloaded from $url")
                val content = fetch(url)

                if (content != null) {
                    if (url.endsWith(".idl")) {
                        w.appendLine(content)
                    } else {
                        extractIDLText(content, w)
                    }
                }
            }

            w.appendLine()
        }
    }

    val cssPropertiesInDOMNotation = (extractCSSProperties() + manuallyAddedProperties)
        .map { translateCSSPropertyToDOMNotation(it) }
        .distinct()
        .filterNot { it == "*" }
        .map { propertiesMappingSpecialCases[it] ?: it }

    File(dir, cssPropertiesFilename).bufferedWriter().use { w ->
        w.appendLine("package org.w3c.dom.css;")
        w.appendLine()
        w.appendLine("// generated from $cssPropertiesUrl")
        w.appendLine("// for more details see generator/src/main/kotlin/download.kt")

        w.appendLine("partial interface CSSStyleDeclaration {")

        cssPropertiesInDOMNotation.forEach {
            w.appendLine("    attribute String $it;")
        }

        w.appendLine("};")
    }
}

private fun fetch(url: String): String? {
    try {
        return URL(url).readText()
    } catch (e: Exception) {
        println("failed to download ${url}, if it's not a local problem, revisit the list of downloaded entities")
        e.printStackTrace()
        return null
    }
}

private fun Appendable.append(element: Element) {
    val text = element.text()
    appendLine(text)
    if (!text.trimEnd().endsWith(";")) {
        appendLine(";")
    }
}


private fun List<Element>.attachTo(out: Appendable) = map { element ->
    if (!element.tag().preserveWhitespace()) {
        Element(Tag.valueOf("pre"), element.baseUri()).appendChild(element)
    } else element
}.forEach { out.append(it) }


private fun extractIDLText(rawContent: String, out: Appendable) {
    val soup = Jsoup.parse(rawContent)

    soup.select(".dfn-panel").remove()
    soup.select("pre.extract").remove()

    soup.select("pre.idl").filter { !it.hasClass("extract") }.attachTo(out)
    soup.select("pre code.idl").attachTo(out)
    soup.select("code.idl-code").attachTo(out)
    soup.select("spec-idl").attachTo(out)
}

private fun extractCSSProperties(): List<String> {
    val result = mutableListOf<String>()
    val jsonArray = JSONArray(fetch(cssPropertiesUrl))
    for (i in 0 until jsonArray.length()) {
        result += (jsonArray.get(i) as JSONObject).get("property") as String
    }
    return result
}

private fun translateCSSPropertyToDOMNotation(property: String): String {
    val words = property.split("-")
    return words[0] + words.drop(1).joinToString(separator = "") { it.capitalize() }
}

private val urls = listOf(
    "https://raw.githubusercontent.com/whatwg/html-mirror/master/source" to "org.w3c.dom",
    "https://html.spec.whatwg.org/" to "org.w3c.dom",
    "https://raw.githubusercontent.com/whatwg/dom/master/dom.bs" to "org.w3c.dom",
    "https://dvcs.w3.org/hg/editing/raw-file/tip/editing.html" to "org.w3c.dom",
    "https://www.w3.org/TR/animation-timing/" to "org.w3c.dom",
    "https://www.w3.org/TR/geometry-1/" to "org.w3c.dom",
    "https://www.w3.org/TR/cssom-view/" to "org.w3c.dom",
    "https://www.w3.org/TR/touch-events/" to "org.w3c.dom",
    "https://www.w3.org/TR/uievents/" to "org.w3c.dom.events",
    "https://www.w3.org/TR/pointerevents/" to "org.w3c.dom.pointerevents",
    "https://www.w3.org/TR/pointerlock/" to "org.w3c.dom.pointerlock",
    "https://drafts.csswg.org/cssom/" to "org.w3c.dom.css",
    "https://www.w3.org/TR/css-masking-1/" to "org.w3c.css.masking",
    "https://www.w3.org/TR/css-font-loading/" to "org.w3c.css.fontloading",

    "https://w3c.github.io/mediacapture-main/" to "org.w3c.dom.mediacapture",
    "https://www.w3.org/TR/screen-capture/" to "org.w3c.dom.screencapture",
    "https://www.w3.org/TR/DOM-Parsing/" to "org.w3c.dom.parsing",
    "https://w3c.github.io/clipboard-apis" to "org.w3c.dom.clipboard",
    "https://raw.githubusercontent.com/whatwg/url/master/url.bs" to "org.w3c.dom.url",

    "https://www.w3.org/TR/SVG2/idl.html" to "org.w3c.dom.svg",
    "https://www.khronos.org/registry/webgl/specs/latest/1.0/webgl.idl" to "org.khronos.webgl",
//        "https://www.khronos.org/registry/typedarray/specs/latest/typedarray.idl" to "org.khronos.webgl", // permanently moved

    "https://raw.githubusercontent.com/whatwg/xhr/master/xhr.bs" to "org.w3c.xhr",
    "https://raw.githubusercontent.com/whatwg/fetch/master/fetch.bs" to "org.w3c.fetch",
    "https://raw.githubusercontent.com/w3c/FileAPI/gh-pages/index.html" to "org.w3c.files",

    "https://raw.githubusercontent.com/whatwg/notifications/master/notifications.bs" to "org.w3c.notifications",
    "https://raw.githubusercontent.com/whatwg/fullscreen/master/fullscreen.bs" to "org.w3c.fullscreen",
    "https://www.w3.org/TR/vibration/" to "org.w3c.vibration",

    "https://www.w3.org/TR/hr-time/" to "org.w3c.performance",
    "https://www.w3.org/TR/2012/REC-navigation-timing-20121217/" to "org.w3c.performance",

    "https://w3c.github.io/ServiceWorker/" to "org.w3c.workers",
    "https://raw.githubusercontent.com/whatwg/storage/main/storage.bs" to "org.w3c.storage",

    "https://www.w3.org/TR/geolocation-API/" to "org.w3c.geolocation",
    "https://www.w3.org/TR/WebCryptoAPI/" to "org.w3c.crypto",
    "https://www.w3.org/TR/IndexedDB/" to  "org.w3c.idb",
    "https://www.w3.org/TR/eventsource/" to "org.w3c.eventsource",
)

private var cssPropertiesUrl = "https://www.w3.org/Style/CSS/all-properties.en.json"
private var cssPropertiesFilename = "org.w3c.dom.css.ext.idl"

private val propertiesMappingSpecialCases = mapOf(
    "float" to "cssFloat"
)
private val manuallyAddedProperties = listOf(
    "pointerEvents"
)