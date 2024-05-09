package ryanwallerius.recipebuilder.Service;

import java.util.List;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;

public interface IMealPlannerService {
    List<MealPlanner> getAllMeals();
}
