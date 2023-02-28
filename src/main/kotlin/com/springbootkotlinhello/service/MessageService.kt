package com.springbootkotlinhello.service

import com.springbootkotlinhello.model.Message
import com.springbootkotlinhello.repository.MessageRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()

    @OptIn(ExperimentalStdlibApi::class)
    fun findMessage(id: String): List<Message> = db.findById(id).toList()

    fun save(message: Message) {
        db.save(message)
    }

    fun delete(id: String) = db.deleteById(id)
}