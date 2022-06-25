package com.moniquetrevisan.loggingconsumer.resources.messaging.consumer

import com.moniquetrevisan.loggingconsumer.application.config.MessageHandler
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class SampleConsumer {
    @Bean
    fun receive(): Consumer<String> {
        return Consumer<String> {
            MessageHandler.logger.info(it)
        }
    }
}