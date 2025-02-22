/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface WebGLContextAttributes {
    var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    var depth: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    var stencil: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var antialias: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    var premultipliedAlpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    var preserveDrawingBuffer: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var powerPreference: WebGLPowerPreference? /* = WebGLPowerPreference.DEFAULT */
        get() = definedExternally
        set(value) = definedExternally
    var failIfMajorPerformanceCaveat: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var desynchronized: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun WebGLContextAttributes(alpha: Boolean? = true, depth: Boolean? = true, stencil: Boolean? = false, antialias: Boolean? = true, premultipliedAlpha: Boolean? = true, preserveDrawingBuffer: Boolean? = false, powerPreference: WebGLPowerPreference? = WebGLPowerPreference.DEFAULT, failIfMajorPerformanceCaveat: Boolean? = false, desynchronized: Boolean? = false): WebGLContextAttributes {
    val o = js("({})")
    o["alpha"] = alpha
    o["depth"] = depth
    o["stencil"] = stencil
    o["antialias"] = antialias
    o["premultipliedAlpha"] = premultipliedAlpha
    o["preserveDrawingBuffer"] = preserveDrawingBuffer
    o["powerPreference"] = powerPreference
    o["failIfMajorPerformanceCaveat"] = failIfMajorPerformanceCaveat
    o["desynchronized"] = desynchronized
    return o
}

public external abstract class WebGLObject

/**
 * Exposes the JavaScript [WebGLBuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLBuffer) to Kotlin
 */
public external abstract class WebGLBuffer : WebGLObject

/**
 * Exposes the JavaScript [WebGLFramebuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLFramebuffer) to Kotlin
 */
public external abstract class WebGLFramebuffer : WebGLObject

/**
 * Exposes the JavaScript [WebGLProgram](https://developer.mozilla.org/en/docs/Web/API/WebGLProgram) to Kotlin
 */
public external abstract class WebGLProgram : WebGLObject

/**
 * Exposes the JavaScript [WebGLRenderbuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLRenderbuffer) to Kotlin
 */
public external abstract class WebGLRenderbuffer : WebGLObject

/**
 * Exposes the JavaScript [WebGLShader](https://developer.mozilla.org/en/docs/Web/API/WebGLShader) to Kotlin
 */
public external abstract class WebGLShader : WebGLObject

/**
 * Exposes the JavaScript [WebGLTexture](https://developer.mozilla.org/en/docs/Web/API/WebGLTexture) to Kotlin
 */
public external abstract class WebGLTexture : WebGLObject

/**
 * Exposes the JavaScript [WebGLUniformLocation](https://developer.mozilla.org/en/docs/Web/API/WebGLUniformLocation) to Kotlin
 */
public external abstract class WebGLUniformLocation

/**
 * Exposes the JavaScript [WebGLActiveInfo](https://developer.mozilla.org/en/docs/Web/API/WebGLActiveInfo) to Kotlin
 */
public external abstract class WebGLActiveInfo {
    open val size: Int
    open val type: Int
    open val name: String
}

/**
 * Exposes the JavaScript [WebGLShaderPrecisionFormat](https://developer.mozilla.org/en/docs/Web/API/WebGLShaderPrecisionFormat) to Kotlin
 */
public external abstract class WebGLShaderPrecisionFormat {
    open val rangeMin: Int
    open val rangeMax: Int
    open val precision: Int
}

/**
 * Exposes the JavaScript [WebGLRenderingContext](https://developer.mozilla.org/en/docs/Web/API/WebGLRenderingContext) to Kotlin
 */
public external abstract class WebGLRenderingContext {
    open val canvas: UnionHTMLCanvasElementOrOffscreenCanvas
    open val drawingBufferWidth: Int
    open val drawingBufferHeight: Int
    fun getContextAttributes(): WebGLContextAttributes?
    fun isContextLost(): Boolean
    fun getSupportedExtensions(): Array<String>?
    fun getExtension(name: String): dynamic
    fun activeTexture(texture: Int): dynamic
    fun attachShader(program: WebGLProgram, shader: WebGLShader): dynamic
    fun bindAttribLocation(program: WebGLProgram, index: Int, name: String): dynamic
    fun bindBuffer(target: Int, buffer: WebGLBuffer?): dynamic
    fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?): dynamic
    fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?): dynamic
    fun bindTexture(target: Int, texture: WebGLTexture?): dynamic
    fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): dynamic
    fun blendEquation(mode: Int): dynamic
    fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): dynamic
    fun blendFunc(sfactor: Int, dfactor: Int): dynamic
    fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int): dynamic
    fun checkFramebufferStatus(target: Int): Int
    fun clear(mask: Int): dynamic
    fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): dynamic
    fun clearDepth(depth: Float): dynamic
    fun clearStencil(s: Int): dynamic
    fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): dynamic
    fun compileShader(shader: WebGLShader): dynamic
    fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): dynamic
    fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): dynamic
    fun createBuffer(): WebGLBuffer?
    fun createFramebuffer(): WebGLFramebuffer?
    fun createProgram(): WebGLProgram?
    fun createRenderbuffer(): WebGLRenderbuffer?
    fun createShader(type: Int): WebGLShader?
    fun createTexture(): WebGLTexture?
    fun cullFace(mode: Int): dynamic
    fun deleteBuffer(buffer: WebGLBuffer?): dynamic
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?): dynamic
    fun deleteProgram(program: WebGLProgram?): dynamic
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?): dynamic
    fun deleteShader(shader: WebGLShader?): dynamic
    fun deleteTexture(texture: WebGLTexture?): dynamic
    fun depthFunc(func: Int): dynamic
    fun depthMask(flag: Boolean): dynamic
    fun depthRange(zNear: Float, zFar: Float): dynamic
    fun detachShader(program: WebGLProgram, shader: WebGLShader): dynamic
    fun disable(cap: Int): dynamic
    fun disableVertexAttribArray(index: Int): dynamic
    fun drawArrays(mode: Int, first: Int, count: Int): dynamic
    fun drawElements(mode: Int, count: Int, type: Int, offset: Int): dynamic
    fun enable(cap: Int): dynamic
    fun enableVertexAttribArray(index: Int): dynamic
    fun finish(): dynamic
    fun flush(): dynamic
    fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?): dynamic
    fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int): dynamic
    fun frontFace(mode: Int): dynamic
    fun generateMipmap(target: Int): dynamic
    fun getActiveAttrib(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getActiveUniform(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getAttachedShaders(program: WebGLProgram): Array<WebGLShader>?
    fun getAttribLocation(program: WebGLProgram, name: String): Int
    fun getBufferParameter(target: Int, pname: Int): Any?
    fun getParameter(pname: Int): Any?
    fun getError(): Int
    fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): Any?
    fun getProgramParameter(program: WebGLProgram, pname: Int): Any?
    fun getProgramInfoLog(program: WebGLProgram): String?
    fun getRenderbufferParameter(target: Int, pname: Int): Any?
    fun getShaderParameter(shader: WebGLShader, pname: Int): Any?
    fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?
    fun getShaderInfoLog(shader: WebGLShader): String?
    fun getShaderSource(shader: WebGLShader): String?
    fun getTexParameter(target: Int, pname: Int): Any?
    fun getUniform(program: WebGLProgram, location: WebGLUniformLocation): Any?
    fun getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation?
    fun getVertexAttrib(index: Int, pname: Int): Any?
    fun getVertexAttribOffset(index: Int, pname: Int): Int
    fun hint(target: Int, mode: Int): dynamic
    fun isBuffer(buffer: WebGLBuffer?): Boolean
    fun isEnabled(cap: Int): Boolean
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean
    fun isProgram(program: WebGLProgram?): Boolean
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean
    fun isShader(shader: WebGLShader?): Boolean
    fun isTexture(texture: WebGLTexture?): Boolean
    fun lineWidth(width: Float): dynamic
    fun linkProgram(program: WebGLProgram): dynamic
    fun pixelStorei(pname: Int, param: Int): dynamic
    fun polygonOffset(factor: Float, units: Float): dynamic
    fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): dynamic
    fun sampleCoverage(value: Float, invert: Boolean): dynamic
    fun scissor(x: Int, y: Int, width: Int, height: Int): dynamic
    fun shaderSource(shader: WebGLShader, source: String): dynamic
    fun stencilFunc(func: Int, ref: Int, mask: Int): dynamic
    fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): dynamic
    fun stencilMask(mask: Int): dynamic
    fun stencilMaskSeparate(face: Int, mask: Int): dynamic
    fun stencilOp(fail: Int, zfail: Int, zpass: Int): dynamic
    fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int): dynamic
    fun texParameterf(target: Int, pname: Int, param: Float): dynamic
    fun texParameteri(target: Int, pname: Int, param: Int): dynamic
    fun uniform1f(location: WebGLUniformLocation?, x: Float): dynamic
    fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float): dynamic
    fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float): dynamic
    fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float): dynamic
    fun uniform1i(location: WebGLUniformLocation?, x: Int): dynamic
    fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int): dynamic
    fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int): dynamic
    fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int): dynamic
    fun useProgram(program: WebGLProgram?): dynamic
    fun validateProgram(program: WebGLProgram): dynamic
    fun vertexAttrib1f(index: Int, x: Float): dynamic
    fun vertexAttrib2f(index: Int, x: Float, y: Float): dynamic
    fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): dynamic
    fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): dynamic
    fun vertexAttrib1fv(index: Int, values: dynamic): dynamic
    fun vertexAttrib2fv(index: Int, values: dynamic): dynamic
    fun vertexAttrib3fv(index: Int, values: dynamic): dynamic
    fun vertexAttrib4fv(index: Int, values: dynamic): dynamic
    fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int): dynamic
    fun viewport(x: Int, y: Int, width: Int, height: Int): dynamic
    fun bufferData(target: Int, size: Int, usage: Int): dynamic
    fun bufferData(target: Int, data: dynamic, usage: Int): dynamic
    fun bufferSubData(target: Int, offset: Int, data: dynamic): dynamic
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView): dynamic
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView): dynamic
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?): dynamic
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?): dynamic
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource): dynamic
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?): dynamic
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource): dynamic
    fun uniform1fv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform2fv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform3fv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform4fv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform1iv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform2iv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform3iv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniform4iv(location: WebGLUniformLocation?, v: dynamic): dynamic
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): dynamic
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): dynamic
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: dynamic): dynamic

    companion object {
        val DEPTH_BUFFER_BIT: Int
        val STENCIL_BUFFER_BIT: Int
        val COLOR_BUFFER_BIT: Int
        val POINTS: Int
        val LINES: Int
        val LINE_LOOP: Int
        val LINE_STRIP: Int
        val TRIANGLES: Int
        val TRIANGLE_STRIP: Int
        val TRIANGLE_FAN: Int
        val ZERO: Int
        val ONE: Int
        val SRC_COLOR: Int
        val ONE_MINUS_SRC_COLOR: Int
        val SRC_ALPHA: Int
        val ONE_MINUS_SRC_ALPHA: Int
        val DST_ALPHA: Int
        val ONE_MINUS_DST_ALPHA: Int
        val DST_COLOR: Int
        val ONE_MINUS_DST_COLOR: Int
        val SRC_ALPHA_SATURATE: Int
        val FUNC_ADD: Int
        val BLEND_EQUATION: Int
        val BLEND_EQUATION_RGB: Int
        val BLEND_EQUATION_ALPHA: Int
        val FUNC_SUBTRACT: Int
        val FUNC_REVERSE_SUBTRACT: Int
        val BLEND_DST_RGB: Int
        val BLEND_SRC_RGB: Int
        val BLEND_DST_ALPHA: Int
        val BLEND_SRC_ALPHA: Int
        val CONSTANT_COLOR: Int
        val ONE_MINUS_CONSTANT_COLOR: Int
        val CONSTANT_ALPHA: Int
        val ONE_MINUS_CONSTANT_ALPHA: Int
        val BLEND_COLOR: Int
        val ARRAY_BUFFER: Int
        val ELEMENT_ARRAY_BUFFER: Int
        val ARRAY_BUFFER_BINDING: Int
        val ELEMENT_ARRAY_BUFFER_BINDING: Int
        val STREAM_DRAW: Int
        val STATIC_DRAW: Int
        val DYNAMIC_DRAW: Int
        val BUFFER_SIZE: Int
        val BUFFER_USAGE: Int
        val CURRENT_VERTEX_ATTRIB: Int
        val FRONT: Int
        val BACK: Int
        val FRONT_AND_BACK: Int
        val CULL_FACE: Int
        val BLEND: Int
        val DITHER: Int
        val STENCIL_TEST: Int
        val DEPTH_TEST: Int
        val SCISSOR_TEST: Int
        val POLYGON_OFFSET_FILL: Int
        val SAMPLE_ALPHA_TO_COVERAGE: Int
        val SAMPLE_COVERAGE: Int
        val NO_ERROR: Int
        val INVALID_ENUM: Int
        val INVALID_VALUE: Int
        val INVALID_OPERATION: Int
        val OUT_OF_MEMORY: Int
        val CW: Int
        val CCW: Int
        val LINE_WIDTH: Int
        val ALIASED_POINT_SIZE_RANGE: Int
        val ALIASED_LINE_WIDTH_RANGE: Int
        val CULL_FACE_MODE: Int
        val FRONT_FACE: Int
        val DEPTH_RANGE: Int
        val DEPTH_WRITEMASK: Int
        val DEPTH_CLEAR_VALUE: Int
        val DEPTH_FUNC: Int
        val STENCIL_CLEAR_VALUE: Int
        val STENCIL_FUNC: Int
        val STENCIL_FAIL: Int
        val STENCIL_PASS_DEPTH_FAIL: Int
        val STENCIL_PASS_DEPTH_PASS: Int
        val STENCIL_REF: Int
        val STENCIL_VALUE_MASK: Int
        val STENCIL_WRITEMASK: Int
        val STENCIL_BACK_FUNC: Int
        val STENCIL_BACK_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_PASS: Int
        val STENCIL_BACK_REF: Int
        val STENCIL_BACK_VALUE_MASK: Int
        val STENCIL_BACK_WRITEMASK: Int
        val VIEWPORT: Int
        val SCISSOR_BOX: Int
        val COLOR_CLEAR_VALUE: Int
        val COLOR_WRITEMASK: Int
        val UNPACK_ALIGNMENT: Int
        val PACK_ALIGNMENT: Int
        val MAX_TEXTURE_SIZE: Int
        val MAX_VIEWPORT_DIMS: Int
        val SUBPIXEL_BITS: Int
        val RED_BITS: Int
        val GREEN_BITS: Int
        val BLUE_BITS: Int
        val ALPHA_BITS: Int
        val DEPTH_BITS: Int
        val STENCIL_BITS: Int
        val POLYGON_OFFSET_UNITS: Int
        val POLYGON_OFFSET_FACTOR: Int
        val TEXTURE_BINDING_2D: Int
        val SAMPLE_BUFFERS: Int
        val SAMPLES: Int
        val SAMPLE_COVERAGE_VALUE: Int
        val SAMPLE_COVERAGE_INVERT: Int
        val COMPRESSED_TEXTURE_FORMATS: Int
        val DONT_CARE: Int
        val FASTEST: Int
        val NICEST: Int
        val GENERATE_MIPMAP_HINT: Int
        val BYTE: Int
        val UNSIGNED_BYTE: Int
        val SHORT: Int
        val UNSIGNED_SHORT: Int
        val INT: Int
        val UNSIGNED_INT: Int
        val FLOAT: Int
        val DEPTH_COMPONENT: Int
        val ALPHA: Int
        val RGB: Int
        val RGBA: Int
        val LUMINANCE: Int
        val LUMINANCE_ALPHA: Int
        val UNSIGNED_SHORT_4_4_4_4: Int
        val UNSIGNED_SHORT_5_5_5_1: Int
        val UNSIGNED_SHORT_5_6_5: Int
        val FRAGMENT_SHADER: Int
        val VERTEX_SHADER: Int
        val MAX_VERTEX_ATTRIBS: Int
        val MAX_VERTEX_UNIFORM_VECTORS: Int
        val MAX_VARYING_VECTORS: Int
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        val MAX_TEXTURE_IMAGE_UNITS: Int
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        val SHADER_TYPE: Int
        val DELETE_STATUS: Int
        val LINK_STATUS: Int
        val VALIDATE_STATUS: Int
        val ATTACHED_SHADERS: Int
        val ACTIVE_UNIFORMS: Int
        val ACTIVE_ATTRIBUTES: Int
        val SHADING_LANGUAGE_VERSION: Int
        val CURRENT_PROGRAM: Int
        val NEVER: Int
        val LESS: Int
        val EQUAL: Int
        val LEQUAL: Int
        val GREATER: Int
        val NOTEQUAL: Int
        val GEQUAL: Int
        val ALWAYS: Int
        val KEEP: Int
        val REPLACE: Int
        val INCR: Int
        val DECR: Int
        val INVERT: Int
        val INCR_WRAP: Int
        val DECR_WRAP: Int
        val VENDOR: Int
        val RENDERER: Int
        val VERSION: Int
        val NEAREST: Int
        val LINEAR: Int
        val NEAREST_MIPMAP_NEAREST: Int
        val LINEAR_MIPMAP_NEAREST: Int
        val NEAREST_MIPMAP_LINEAR: Int
        val LINEAR_MIPMAP_LINEAR: Int
        val TEXTURE_MAG_FILTER: Int
        val TEXTURE_MIN_FILTER: Int
        val TEXTURE_WRAP_S: Int
        val TEXTURE_WRAP_T: Int
        val TEXTURE_2D: Int
        val TEXTURE: Int
        val TEXTURE_CUBE_MAP: Int
        val TEXTURE_BINDING_CUBE_MAP: Int
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        val TEXTURE0: Int
        val TEXTURE1: Int
        val TEXTURE2: Int
        val TEXTURE3: Int
        val TEXTURE4: Int
        val TEXTURE5: Int
        val TEXTURE6: Int
        val TEXTURE7: Int
        val TEXTURE8: Int
        val TEXTURE9: Int
        val TEXTURE10: Int
        val TEXTURE11: Int
        val TEXTURE12: Int
        val TEXTURE13: Int
        val TEXTURE14: Int
        val TEXTURE15: Int
        val TEXTURE16: Int
        val TEXTURE17: Int
        val TEXTURE18: Int
        val TEXTURE19: Int
        val TEXTURE20: Int
        val TEXTURE21: Int
        val TEXTURE22: Int
        val TEXTURE23: Int
        val TEXTURE24: Int
        val TEXTURE25: Int
        val TEXTURE26: Int
        val TEXTURE27: Int
        val TEXTURE28: Int
        val TEXTURE29: Int
        val TEXTURE30: Int
        val TEXTURE31: Int
        val ACTIVE_TEXTURE: Int
        val REPEAT: Int
        val CLAMP_TO_EDGE: Int
        val MIRRORED_REPEAT: Int
        val FLOAT_VEC2: Int
        val FLOAT_VEC3: Int
        val FLOAT_VEC4: Int
        val INT_VEC2: Int
        val INT_VEC3: Int
        val INT_VEC4: Int
        val BOOL: Int
        val BOOL_VEC2: Int
        val BOOL_VEC3: Int
        val BOOL_VEC4: Int
        val FLOAT_MAT2: Int
        val FLOAT_MAT3: Int
        val FLOAT_MAT4: Int
        val SAMPLER_2D: Int
        val SAMPLER_CUBE: Int
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        val VERTEX_ATTRIB_ARRAY_SIZE: Int
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        val VERTEX_ATTRIB_ARRAY_TYPE: Int
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        val VERTEX_ATTRIB_ARRAY_POINTER: Int
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        val IMPLEMENTATION_COLOR_READ_TYPE: Int
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        val COMPILE_STATUS: Int
        val LOW_FLOAT: Int
        val MEDIUM_FLOAT: Int
        val HIGH_FLOAT: Int
        val LOW_INT: Int
        val MEDIUM_INT: Int
        val HIGH_INT: Int
        val FRAMEBUFFER: Int
        val RENDERBUFFER: Int
        val RGBA4: Int
        val RGB5_A1: Int
        val RGB565: Int
        val DEPTH_COMPONENT16: Int
        val STENCIL_INDEX8: Int
        val DEPTH_STENCIL: Int
        val RENDERBUFFER_WIDTH: Int
        val RENDERBUFFER_HEIGHT: Int
        val RENDERBUFFER_INTERNAL_FORMAT: Int
        val RENDERBUFFER_RED_SIZE: Int
        val RENDERBUFFER_GREEN_SIZE: Int
        val RENDERBUFFER_BLUE_SIZE: Int
        val RENDERBUFFER_ALPHA_SIZE: Int
        val RENDERBUFFER_DEPTH_SIZE: Int
        val RENDERBUFFER_STENCIL_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        val COLOR_ATTACHMENT0: Int
        val DEPTH_ATTACHMENT: Int
        val STENCIL_ATTACHMENT: Int
        val DEPTH_STENCIL_ATTACHMENT: Int
        val NONE: Int
        val FRAMEBUFFER_COMPLETE: Int
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        val FRAMEBUFFER_UNSUPPORTED: Int
        val FRAMEBUFFER_BINDING: Int
        val RENDERBUFFER_BINDING: Int
        val MAX_RENDERBUFFER_SIZE: Int
        val INVALID_FRAMEBUFFER_OPERATION: Int
        val UNPACK_FLIP_Y_WEBGL: Int
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        val CONTEXT_LOST_WEBGL: Int
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        val BROWSER_DEFAULT_WEBGL: Int
    }
}

/**
 * Exposes the JavaScript [WebGLContextEvent](https://developer.mozilla.org/en/docs/Web/API/WebGLContextEvent) to Kotlin
 */
public external abstract class WebGLContextEvent : Event {
    open val statusMessage: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface WebGLContextEventInit : EventInit {
    var statusMessage: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun WebGLContextEventInit(statusMessage: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): WebGLContextEventInit {
    val o = js("({})")
    o["statusMessage"] = statusMessage
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

public external interface TexImageSource

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface WebGLPowerPreference {
    companion object
}

public inline val WebGLPowerPreference.Companion.DEFAULT: WebGLPowerPreference get() = "default".asDynamic().unsafeCast<WebGLPowerPreference>()

public inline val WebGLPowerPreference.Companion.LOW_POWER: WebGLPowerPreference get() = "low-power".asDynamic().unsafeCast<WebGLPowerPreference>()

public inline val WebGLPowerPreference.Companion.HIGH_PERFORMANCE: WebGLPowerPreference get() = "high-performance".asDynamic().unsafeCast<WebGLPowerPreference>()