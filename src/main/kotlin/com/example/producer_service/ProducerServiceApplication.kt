package com.example.producer_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class ProducerServiceApplication

fun main(args: Array<String>) {
    runApplication<ProducerServiceApplication>(*args)
}
