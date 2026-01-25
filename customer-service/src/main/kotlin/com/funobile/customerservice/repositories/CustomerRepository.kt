package com.funobile.customerservice.repositories

import com.funobile.customerservice.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface CustomerRepository : JpaRepository<Customer, Long>