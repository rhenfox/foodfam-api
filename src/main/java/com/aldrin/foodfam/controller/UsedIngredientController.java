package com.aldrin.foodfam.controller;


import com.aldrin.foodfam.model.recipe.UsedIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.aldrin.foodfam.repository.UsedIngredientRepository;

@RestController
public class UsedIngredientController {
    @Autowired
    private UsedIngredientRepository bookRepository;

    @GetMapping("/book")
    public List<UsedIngredient> findAllBooks() {
        return bookRepository.findAll();
    }
}
