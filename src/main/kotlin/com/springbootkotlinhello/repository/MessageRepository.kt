package com.springbootkotlinhello.repository

import com.springbootkotlinhello.model.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, String>{
}