package com.springbootkotlinhello.repos

import com.springbootkotlinhello.models.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, Long>{
}