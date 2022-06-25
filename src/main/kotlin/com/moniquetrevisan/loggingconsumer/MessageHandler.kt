package com.moniquetrevisan.loggingconsumer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message
import reactor.core.publisher.EmitterProcessor
import reactor.core.publisher.Flux
import java.util.function.Supplier

@Configuration
open class MessageHandler {

    companion object {
        val processor: EmitterProcessor<Message<*>> = EmitterProcessor.create()
        val logger: Logger = LoggerFactory.getLogger(MessageHandler::class.java)
    }

    @Bean
    fun send(): Supplier<Flux<Message<*>>> {
        return Supplier {
            processor
        }
    }
}