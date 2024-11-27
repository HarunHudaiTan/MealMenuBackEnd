package com.task.mealMenuProject.dto;

import com.task.mealMenuProject.model.Ingredient;
import org.springframework.stereotype.Component;

@Component
public class IngredientDtoConverter {
private final MealOptionDtoConverter converter;

public IngredientDtoConverter(MealOptionDtoConverter mealOptionDtoConverter) {
    this.converter = mealOptionDtoConverter;
}

public IngredientDto convert (Ingredient from) {
    return new IngredientDto(from.getName(),from.getQuality(),from.getQuality().getScore()
    );
}
public String convertToString (Ingredient from ) {
    return new String(from.getName());
}
}
