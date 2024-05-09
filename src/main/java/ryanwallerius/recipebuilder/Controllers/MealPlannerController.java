package ryanwallerius.recipebuilder.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;
import ryanwallerius.recipebuilder.Service.IMealPlannerService;

@RestController
public class MealPlannerController {
    private final IMealPlannerService _repo;

    @Autowired
    public MealPlannerController(IMealPlannerService repo) {
        _repo = repo;
    }

    @GetMapping("/api/MealPlans")
    public List<MealPlanner> getRecipes() {
        return _repo.getAllMeals();
    }
}
