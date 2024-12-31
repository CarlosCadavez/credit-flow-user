package com.creditflow.user.application.core.usecases

import com.creditflow.user.application.core.domain.Customer
import com.creditflow.user.application.ports.`in`.CreateCustomerInputPort
import com.creditflow.user.application.ports.out.CreateCustomerOutputPort

class CreateCustomerUseCase(
        private val customerOutputPort: CreateCustomerOutputPort
): CreateCustomerInputPort {

    override fun createCustomer(customer: Customer) {
        customerOutputPort.create(customer)
    }
}