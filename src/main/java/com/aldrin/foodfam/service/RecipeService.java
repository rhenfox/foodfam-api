/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.foodfam.service;

import com.aldrin.foodfam.model.recipe.Recipe;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ALDRIN
 */

@Service
public interface RecipeService {
    public List<Recipe> getRecipeList();
}
