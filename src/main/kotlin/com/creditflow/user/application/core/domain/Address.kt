package com.creditflow.user.application.core.domain

data class Address(
        val id: String? = null,
        val street: String,
        val number: String,
        val city: String,
        val postalCode: String,
        val country: String
)
