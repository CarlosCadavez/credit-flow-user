package com.creditflow.user.application.core.domain

data class Consent(
        val id: String? = null,
        val dataProcessingConsent: Boolean,
        val creditAnalysisConsent: Boolean,
        val marketingConsent: Boolean

)
