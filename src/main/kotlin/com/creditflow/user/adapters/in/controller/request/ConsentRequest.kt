package com.creditflow.user.adapters.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty

data class ConsentRequest(
        @JsonProperty("data_processing_consent")
        val dataProcessingConsent: Boolean,
        @JsonProperty("credit_analysis_consent")
        val creditAnalysisConsent: Boolean,
        @JsonProperty("marketing_consent")
        val marketingConsent: Boolean
)
