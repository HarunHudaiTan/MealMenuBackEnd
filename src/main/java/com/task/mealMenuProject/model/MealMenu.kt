package com.task.mealMenuProject.model

import jakarta.persistence.*

@Entity
@Table(name = "meal_menu")
data class MealMenu(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? ,
    val name: String?,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val ingredients: Set<Ingredient>?,

){
constructor(name: String?):this(
    null,
    name=name,
    null,

)

}
