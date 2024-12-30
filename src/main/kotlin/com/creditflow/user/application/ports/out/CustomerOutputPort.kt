package com.creditflow.user.application.ports.out

import com.creditflow.user.application.core.domain.Customer

interface CustomerOutputPort {
    fun insert(customer: Customer)
}