package ryanwallerius.recipebuilder.Data.Entity;

import java.sql.Date;
import java.sql.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "[MealPlanner]")
public class MealPlanner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MealPlannerID", columnDefinition = "INT")
    private Integer mealPlannerId;

    @Column(name = "AsOfWeek", columnDefinition = "DATE")
    private Date asOfWeek;

    @Column(name = "CreatedBy", columnDefinition = "VARCHAR(255)")
    private String createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME2")
    private Timestamp createdDate;

    // Getters and setters
    public Integer getMealPlannerId() {
        return mealPlannerId;
    }

    public void setMealPlannerId(Integer mealPlannerId) {
        this.mealPlannerId = mealPlannerId;
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

    public void setCreatedDate(Timestamp createDate) {
        this.createdDate = createDate;
    }

}