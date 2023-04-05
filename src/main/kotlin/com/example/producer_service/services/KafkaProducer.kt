package com.example.producer_service.services


import com.example.producer_service.dto.IssDTO
import com.launchdarkly.eventsource.EventSource
import org.slf4j.Logger
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.Message
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service
import com.launchdarkly.eventsource.background.BackgroundEventSource
import java.net.URI
import java.util.concurrent.TimeUnit

@Service
class KafkaProducer(
    val kafkaTemplate: KafkaTemplate<String, String>,
    val logger: Logger
) {
    fun broadCast(issDTO: IssDTO) {
        val message: Message<IssDTO> =

            MessageBuilder
                .withPayload(issDTO)
                .setHeader(KafkaHeaders.TOPIC, "issTopic")
                .build()
        kafkaTemplate.send(message)

    }

}