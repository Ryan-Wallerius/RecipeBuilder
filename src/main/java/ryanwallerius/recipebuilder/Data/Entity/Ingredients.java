package ryanwallerius.recipebuilder.Data.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "[Ingredients]")
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IngredientID")
    private Integer ingredientId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private String quantity;

    @Column(name = "Unit")
    private String unit;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_id", referencedColumnName = "RecipeID")
    private List<Recipes> recipe;*/ 

    // Getters and Setters
    public Integer getId() {
        return ingredientId;
    }

    public void setId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    /*public List<Recipes> getRecipe() {
        return recipe;
    }

    public void setRecipe(List<Recipes> recipe) {
        this.recipe = recipe;
    }*/ 
}
