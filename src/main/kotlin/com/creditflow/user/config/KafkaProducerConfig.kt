package com.creditflow.user.config

import com.creditflow.user.application.core.domain.CreateCustomerNotification
import org.apache.kafka.clients.producer.ProducerConfig.BOOTSTRAP_SERVERS_CONFIG
import org.apache.kafka.clients.producer.ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG
import org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory
import org.springframework.kafka.support.serializer.JsonSerializer

@Configuration
class KafkaProducerConfig {

    private val kafkaProducerProperties = mapOf(
            BOOTSTRAP_SERVERS_CONFIG to "localhost:9092",
            KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java,
            VALUE_SERIALIZER_CLASS_CONFIG to JsonSerializer::class.java
    )

    @Bean
    fun producerFactory(): ProducerFactory<String, CreateCustomerNotification> =
            DefaultKafkaProducerFactory(kafkaProducerProperties)

    @Bean
    fun kafkaTemplate(): KafkaTemplate<String, CreateCustomerNotification> =
            KafkaTemplate(producerFactory())
}