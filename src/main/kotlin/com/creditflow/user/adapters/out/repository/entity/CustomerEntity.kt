package com.creditflow.user.adapters.out.repository.entity

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "customer")
data class CustomerEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        val clientId: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val phoneNumber: String,
        val nif: String,
        //val address: AddressEntity,
        val dateOfBirth: Instant,
        //val consent: ConsentEntity,
        val createdAt: Instant
)
