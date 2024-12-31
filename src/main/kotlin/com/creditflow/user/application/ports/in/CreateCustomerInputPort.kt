package com.creditflow.user.application.ports.`in`

import com.creditflow.user.application.core.domain.Customer

interface CreateCustomerInputPort {

    fun createCustomer(customer: Customer)
}