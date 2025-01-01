package com.creditflow.user.adapters.`in`.controller.mapper

import com.creditflow.user.adapters.`in`.controller.request.CustomerRequest
import com.creditflow.user.application.core.domain.Address
import com.creditflow.user.application.core.domain.Consent
import com.creditflow.user.application.core.domain.Customer
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class CustomerMapper {

    fun toDomain(customerRequest: CustomerRequest): Customer {
        return Customer(
            clientId = UUID.randomUUID().toString(),
            firstName = customerRequest.firstName,
            lastName = customerRequest.lastName,
            email = customerRequest.email,
            phoneNumber = customerRequest.phoneNumber,
            nif = customerRequest.nif,
            address = Address(
                street = customerRequest.address.street,
                number = customerRequest.address.number,
                city = customerRequest.address.city,
                postalCode = customerRequest.address.postalCode,
                country = customerRequest.address.country
            ),
            dateOfBirth = customerRequest.dateOfBirth,
            consent = Consent(
                dataProcessingConsent = customerRequest.consent.dataProcessingConsent,
                creditAnalysisConsent = customerRequest.consent.creditAnalysisConsent,
                marketingConsent = customerRequest.consent.marketingConsent
            ),
            createdAt = customerRequest.createdAt
        )
    }
}