package ryanwallerius.recipebuilder.Dto;

import java.sql.Timestamp;

public class RecipesDto {
    private Integer recipesId;
    private String recipeName;
    private String dayOfWeek;
    private String createdBy;
    private Timestamp createdDate; 

    // Getters and Setters
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
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp timestamp) {
        this.createdDate = timestamp;
    }
}
