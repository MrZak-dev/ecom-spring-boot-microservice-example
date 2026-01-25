package com.funobile.customerservice

import com.funobile.customerservice.entities.Customer
import com.funobile.customerservice.repositories.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CustomerServiceApplication {
    @Bean
    fun start(repo: CustomerRepository) = CommandLineRunner {

        repo.save(Customer(name = "Alice", email = "alice@email.com"))
        repo.save(Customer(name = "Jack", email = "jack@email.com"))
        repo.save(Customer(name = "Bob", email = "bob@email.com"))

    }

}

fun main(args: Array<String>) {
    runApplication<CustomerServiceApplication>(*args)
}



