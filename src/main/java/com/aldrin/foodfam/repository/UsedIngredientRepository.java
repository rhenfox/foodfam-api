package com.aldrin.foodfam.repository;


import com.aldrin.foodfam.model.recipe.UsedIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedIngredientRepository extends JpaRepository<UsedIngredient,Integer> {
}
