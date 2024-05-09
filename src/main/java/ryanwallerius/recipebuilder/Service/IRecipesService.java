package ryanwallerius.recipebuilder.Service;

import java.util.List;
import ryanwallerius.recipebuilder.Dto.RecipesDto;

public interface IRecipesService {
    List<RecipesDto> getAllRecipes();
}
