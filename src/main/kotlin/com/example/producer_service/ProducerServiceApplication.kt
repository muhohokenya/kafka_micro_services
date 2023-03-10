package com.example.producer_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerServiceApplication

fun main(args: Array<String>) {
    runApplication<ProducerServiceApplication>(*args)
}
