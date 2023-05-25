/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model.recipe;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ALDRIN
 */
@Setter
@Getter
@ToString
@Entity
public class Recipe {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //this is int from api
    public Long id;
    public String title;
//    @Lob
//    @Column(length = 16777214,nullable = true)
//    private byte[] image;
    @Column(name = "imageType",nullable = true)
    public String imageType;
    public Integer usedIngredientCount;
    public Integer missedIngredientCount;
    
//    @OneToMany(cascade = {CascadeType.PERSIST}, targetEntity = MissedIngredient.class)
//    @JoinColumn(name = "missedIngredient", referencedColumnName = "id")
//    public List<MissedIngredient> missedIngredients;
//    
//    @OneToMany(cascade = {CascadeType.PERSIST}, targetEntity = UsedIngredient.class)
//    @JoinColumn(name = "usedIngredient", referencedColumnName = "id")
//    public List<UsedIngredient> usedIngredients;
//    
//    public List<Object> unusedIngredients;
    public int likes;
    
    
//        "id": "640352",
//        "title": "Cranberry Apple Crisp",
//        "image": "https://spoonacular.com/recipeImages/640352-312x231.jpg",
//        "imageType": "jpg",
//        "usedIngredientCount": "1",
//        "missedIngredientCount": "3",
//        "missedIngredients": "[object Object],[object Object],[object Object]",
//        "usedIngredients": "[object Object]",
//        "unusedIngredients": "",
//        "likes": "11"
}
