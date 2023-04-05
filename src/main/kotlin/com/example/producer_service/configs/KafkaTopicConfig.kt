package com.example.producer_service.configs

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig {

    @Bean
    fun issTopic(): NewTopic {
        return TopicBuilder
            .name("issTopic")
            .build()
    }
}