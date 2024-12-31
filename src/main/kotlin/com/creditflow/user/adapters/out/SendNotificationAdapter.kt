package com.creditflow.user.adapters.out

import com.creditflow.user.application.core.domain.CreateCustomerNotification
import com.creditflow.user.application.ports.out.SendNotificationOutputPort
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class SendNotificationAdapter(
        private val kafkaTemplate: KafkaTemplate<String, CreateCustomerNotification>
): SendNotificationOutputPort {

    override fun send(createCustomerNotification: CreateCustomerNotification) {
        kafkaTemplate.send("customer-created", createCustomerNotification)
    }
}