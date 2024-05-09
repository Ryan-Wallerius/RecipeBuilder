package ryanwallerius.recipebuilder.Data.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "MealPlanner", schema = "dbo")
public class MealPlanner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "AsOfWeek", columnDefinition = "DATE")
    private Date asOfWeek;

    @Column(name = "CreatedBy", columnDefinition = "VARCHAR(255)")
    private String createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME2")
    private LocalDateTime createDate;

    // Getters and setters
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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

}