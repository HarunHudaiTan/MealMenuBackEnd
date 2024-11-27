package com.task.mealMenuProject.dto;

import com.task.mealMenuProject.model.MealOption;
import org.springframework.stereotype.Component;

@Component
public class MealOptionDtoConverter {

    public MealOptionDto convert (MealOption from){
        return new MealOptionDto(from.getName(),
                from.getQuality(), from.getPrice(), from.getPerAmount());
    }
}
