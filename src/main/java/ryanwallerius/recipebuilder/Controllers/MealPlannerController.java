package ryanwallerius.recipebuilder.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ryanwallerius.recipebuilder.Dto.MealPlannerDto;
import ryanwallerius.recipebuilder.Service.IMealPlannerService;

@RestController
public class MealPlannerController {
    private final IMealPlannerService _mealService;

    @Autowired
    public MealPlannerController(IMealPlannerService mealService) {
        _mealService = mealService;
    }

    @GetMapping("/api/mealplans")
    public List<MealPlannerDto> getMealPlansDto() {
        return _mealService.getAllMeals(); 
    }
}
