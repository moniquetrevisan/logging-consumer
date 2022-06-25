package com.moniquetrevisan.loggingconsumer.resources.messaging.consumers

import com.moniquetrevisan.loggingconsumer.MessageHandler
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