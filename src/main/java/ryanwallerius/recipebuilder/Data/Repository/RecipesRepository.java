package ryanwallerius.recipebuilder.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ryanwallerius.recipebuilder.Data.Entity.Recipes;

public interface RecipesRepository extends JpaRepository<Recipes, Integer> {
}