/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.foodfam.repository;

import com.aldrin.foodfam.model.recipe.Recipe;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALDRIN
 */
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
      List<Recipe> findByTitleContaining(String keyword);
    
}
