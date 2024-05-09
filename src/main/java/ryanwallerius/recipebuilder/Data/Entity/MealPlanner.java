package ryanwallerius.recipebuilder.Data.Entity;

import java.sql.Date;
import java.sql.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "[MealPlanner]")
public class MealPlanner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "INT")
    private Integer id;

    @Column(name = "AsOfWeek", columnDefinition = "DATE")
    private Date asOfWeek;

    @Column(name = "CreatedBy", columnDefinition = "VARCHAR(255)")
    private String createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME2")
    private Timestamp createDate;

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

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

}