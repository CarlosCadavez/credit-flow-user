package com.creditflow.user.adapters.out

import com.creditflow.user.adapters.out.repository.CustomerRepository
import com.creditflow.user.adapters.out.repository.entity.CustomerEntity
import com.creditflow.user.application.core.domain.CreateCustomerNotification
import com.creditflow.user.application.core.domain.Customer
import com.creditflow.user.application.ports.out.CreateCustomerOutputPort
import com.creditflow.user.application.ports.out.SendNotificationOutputPort
import org.springframework.stereotype.Component

@Component
class CreateCustomerAdapter(
        private val customerRepository: CustomerRepository,
        private val sendNotificationOutputPort: SendNotificationOutputPort
): CreateCustomerOutputPort {

    override fun create(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
        sendNotificationOutputPort.send(CreateCustomerNotification(customer))
    }
}