package ryanwallerius.recipebuilder.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;
import ryanwallerius.recipebuilder.Data.Repository.MealPlannerRepository;

import java.util.List;

@Service
public class MealPlannerService implements IMealPlannerService {
    private final MealPlannerRepository _repo;

    @Autowired
    public MealPlannerService(MealPlannerRepository repo) {
        _repo = repo;
    }

    public List<MealPlanner> getAllMeals() {
        return _repo.findAll();
    }
}