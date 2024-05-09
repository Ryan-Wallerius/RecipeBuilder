package ryanwallerius.recipebuilder.Service;

import java.util.List;
import ryanwallerius.recipebuilder.Dto.MealPlannerDto;

public interface IMealPlannerService {
    List<MealPlannerDto> getAllMeals();
}
