package com.springbootkotlinhello.controller.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import java.time.Instant

@ControllerAdvice
class HttpErrorHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception::class)
    @ResponseBody
    fun handleInvalidSignatureException(ex: Exception): ErrorMessage {
        return ErrorMessage(ex.message.toString())
    }
}

class InvalidSignatureException : Exception()

data class ErrorMessage(
    val message: String,
    val timestamp: Instant = Instant.now()
)

