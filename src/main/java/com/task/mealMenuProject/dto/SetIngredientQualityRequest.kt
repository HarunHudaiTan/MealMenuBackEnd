package com.task.mealMenuProject.dto

import jakarta.validation.constraints.NotBlank

data class SetIngredientQualityRequest (
  @field:NotBlank
  val mealId: Int,
  @field:NotBlank
  val ingredient: IngredientDto,

)
