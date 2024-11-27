package com.task.mealMenuProject.repository;

import com.task.mealMenuProject.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
