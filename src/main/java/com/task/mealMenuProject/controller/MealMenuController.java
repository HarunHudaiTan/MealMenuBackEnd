package com.task.mealMenuProject.controller;

import com.task.mealMenuProject.dto.CreateMealMenuRequest;
import com.task.mealMenuProject.dto.MealMenuDto;
import com.task.mealMenuProject.model.MealMenu;
import com.task.mealMenuProject.service.MealMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MealMenuController {
    private final MealMenuService mealMenuService;

    public MealMenuController(MealMenuService mealMenuService) {
        this.mealMenuService = mealMenuService;
    }
    @PostMapping("/mealMenu")
   public ResponseEntity<MealMenuDto> createMealMenu(@RequestBody CreateMealMenuRequest request){
    return  ResponseEntity.ok(mealMenuService.createMealMenu(request));
    }
    @GetMapping("/listMeals")
    public ResponseEntity <List<MealMenuDto>> listMeals(){
        return ResponseEntity.ok(mealMenuService.listMeals());
    }
    @GetMapping("/getMeal/{mealId}")
    public ResponseEntity<MealMenu> getMealById(@PathVariable("mealId") Integer mealId) {
        return ResponseEntity.ok(mealMenuService.getMealById(mealId));
    }
//    @PostMapping ("/quality")
//    public ResponseEntity<IngredientDto> setIngredientQuality(@RequestBody SetIngredientQualityRequest request){
//        return ResponseEntity.ok(mealMenuService.setIngredientQuality(request));
//    }

    }

