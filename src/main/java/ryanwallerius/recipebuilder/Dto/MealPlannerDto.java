package ryanwallerius.recipebuilder.Dto;

import java.sql.Timestamp;

public class MealPlannerDto {
    private Integer mealPlannerId;
    private Timestamp asOfWeek;
    private String createdBy;
    private Timestamp createdDate;

    public Integer getMealPlannerId() {
        return mealPlannerId;
    }

    public void setMealPlannerId(Integer mealPlannerId) {
        this.mealPlannerId = mealPlannerId;
    }

    public Timestamp getAsOfWeek() {
        return asOfWeek;
    }

    public void setAsOfWeek(Timestamp asOfWeek) {
        this.asOfWeek = asOfWeek;
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

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}
