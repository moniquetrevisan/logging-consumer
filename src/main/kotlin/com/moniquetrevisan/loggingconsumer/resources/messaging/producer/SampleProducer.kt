package com.moniquetrevisan.loggingconsumer.resources.messaging.producer

import org.springframework.context.annotation.Bean
import org.springframework.messaging.Message
import org.springframework.stereotype.Component
import reactor.core.publisher.EmitterProcessor
import reactor.core.publisher.Flux
import java.util.function.Supplier

@Component
class SampleProducer {

    @Bean
    fun send(): Supplier<Flux<Message<*>>> {
        return Supplier {
            processor
        }
    }

    companion object {
        val processor: EmitterProcessor<Message<*>> = EmitterProcessor.create()
    }
}