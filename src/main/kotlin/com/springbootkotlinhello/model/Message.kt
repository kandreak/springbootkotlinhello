package com.springbootkotlinhello.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Message(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long, var text: String)