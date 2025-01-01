package com.creditflow.user.adapters.`in`.controller

import com.creditflow.user.adapters.`in`.controller.mapper.CustomerMapper
import com.creditflow.user.adapters.`in`.controller.request.CustomerRequest
import com.creditflow.user.application.ports.`in`.CreateCustomerInputPort
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/customers")
class CustomerController(
    private val customerInputPort: CreateCustomerInputPort,
    private val customerMapper: CustomerMapper
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customerRequest: CustomerRequest) {
        val customer = customerMapper.toDomain(customerRequest)
        customerInputPort.createCustomer(customer)
    }
}