package com.aldrin.foodfam.controller;



import com.aldrin.foodfam.dto.RecipeRequest;
import com.aldrin.foodfam.exception.ResourceNotFoundException;
import com.aldrin.foodfam.model.recipe.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.aldrin.foodfam.repository.RecipeRepository;

@RestController
public class RecipeController {
    @Autowired
    private RecipeRepository authorRepository;

    @PostMapping("/recipe/addRecipe")
    public Recipe addAuthor(@RequestBody RecipeRequest request) {
        return authorRepository.save(request.getRecipe());
    }
    
    
    
    
    
    
    
    
    
    

    @PutMapping("/author/{id}")
    public Recipe updateAuthor(@PathVariable(value = "id") Integer id, @RequestBody RecipeRequest request) {
        return authorRepository.findById(id).map(author -> {
            author.setTitle(request.getRecipe().getTitle());
            author.setUsedIngredients(request.getRecipe().getUsedIngredients());
            return authorRepository.save(author);
        }).orElseThrow(() -> new ResourceNotFoundException("Author with id : " + id + " not found"));
    }

    @GetMapping("/author")
    public List<Recipe> findAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/author/{id}")
    public ResponseEntity getAuthorById(@PathVariable(value = "id") Integer id) {
        return authorRepository.findById(id).map(author ->
                ResponseEntity.ok(author)).orElseThrow(() ->
                new ResourceNotFoundException("Author with id : " + id + " not found")
        );
    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable(value = "id") Integer id) {
        return authorRepository.findById(id).map(author -> {
            authorRepository.delete(author);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Author with id : " + id + " not found"));
    }
}
