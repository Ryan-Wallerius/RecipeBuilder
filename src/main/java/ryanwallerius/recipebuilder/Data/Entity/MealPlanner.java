package ryanwallerius.recipebuilder.Data.Entity;

import java.sql.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "[MealPlanner]")
public class MealPlanner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MealPlannerID")
    private Integer mealPlannerId;

    @Column(name = "AsOfWeek")
    private Timestamp asOfWeek;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private Timestamp createdDate;

    // Getters and setters
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

    public void setCreatedDate(Timestamp createDate) {
        this.createdDate = createDate;
    }

}