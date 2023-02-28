package com.springbootkotlinhello.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class Message(
    @Id @GeneratedValue(strategy = GenerationType.UUID) val id: String = UUID.randomUUID().toString(), val text: String
)