package com.creditflow.user.adapters.out.repository.entity

import com.creditflow.user.application.core.domain.Customer
import jakarta.persistence.*
import java.time.Instant
import java.time.LocalDate

@Entity
@Table(name = "customer")
data class CustomerEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,
        val clientId: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val phoneNumber: String,
        val nif: String,
        @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
        @JoinColumn(name = "address_id")
        val address: AddressEntity,
        val dateOfBirth: LocalDate,
        @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
        @JoinColumn(name = "consent_id")
        val consent: ConsentEntity,
        val createdAt: Instant
) {
        constructor(customer: Customer): this(
                clientId = customer.clientId,
                firstName = customer.firstName,
                lastName = customer.lastName,
                email = customer.email,
                phoneNumber = customer.phoneNumber,
                nif = customer.nif,
                address = AddressEntity(customer.address),
                dateOfBirth = customer.dateOfBirth,
                consent = ConsentEntity(customer.consent),
                createdAt = customer.createdAt
        )
}
