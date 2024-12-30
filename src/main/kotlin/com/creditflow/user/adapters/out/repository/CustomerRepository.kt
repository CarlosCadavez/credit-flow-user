package com.creditflow.user.adapters.out.repository

import com.creditflow.user.adapters.out.repository.entity.CustomerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerEntity, Long> {
}