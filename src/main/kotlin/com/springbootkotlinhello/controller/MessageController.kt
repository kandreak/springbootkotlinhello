package com.springbootkotlinhello.controller
import com.springbootkotlinhello.model.Message
import com.springbootkotlinhello.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val messageService: MessageService) {
    @GetMapping("/")
    fun findAll() = messageService.findMessages()

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = messageService.findMessage(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        messageService.save(message)
    }

    @PatchMapping("/")
    //TODO: error if not find
    fun patch(@RequestBody message: Message) {
        messageService.save(message)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        messageService.delete(id)
    }
}