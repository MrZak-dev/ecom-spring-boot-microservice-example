package com.funobile.inventoryservice.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Product(
    @Id
    var id: String,
    var name: String,
    var price: Double,
    var quantity: Int
)