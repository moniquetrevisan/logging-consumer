package com.moniquetrevisan.loggingconsumer.application.web.controller

import com.moniquetrevisan.loggingconsumer.resources.messaging.producer.SampleProducer
import org.springframework.http.ResponseEntity
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sendMessage")
class MessageController {

    @PostMapping
    fun sendMessage(@RequestBody body: String): ResponseEntity<Unit> {
        SampleProducer.processor.onNext(MessageBuilder.withPayload(body).build())
        return ResponseEntity.ok().build()
    }
}
