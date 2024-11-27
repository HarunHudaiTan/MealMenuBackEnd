package com.task.mealMenuProject.repository;

import com.task.mealMenuProject.model.MealOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealOptionRepository extends JpaRepository<MealOption, Integer> {
}
