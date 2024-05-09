package ryanwallerius.recipebuilder.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ryanwallerius.recipebuilder.Dto.RecipesDto;
import ryanwallerius.recipebuilder.Service.RecipesService;

@RestController
public class RecipesController {
    private final RecipesService _recipeService;

    @Autowired
    public RecipesController(RecipesService recipeService) {
        _recipeService = recipeService;
    }

    @GetMapping("/api/recipes")
    public List<RecipesDto> getAllRecipes() {
        List<RecipesDto> recipes = _recipeService.getAllRecipes();
        
        return recipes;
    }
}
