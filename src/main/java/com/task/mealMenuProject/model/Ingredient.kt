package com.task.mealMenuProject.model

import jakarta.persistence.*
@Table(name = "ingredient")
@Entity
data class Ingredient(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val name: String?,
    @ElementCollection
    val groups: Set<String>?,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val options:Set<MealOption>?,
    @Enumerated(EnumType.STRING)
    var quality: Quality?

)
enum class Quality(val score: Int?) {
    LOW(10),MEDIUM(20),HIGH(30)
}
