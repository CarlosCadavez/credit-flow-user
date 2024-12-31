package com.creditflow.user.adapters.`in`.controller

import com.creditflow.user.adapters.`in`.controller.request.CustomerRequest
import com.creditflow.user.application.core.domain.Address
import com.creditflow.user.application.core.domain.Consent
import com.creditflow.user.application.core.domain.Customer
import com.creditflow.user.application.ports.`in`.CreateCustomerInputPort
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("api/v1/customers")
class CustomerController(
        private val customerInputPort: CreateCustomerInputPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customerRequest: CustomerRequest) {
        with(customerRequest) {
            val customer = Customer(
                    clientId = UUID.randomUUID().toString(),
                    firstName = firstName,
                    lastName = lastName,
                    email = email,
                    phoneNumber = phoneNumber,
                    nif = nif,
                    address = Address(
                            street = address.street,
                            number = address.number,
                            city = address.city,
                            postalCode = address.postalCode,
                            country = address.country
                    ),
                    dateOfBirth = dateOfBirth,
                    consent = Consent(
                            dataProcessingConsent = consent.dataProcessingConsent,
                            creditAnalysisConsent = consent.creditAnalysisConsent,
                            marketingConsent = consent.marketingConsent
                    ),
                    createdAt = createdAt
            )
            customerInputPort.createCustomer(customer)
        }
    }
}