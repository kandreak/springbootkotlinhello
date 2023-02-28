package com.springbootkotlinhello.controller
import com.springbootkotlinhello.model.Message
import com.springbootkotlinhello.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val messageService: MessageService) {
    @GetMapping("/")
    fun findAll() = messageService.findMessages()

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: String) = messageService.findMessage(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        messageService.save(message)
    }

    @PatchMapping("/")
    fun patch(@RequestBody message: Message) {
        if(messageService.findMessage(message.id).isEmpty()) throw Exception("message with id " + message.id + " not found (hint: use POST method)")
        messageService.save(message)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        messageService.delete(id)
    }
}