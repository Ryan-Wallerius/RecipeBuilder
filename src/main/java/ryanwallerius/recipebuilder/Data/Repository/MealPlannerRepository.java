package ryanwallerius.recipebuilder.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;

public interface MealPlannerRepository extends JpaRepository<MealPlanner, Integer> {
}
