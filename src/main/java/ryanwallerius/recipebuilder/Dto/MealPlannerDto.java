package ryanwallerius.recipebuilder.Dto;

import java.sql.Date;
import java.sql.Timestamp;

public class MealPlannerDto {
    private Integer id;
    private Date asOfWeek;
    private String createdBy;
    private Timestamp createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAsOfWeek() {
        return asOfWeek;
    }

    public void setAsOfWeek(Date asOfWeek) {
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
