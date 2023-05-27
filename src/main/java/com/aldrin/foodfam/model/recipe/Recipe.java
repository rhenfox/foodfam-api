package com.aldrin.foodfam.model.recipe;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Recipe  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int recipe_id;
    public int id;
    public String title;
    public String image;
    public String imageType;
    public int usedIngredientCount;
    public int missedIngredientCount;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, targetEntity = MissedIngredient.class)
    @JoinColumn(name = "recipeId", referencedColumnName = "id")
    public List<MissedIngredient> missedIngredients;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, targetEntity = UsedIngredient.class)
    @JoinColumn(name = "recipeId", referencedColumnName = "id")
    private List<UsedIngredient> usedIngredients;
    
    public List<Object> unusedIngredients;
    public int likes;

    
}


//{
//    "recipe": {
//        "id": 640352,
//        "title": "Cranberry Apple Crisp",
//        "image": "https://spoonacular.com/recipeImages/640352-312x231.jpg",
//        "imageType": "jpg",
//        "usedIngredientCount": 1,
//        "missedIngredientCount": 3,
//        "missedIngredients": [
//            {
//                "id": 9078,
//                "amount": 2.0,
//                "unit": "cups",
//                "unitLong": "cups",
//                "unitShort": "cup",
//                "aisle": "Produce",
//                "name": "cranberries",
//                "original": "2 cups fresh cranberries",
//                "originalName": "fresh cranberries",
//                "meta": [
//                    "fresh"
//                ],
//                "extendedName": "fresh cranberries",
//                "image": "https://spoonacular.com/cdn/ingredients_100x100/cranberries.jpg"
//            },
//            {
//                "id": 1145,
//                "amount": 4.0,
//                "unit": "Tbs",
//                "unitLong": "Tbs",
//                "unitShort": "Tbs",
//                "aisle": "Milk, Eggs, Other Dairy",
//                "name": "butter",
//                "original": "1/2 stick (4 Tbs) unsalted butter, cut into cubes",
//                "originalName": "1/2 stick unsalted butter, cut into cubes",
//                "meta": [
//                    "unsalted",
//                    "cut into cubes"
//                ],
//                "extendedName": "unsalted butter",
//                "image": "https://spoonacular.com/cdn/ingredients_100x100/butter-sliced.jpg"
//            },
//            {
//                "id": 8120,
//                "amount": 1.5,
//                "unit": "cups",
//                "unitLong": "cups",
//                "unitShort": "cup",
//                "aisle": "Cereal",
//                "name": "regular oats",
//                "original": "1 1/2 cups regular oats (not quick-cooking)",
//                "originalName": "regular oats (not quick-cooking)",
//                "meta": [
//                    "(not quick-cooking)"
//                ],
//                "image": "https://spoonacular.com/cdn/ingredients_100x100/rolled-oats.jpg"
//            }
//        ],
//        "usedIngredients": [
//            {
//                "id": 1089003,
//                "amount": 4.0,
//                "unit": "cups",
//                "unitLong": "cups",
//                "unitShort": "cup",
//                "aisle": "Produce",
//                "name": "granny smith apples",
//                "original": "4 cups Granny Smith apples, chopped into ½ inch chunks",
//                "originalName": "Granny Smith apples, chopped into ½ inch chunks",
//                "meta": [
//                    "chopped"
//                ],
//                "image": "https://spoonacular.com/cdn/ingredients_100x100/grannysmith-apple.png"
//            }
//        ],
//        "unusedIngredients": [],
//        "likes": 11
//    }
//}