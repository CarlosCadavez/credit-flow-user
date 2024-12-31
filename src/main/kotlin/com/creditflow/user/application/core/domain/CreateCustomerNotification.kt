package com.creditflow.user.application.core.domain

data class CreateCustomerNotification(
        val clientId: String = "",
        val name: String = "",
        val email: String = "",
) {
    constructor(customer: Customer): this(
            clientId = customer.clientId,
            name = "${customer.firstName} ${customer.lastName}",
            email = customer.email
    )
}
