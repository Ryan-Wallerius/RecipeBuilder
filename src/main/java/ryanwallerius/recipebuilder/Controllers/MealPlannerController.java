package ryanwallerius.recipebuilder.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*; 
import org.springframework.beans.factory.annotation.Autowired;
import ryanwallerius.recipebuilder.Dto.MealPlannerDto;
import ryanwallerius.recipebuilder.Dto.MealPlannerRequestDto;
import ryanwallerius.recipebuilder.Dto.RequestDto;
import ryanwallerius.recipebuilder.Dto.UpdateResponseDto;
import ryanwallerius.recipebuilder.Service.IMealPlannerService;

@RestController
@RequestMapping("/api/mealplans")
public class MealPlannerController {
    private final IMealPlannerService _mealService;

    @Autowired
    public MealPlannerController(IMealPlannerService mealService) {
        _mealService = mealService;
    }

    @GetMapping("")
    public List<MealPlannerDto> getMealPlansDto() throws Exception {
        return _mealService.getAllMeals(); 
    }

    @GetMapping("/{id}")
    public MealPlannerDto getMealPlanById(@PathVariable int id) throws Exception {
        return _mealService.getMealPlanById(id);
    }

    @PostMapping("")
    public UpdateResponseDto<MealPlannerDto> createMealPlan(@RequestBody RequestDto<MealPlannerRequestDto> mealPlanDto) throws Exception {
        return _mealService.createMealPlan(mealPlanDto);
    }
}
