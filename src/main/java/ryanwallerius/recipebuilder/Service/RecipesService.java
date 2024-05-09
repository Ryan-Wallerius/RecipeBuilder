package ryanwallerius.recipebuilder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryanwallerius.recipebuilder.Data.Entity.Recipes;
import ryanwallerius.recipebuilder.Data.Repository.RecipesRepository;
import ryanwallerius.recipebuilder.Dto.RecipesDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipesService implements IRecipesService {

    private final RecipesRepository _repo;

    @Autowired
    public RecipesService(RecipesRepository repo) {
        _repo = repo;
    }

    public RecipesDto convertToDto(Recipes recipe) {
        RecipesDto dto = new RecipesDto();
        dto.setRecipesId(recipe.getRecipesId());
        dto.setRecipeName(recipe.getRecipeName());
        dto.setDayOfWeek(recipe.getDayOfWeek());
        dto.setCreatedBy(recipe.getCreatedBy());
        dto.setCreatedDate(recipe.getCreatedDate());

        return dto;
    }

    public Recipes convertToEntity(RecipesDto dto) {
        Recipes recipe = new Recipes();
        recipe.setRecipesId(dto.getRecipesId());
        recipe.setRecipeName(dto.getRecipeName());
        recipe.setDayOfWeek(dto.getDayOfWeek());
        recipe.setCreatedBy(dto.getCreatedBy());
        recipe.setCreatedDate(dto.getCreatedDate());

        return recipe;
    }

    public List<RecipesDto> getAllRecipes() {
        List<Recipes> recipes = _repo.findAll();

        List<RecipesDto> recipesDtoList = recipes.stream()
                .map(x -> convertToDto(x))
                .collect(Collectors.toList());

        return recipesDtoList;
    }
}
