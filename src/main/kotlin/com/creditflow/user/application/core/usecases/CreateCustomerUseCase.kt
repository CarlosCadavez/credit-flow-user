package com.creditflow.user.application.core.usecases

import com.creditflow.user.application.core.domain.Customer
import com.creditflow.user.application.ports.out.CustomerOutputPort

class CreateCustomerUseCase(
        private val customerOutputPort: CustomerOutputPort
) {
    fun create(customer: Customer) {
        customerOutputPort.insert(customer)
    }
}