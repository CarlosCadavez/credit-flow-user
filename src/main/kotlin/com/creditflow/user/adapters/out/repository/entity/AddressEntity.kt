package com.creditflow.user.adapters.out.repository.entity

import com.creditflow.user.application.core.domain.Address
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "address")
data class AddressEntity(
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   val id: Long? = null,
   val street: String,
   val number: String,
   val city: String,
   val postalCode: String,
   val country: String
) {
    constructor(address: Address): this(
        street = address.street,
        number = address.number,
        city = address.city,
        postalCode = address.postalCode,
        country = address.country
    )
}