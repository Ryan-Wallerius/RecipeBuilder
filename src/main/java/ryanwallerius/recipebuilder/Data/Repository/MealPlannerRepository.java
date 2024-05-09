package ryanwallerius.recipebuilder.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;

@Repository
public interface MealPlannerRepository extends JpaRepository<MealPlanner, Long> {
}
