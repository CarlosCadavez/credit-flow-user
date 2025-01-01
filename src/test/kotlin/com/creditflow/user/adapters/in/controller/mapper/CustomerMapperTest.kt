package com.creditflow.user.adapters.`in`.controller.mapper

import com.creditflow.user.adapters.`in`.controller.request.AddressRequest
import com.creditflow.user.adapters.`in`.controller.request.ConsentRequest
import com.creditflow.user.adapters.`in`.controller.request.CustomerRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.time.Instant
import java.time.LocalDate

class CustomerMapperTest {

    private val customerMapper = CustomerMapper()

    @Test
    fun `when method to domain is called then should setted clientId`() {
        val customerRequest = createFakeCustomerRequest()
        val customer = customerMapper.toDomain(customerRequest)

        assertNotNull(customer.clientId)
    }

    @Test
    fun `when method to domain is called then matching fields`() {
        val customerRequest = createFakeCustomerRequest()
        val customer = customerMapper.toDomain(customerRequest)

        assertEquals(customerRequest.firstName, customer.firstName)
        assertEquals(customerRequest.lastName, customer.lastName)

    }

    private fun createFakeCustomerRequest(): CustomerRequest {
        return CustomerRequest(
            firstName = "John",
            lastName = "Doe",
            email = "john.doe@example.com",
            phoneNumber = "+351123456789",
            nif = "123456789",
            address = AddressRequest(
                street = "123 Fake Street",
                number = "123",
                city = "Faketown",
                postalCode = "1234-567",
                country = "Portugal"
            ),
            dateOfBirth = LocalDate.of(1990, 1, 1),
            consent = ConsentRequest(
                dataProcessingConsent = true,
                creditAnalysisConsent = true,
                marketingConsent = true
            ),
            createdAt = Instant.now()
        )
    }

}