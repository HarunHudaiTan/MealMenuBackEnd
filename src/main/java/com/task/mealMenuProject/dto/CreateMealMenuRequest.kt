package com.task.mealMenuProject.dto

import com.task.mealMenuProject.model.Ingredient

data class CreateMealMenuRequest(
    val id: Int?,
    val name: String?,
    val ingredients: Set<Ingredient>?,

)
