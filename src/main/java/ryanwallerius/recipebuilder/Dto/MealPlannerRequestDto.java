package ryanwallerius.recipebuilder.Dto;

import java.sql.Timestamp;

public class MealPlannerRequestDto {
    private Timestamp asOfWeek;
    private String createdBy;

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
}
