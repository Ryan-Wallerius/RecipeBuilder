package ryanwallerius.recipebuilder.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ryanwallerius.recipebuilder.Dto.*;
import ryanwallerius.recipebuilder.Service.RecipesService;
import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipesController {
    private final RecipesService _recipeService;

    @Autowired
    public RecipesController(RecipesService recipeService) {
        _recipeService = recipeService;
    }

    @GetMapping("")
    public List<RecipesDto> getAllRecipes() throws Exception {
        List<RecipesDto> recipes = _recipeService.getAllRecipes();

        return recipes;
    }

    @GetMapping("/{id}")
    public RecipesDto getRecipeById(@PathVariable int id) throws Exception {
        RecipesDto recipe = _recipeService.getRecipeById(id);

        return recipe;
    }

    @PostMapping("")
    public UpdateResponseDto<RecipesDto> createRecipe(@RequestBody RequestDto<RecipesRequestDto> recipeDto)
            throws Exception {
        return _recipeService.createRecipe(recipeDto);
    }

    @PutMapping("/{id}")
    public UpdateResponseDto<RecipesDto> updateRecipe(@PathVariable("id") int id,
            @RequestBody RequestDto<RecipesRequestDto> recipeDto) throws Exception {
        return _recipeService.updateRecipe(id, recipeDto);
    }
}
