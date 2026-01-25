package com.funobile.customerservice.entities

import org.springframework.data.rest.core.config.Projection

@Projection(name = "all", types = [Customer::class])
interface CustomerProjection {
    fun getId(): Long
    fun getName(): String
    fun getEmail(): String
}