package com.aldrin.foodfam.model.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UsedIngredient  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usedIngredientId;
    private int id;
    public double amount;
    public String unit;
    public String unitLong;
    public String unitShort;
    public String aisle;
    public String name;
    public String original;
    public String originalName;
    public List<String> meta;
    public String image;
    
}
