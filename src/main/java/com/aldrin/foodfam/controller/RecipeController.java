/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.dto.RecipeRequest;
import com.aldrin.foodfam.model.recipe.Recipe;
import com.aldrin.foodfam.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ALDRIN
 */
@Controller
@RequestMapping("/recipe/")
public class RecipeController {
    
    @Autowired
    private RecipeRepository recipeRepository;
    
    @PostMapping("/add")
    public Recipe addRecipe(@RequestBody RecipeRequest request) {
        return recipeRepository.save(request.getRecipe());
    } 
    
    
}
