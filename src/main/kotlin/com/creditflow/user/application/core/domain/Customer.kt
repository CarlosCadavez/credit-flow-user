package com.creditflow.user.application.core.domain

import java.time.Instant
import java.time.LocalDate

data class Customer(
        val id: String? = null,
        val clientId: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val phoneNumber: String,
        val nif: String,
        val address: Address,
        val dateOfBirth: LocalDate,
        val consent: Consent,
        val createdAt: Instant
)
