package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.dto.RecipeRequest;
import com.aldrin.foodfam.model.recipe.Recipe;
import com.aldrin.foodfam.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/recipe/")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

//    @PostMapping("/recipe/addRecipe")
    @PostMapping("/addRecipe")
    public Recipe addAuthor(@RequestBody RecipeRequest request) {
        return recipeRepository.save(request.getRecipe());
    }

//// http://localhost:8080/recipe/findByIngredients?ingredients=Cranberry Apple Crisp
//    @GetMapping("/recipe/findByIngredients")
//    public List<Recipe> findRecipeByName(@RequestParam List<Recipe> ingredients) {
//        List<Recipe> result = new ArrayList<>();
//        for (Recipe recipe : recipeRepository.findAll()) {
//            if (ingredients.contains(recipe.getTitle())) {
//                result.add(recipe);
//            }
//        }
//        return result;
//    }

// http://localhost:8080/recipe/findByIngredients?ingredients=Tomato,+Potato,+Eggplant,+Beef
    @GetMapping("/findByIngredients")
    public List<Recipe> findByIngredients(@RequestParam List<String> ingredients) {
        List<Recipe> result = new ArrayList<>();
        for (String keyword : ingredients) {
            for (Recipe recipe : recipeRepository.findByTitleContaining(keyword)) {
                result.add(recipe);
            }
        }
        return result;
    }

}
