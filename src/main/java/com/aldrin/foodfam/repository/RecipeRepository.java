package com.aldrin.foodfam.repository;


import com.aldrin.foodfam.model.recipe.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

}
