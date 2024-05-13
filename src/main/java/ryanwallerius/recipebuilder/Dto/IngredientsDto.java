package ryanwallerius.recipebuilder.Dto;

import java.util.List;

import ryanwallerius.recipebuilder.Data.Entity.Recipes;

public class IngredientsDto {
    private Integer ingredientId;
    private String ingredientName;
    private String quantity; 
    private String unit;
    private Recipes recipes;

    public Integer getId() {
        return ingredientId;
    }

    public void setId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /*public Recipes getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipes> list) {
        this.recipes = list;
    }*/ 
}
