package com.creditflow.user.adapters.out.repository.entity

import com.creditflow.user.application.core.domain.Consent
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
   val id: Long? = null,
   val dataProcessingConsent: Boolean,
   val creditAnalysisConsent: Boolean,
   val marketingConsent: Boolean
) {
    constructor(consent: Consent): this(
        dataProcessingConsent = consent.dataProcessingConsent,
        creditAnalysisConsent = consent.creditAnalysisConsent,
        marketingConsent = consent.marketingConsent
    )
}
