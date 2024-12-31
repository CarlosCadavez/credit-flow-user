package com.creditflow.user.adapters.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant
import java.time.LocalDate

data class CustomerRequest(
        @JsonProperty("first_name")
        val firstName: String,
        @JsonProperty("last_name")
        val lastName: String,
        val email: String,
        @JsonProperty("phone_number")
        val phoneNumber: String,
        val nif: String,
        val address: AddressRequest,
        @JsonProperty("date_of_birth")
        val dateOfBirth: LocalDate,
        val consent: ConsentRequest,
        @JsonProperty("created_at")
        val createdAt: Instant
)
