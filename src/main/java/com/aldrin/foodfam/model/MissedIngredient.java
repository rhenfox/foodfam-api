/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ALDRIN
 */
//@Setter
//@Getter
//@ToString
//@Entity
public class MissedIngredient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public double amount;
    public String unit;
    public String unitLong;
    public String unitShort;
    public String aisle;
    public String name;
    public String original;
    public String originalName;
    public ArrayList<String> meta;
    public String image;
    public String extendedName;
}
