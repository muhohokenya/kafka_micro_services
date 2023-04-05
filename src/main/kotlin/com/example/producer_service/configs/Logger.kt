package com.example.producer_service.configs

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.InjectionPoint
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope

@Configuration
class Logger {


    @Bean
    @Scope("prototype")
    fun produceLogger(injectionPoint: InjectionPoint): org.slf4j.Logger? {
        val classOnWired = injectionPoint.member.declaringClass
        return LoggerFactory.getLogger(classOnWired)
    }
}