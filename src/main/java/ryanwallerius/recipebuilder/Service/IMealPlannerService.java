package ryanwallerius.recipebuilder.Service;

import java.util.List;
import ryanwallerius.recipebuilder.Dto.MealPlannerDto;
import ryanwallerius.recipebuilder.Dto.MealPlannerRequestDto;
import ryanwallerius.recipebuilder.Dto.RequestDto;
import ryanwallerius.recipebuilder.Dto.UpdateResponseDto;

public interface IMealPlannerService {
    List<MealPlannerDto> getAllMeals();
    MealPlannerDto getMealPlanById(int id);
    UpdateResponseDto<MealPlannerDto> createMealPlan(RequestDto<MealPlannerRequestDto> requestDto);
    UpdateResponseDto<MealPlannerDto> updateMealPlan(int id, RequestDto<MealPlannerRequestDto> requestDto);
}
