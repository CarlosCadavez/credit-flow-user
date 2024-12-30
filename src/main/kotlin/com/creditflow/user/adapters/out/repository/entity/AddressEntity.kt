package com.creditflow.user.adapters.out.repository.entity

import jakarta.persistence.*

@Entity
class AddressEntity(
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   val id: Long = -1,
   val street: String,
   val number: String,
   val city: String,
   val postalCode: String,
   val country: String
) {


}