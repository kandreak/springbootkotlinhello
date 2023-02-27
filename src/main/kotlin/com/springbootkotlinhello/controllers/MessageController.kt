package com.springbootkotlinhello.controllers

import com.springbootkotlinhello.models.Message
import com.springbootkotlinhello.repos.MessageRepository
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