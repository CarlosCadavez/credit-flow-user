package com.creditflow.user.adapters.out.repository.entity

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table

@Entity
@Table(name = "consent")
data class ConsentEntity(
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   val id: Long = -1,
   val dataProcessingConsent: Boolean,
   val creditAnalysisConsent: Boolean,
   val marketingConsent: Boolean
)
