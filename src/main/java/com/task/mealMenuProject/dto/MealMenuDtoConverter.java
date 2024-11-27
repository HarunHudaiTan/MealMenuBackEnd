package com.task.mealMenuProject.dto;

import com.task.mealMenuProject.model.MealMenu;
import org.springframework.stereotype.Component;

@Component
public class MealMenuDtoConverter {

    private final IngredientDtoConverter converter;
    public MealMenuDtoConverter(IngredientDtoConverter ingredientDtoConverter) {
        this.converter = ingredientDtoConverter;
    }

    public MealMenuDto convert(MealMenu from) {
        return new MealMenuDto(from.getId(),from.getName()
        );
    }
}
