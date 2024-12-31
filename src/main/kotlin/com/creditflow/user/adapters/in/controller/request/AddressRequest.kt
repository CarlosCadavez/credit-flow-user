package com.creditflow.user.adapters.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty

data class AddressRequest(
        val street: String,
        val number: String,
        val city: String,
        @JsonProperty("postal_code")
        val postalCode: String,
        val country: String
)
