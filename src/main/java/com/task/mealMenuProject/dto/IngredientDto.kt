package com.task.mealMenuProject.dto

import com.task.mealMenuProject.model.Quality


data class IngredientDto(
    val name: String?,
    val quality:Quality?,
    val qualityScore:Int?,

)
