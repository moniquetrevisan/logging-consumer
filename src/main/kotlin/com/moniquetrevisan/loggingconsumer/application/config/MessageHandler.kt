package com.moniquetrevisan.loggingconsumer.application.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message
import reactor.core.publisher.EmitterProcessor

@Configuration
class MessageHandler {

    companion object {
        val processor: EmitterProcessor<Message<*>> = EmitterProcessor.create()
        val logger: Logger = LoggerFactory.getLogger(MessageHandler::class.java)
    }

}