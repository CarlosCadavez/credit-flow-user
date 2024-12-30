package com.creditflow.user.application.core.domain

import java.time.Instant

data class Customer(
        val clientId: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val phoneNumber: String,
        val nif: String,
        val address: Address,
        val dateOfBirth: Instant,
        val consent: Consent,
        val createdAt: Instant
)
