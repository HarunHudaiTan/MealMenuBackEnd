package com.task.mealMenuProject.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "meal_options")
@Entity
data class MealOption(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val name: String?,
    val quality: String?,
    val price: Double?,
    val perAmount:String= "kilogram",
)

