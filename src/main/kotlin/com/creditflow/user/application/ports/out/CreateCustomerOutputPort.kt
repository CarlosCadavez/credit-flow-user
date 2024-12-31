package com.creditflow.user.application.ports.out

import com.creditflow.user.application.core.domain.Customer

interface CreateCustomerOutputPort {
    fun create(customer: Customer)
}