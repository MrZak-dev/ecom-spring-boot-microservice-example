package com.funobile.inventoryservice.repositories

import com.funobile.inventoryservice.entities.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ProductRepository : JpaRepository<Product, String>