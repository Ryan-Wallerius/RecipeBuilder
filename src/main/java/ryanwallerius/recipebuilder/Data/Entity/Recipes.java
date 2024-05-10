package ryanwallerius.recipebuilder.Data.Entity;

import java.sql.Timestamp;
import jakarta.persistence.*;


@Entity
@Table(name = "[Recipes]")
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecipesID")
    private Integer recipesId;

    @Column(name = "RecipeName")
    private String recipeName;

    @Column(name = "DayOfWeek")
    private String dayOfWeek; 

    @Column(name = "CreatedBy")
    private String CreatedBy; 

    @Column(name = "CreatedDate")
    private Timestamp CreatedDate;

    // Getters and setters
    public Integer getRecipesId() {
        return recipesId;
    }

    public void setRecipesId(Integer recipesId) {
        this.recipesId = recipesId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        CreatedDate = createdDate;
    }
}