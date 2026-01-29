package com.funobile.gatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GatewayServiceApplication {
    @Bean
    fun locator(
        client: ReactiveDiscoveryClient,
        properties: DiscoveryLocatorProperties
    ): DiscoveryClientRouteDefinitionLocator {
        return DiscoveryClientRouteDefinitionLocator(client, properties)
    }
}

fun main(args: Array<String>) {
    runApplication<GatewayServiceApplication>(*args)
}
