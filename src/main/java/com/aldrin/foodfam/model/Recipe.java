/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ALDRIN
 */
//@Setter
//@Getter
//@ToString
//@Entity
public class Recipe {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String title;
    public String image;
    public String imageType;
    public int usedIngredientCount;
    public int missedIngredientCount;
    public ArrayList<MissedIngredient> missedIngredients;
    public List<UsedIngredient> usedIngredients;
    public ArrayList<Object> unusedIngredients;
    public int likes;
}
