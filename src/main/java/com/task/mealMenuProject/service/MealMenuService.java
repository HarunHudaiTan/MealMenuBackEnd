package com.task.mealMenuProject.service;

import com.task.mealMenuProject.dto.*;
import com.task.mealMenuProject.exception.MealNotFoundException;
import com.task.mealMenuProject.model.Ingredient;
import com.task.mealMenuProject.model.MealMenu;
import com.task.mealMenuProject.model.Quality;
import com.task.mealMenuProject.repository.IngredientRepository;
import com.task.mealMenuProject.repository.MealMenuRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MealMenuService {
    private final MealMenuRepository mealMenuRepository;
    private  final IngredientDtoConverter ingredientDtoConverter;
    private final MealMenuDtoConverter mealMenuDtoConverter;
    private final IngredientRepository ingredientRepository;

    public MealMenuService(MealMenuRepository mealMenuRepository, IngredientDtoConverter ingredientDtoConverter, MealMenuDtoConverter mealMenuDtoConverter, IngredientRepository ingredientRepository) {
        this.mealMenuRepository = mealMenuRepository;
        this.ingredientDtoConverter = ingredientDtoConverter;
        this.mealMenuDtoConverter = mealMenuDtoConverter;
        this.ingredientRepository = ingredientRepository;
    }

    public MealMenuDto createMealMenu(CreateMealMenuRequest request){
     MealMenu mealMenu = new MealMenu(request.getName());

    return mealMenuDtoConverter.convert(mealMenuRepository.save(mealMenu));
    }

    public List <MealMenuDto> listMeals() {
   return mealMenuRepository.findAll().stream()
           .map(mealMenuDtoConverter::convert)
           .collect(Collectors.toList());
    }
    public MealMenu getMealById(Integer mealId){
        return mealMenuRepository.findById(mealId).orElseThrow(()->
                new MealNotFoundException("Meal Not found by id"));
    }


    public IngredientDto setIngredientQuality(SetIngredientQualityRequest request) {
        MealMenu mealMenu = getMealById(request.getMealId());

        Set<Ingredient> currentIngredients = mealMenu.getIngredients();

        IngredientDto ingredientDto = null;
      for(Ingredient currentIngredient : currentIngredients){

      if(currentIngredient.getName().equals
              (request.getIngredient().getName())&&
              request.getIngredient().getName()!=null){
          currentIngredient.setQuality(request.getIngredient().getQuality());
          if(currentIngredient.getQuality() == null){
              currentIngredient.setQuality(Quality.HIGH);
          }

        Ingredient savedIngredient=  ingredientRepository.save(currentIngredient);
          ingredientDto= ingredientDtoConverter.convert(savedIngredient);
      }


      }
    return ingredientDto;
    }


    }


