package com.funobile.customerservice.config

import com.funobile.customerservice.entities.Customer
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class RestRepositoryConfig : RepositoryRestConfigurer{
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration, cors: CorsRegistry) {
       config.exposeIdsFor(Customer::class.java)
    }
}