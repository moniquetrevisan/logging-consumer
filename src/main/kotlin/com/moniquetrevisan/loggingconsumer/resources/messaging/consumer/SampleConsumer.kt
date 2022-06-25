package com.moniquetrevisan.loggingconsumer.resources.messaging.consumer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class SampleConsumer {
    @Bean
    fun receive(): Consumer<String> {
        return Consumer<String> {
            logger.info("Message received: $it")
        }
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(SampleConsumer::class.java)
    }
}