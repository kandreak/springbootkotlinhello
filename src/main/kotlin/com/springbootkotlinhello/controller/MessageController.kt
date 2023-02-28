package com.springbootkotlinhello.controller

import com.springbootkotlinhello.controller.exception.InvalidSignatureException
import com.springbootkotlinhello.model.Message
import com.springbootkotlinhello.repository.MessageRepository
import org.springframework.data.repository.findByIdOrNull
//import com.springbootkotlinhello.services.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(private val repository: MessageRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findByIdOrNull(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        if(message.text == "ex") throw InvalidSignatureException()
        repository.save(message)
    }

    @PatchMapping("/")
    fun patch(@RequestBody message: Message) {
        repository.save(message)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        repository.deleteById(id)
    }
}