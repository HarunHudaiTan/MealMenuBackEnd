package com.task.mealMenuProject.repository;

import com.task.mealMenuProject.model.MealMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealMenuRepository extends JpaRepository<MealMenu, Integer> {
}
