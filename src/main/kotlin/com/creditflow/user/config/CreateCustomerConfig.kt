package com.creditflow.user.config

import com.creditflow.user.adapters.out.CreateCustomerAdapter
import com.creditflow.user.application.core.usecases.CreateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CreateCustomerConfig {

    @Bean
    fun createCustomer(
        createCustomerAdapter: CreateCustomerAdapter
    ) = CreateCustomerUseCase(createCustomerAdapter)
}