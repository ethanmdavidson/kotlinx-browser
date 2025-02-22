/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.fetch

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.files.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Headers](https://developer.mozilla.org/en/docs/Web/API/Headers) to Kotlin
 */
public external abstract class Headers {
    fun append(name: String, value: String): dynamic
    fun delete(name: String): dynamic
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String): dynamic
}

/**
 * Exposes the JavaScript [Request](https://developer.mozilla.org/en/docs/Web/API/Request) to Kotlin
 */
public external abstract class Request {
    open val method: String
    open val url: String
    open val headers: Headers
    open val destination: RequestDestination
    open val referrer: String
    open val referrerPolicy: dynamic
    open val mode: RequestMode
    open val credentials: RequestCredentials
    open val cache: RequestCache
    open val redirect: RequestRedirect
    open val integrity: String
    open val keepalive: Boolean
    open val isReloadNavigation: Boolean
    open val isHistoryNavigation: Boolean
    open val signal: AbortSignal
    open val body: dynamic
    open val bodyUsed: Boolean
    fun clone(): Request
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<Any?>
    fun text(): Promise<String>
}

public external interface RequestInit {
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var body: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var referrer: String?
        get() = definedExternally
        set(value) = definedExternally
    var referrerPolicy: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var mode: RequestMode?
        get() = definedExternally
        set(value) = definedExternally
    var credentials: RequestCredentials?
        get() = definedExternally
        set(value) = definedExternally
    var cache: RequestCache?
        get() = definedExternally
        set(value) = definedExternally
    var redirect: RequestRedirect?
        get() = definedExternally
        set(value) = definedExternally
    var integrity: String?
        get() = definedExternally
        set(value) = definedExternally
    var keepalive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
    var window: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RequestInit(method: String? = undefined, headers: dynamic = undefined, body: dynamic = undefined, referrer: String? = undefined, referrerPolicy: dynamic = undefined, mode: RequestMode? = undefined, credentials: RequestCredentials? = undefined, cache: RequestCache? = undefined, redirect: RequestRedirect? = undefined, integrity: String? = undefined, keepalive: Boolean? = undefined, signal: AbortSignal? = undefined, window: Any? = undefined): RequestInit {
    val o = js("({})")
    o["method"] = method
    o["headers"] = headers
    o["body"] = body
    o["referrer"] = referrer
    o["referrerPolicy"] = referrerPolicy
    o["mode"] = mode
    o["credentials"] = credentials
    o["cache"] = cache
    o["redirect"] = redirect
    o["integrity"] = integrity
    o["keepalive"] = keepalive
    o["signal"] = signal
    o["window"] = window
    return o
}

/**
 * Exposes the JavaScript [Response](https://developer.mozilla.org/en/docs/Web/API/Response) to Kotlin
 */
public external abstract class Response {
    open val type: ResponseType
    open val url: String
    open val redirected: Boolean
    open val status: Short
    open val ok: Boolean
    open val statusText: String
    open val headers: Headers
    open val body: dynamic
    open val bodyUsed: Boolean
    fun clone(): Response
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<Any?>
    fun text(): Promise<String>

    companion object {
        fun error(): Response
        fun redirect(url: String, status: Short = definedExternally): Response
    }
}

public external interface ResponseInit {
    var status: Short? /* = 200 */
        get() = definedExternally
        set(value) = definedExternally
    var statusText: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var headers: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ResponseInit(status: Short? = 200, statusText: String? = "", headers: dynamic = undefined): ResponseInit {
    val o = js("({})")
    o["status"] = status
    o["statusText"] = statusText
    o["headers"] = headers
    return o
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestDestination {
    companion object
}

public inline val RequestDestination.Companion.EMPTY: RequestDestination get() = "".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.AUDIO: RequestDestination get() = "audio".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.AUDIOWORKLET: RequestDestination get() = "audioworklet".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.DOCUMENT: RequestDestination get() = "document".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.EMBED: RequestDestination get() = "embed".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.FONT: RequestDestination get() = "font".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.FRAME: RequestDestination get() = "frame".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.IFRAME: RequestDestination get() = "iframe".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.IMAGE: RequestDestination get() = "image".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.MANIFEST: RequestDestination get() = "manifest".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.OBJECT: RequestDestination get() = "object".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.PAINTWORKLET: RequestDestination get() = "paintworklet".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.REPORT: RequestDestination get() = "report".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.SCRIPT: RequestDestination get() = "script".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination get() = "sharedworker".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.STYLE: RequestDestination get() = "style".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.TRACK: RequestDestination get() = "track".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.VIDEO: RequestDestination get() = "video".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.WORKER: RequestDestination get() = "worker".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.XSLT: RequestDestination get() = "xslt".asDynamic().unsafeCast<RequestDestination>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestMode {
    companion object
}

public inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.CORS: RequestMode get() = "cors".asDynamic().unsafeCast<RequestMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestCredentials {
    companion object
}

public inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".asDynamic().unsafeCast<RequestCredentials>()

public inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".asDynamic().unsafeCast<RequestCredentials>()

public inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".asDynamic().unsafeCast<RequestCredentials>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestCache {
    companion object
}

public inline val RequestCache.Companion.DEFAULT: RequestCache get() = "default".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.NO_STORE: RequestCache get() = "no-store".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.RELOAD: RequestCache get() = "reload".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.NO_CACHE: RequestCache get() = "no-cache".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.FORCE_CACHE: RequestCache get() = "force-cache".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache get() = "only-if-cached".asDynamic().unsafeCast<RequestCache>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestRedirect {
    companion object
}

public inline val RequestRedirect.Companion.FOLLOW: RequestRedirect get() = "follow".asDynamic().unsafeCast<RequestRedirect>()

public inline val RequestRedirect.Companion.ERROR: RequestRedirect get() = "error".asDynamic().unsafeCast<RequestRedirect>()

public inline val RequestRedirect.Companion.MANUAL: RequestRedirect get() = "manual".asDynamic().unsafeCast<RequestRedirect>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ResponseType {
    companion object
}

public inline val ResponseType.Companion.BASIC: ResponseType get() = "basic".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.CORS: ResponseType get() = "cors".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.DEFAULT: ResponseType get() = "default".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.ERROR: ResponseType get() = "error".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.OPAQUE: ResponseType get() = "opaque".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType get() = "opaqueredirect".asDynamic().unsafeCast<ResponseType>()