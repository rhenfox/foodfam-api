/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service.impl;

import com.aldrin.foodfam.model.recipe.Recipe;
import com.aldrin.foodfam.repository.RecipeRepository;
import com.aldrin.foodfam.service.RecipeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ALDRIN
 */
@Service
public class RecipeServiceImpl implements RecipeService {
    
    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getRecipeList() {
        return recipeRepository.findAll();
    }

}
