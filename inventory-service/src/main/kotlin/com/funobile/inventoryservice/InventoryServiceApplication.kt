package com.funobile.inventoryservice

import com.funobile.inventoryservice.entities.Product
import com.funobile.inventoryservice.repositories.ProductRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.CrossOrigin
import java.util.UUID

@SpringBootApplication
@CrossOrigin("*")
class InventoryServiceApplication {
    @Bean
    fun start(repo: ProductRepository) = CommandLineRunner {

        repo.save(
            Product(
                id = UUID.randomUUID().toString(),
                name = "Laptop",
                price = 1500.0,
                quantity = 12,
                selected = true
            )

        )

        repo.save(
            Product(
                id = UUID.randomUUID().toString(),
                name = "Console",
                price = 500.0,
                quantity = 8,
                selected = false
            )

        )
    }
}

fun main(args: Array<String>) {
    runApplication<InventoryServiceApplication>(*args)
}
