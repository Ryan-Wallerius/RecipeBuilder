package ryanwallerius.recipebuilder.Service;

import java.util.List;
import ryanwallerius.recipebuilder.Dto.*;

public interface IRecipesService {
    List<RecipesDto> getAllRecipes();
    RecipesDto getRecipeById(int id);
    UpdateResponseDto<RecipesDto> createRecipe(RequestDto<RecipesRequestDto> requestDto);
    UpdateResponseDto<RecipesDto> updateRecipe(int id, RequestDto<RecipesRequestDto> requestDto);
}
