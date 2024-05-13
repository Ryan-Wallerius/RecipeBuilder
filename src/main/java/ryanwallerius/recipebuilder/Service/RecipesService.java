package ryanwallerius.recipebuilder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryanwallerius.recipebuilder.Data.Entity.Recipes;
import ryanwallerius.recipebuilder.Data.Repository.RecipesRepository;
import ryanwallerius.recipebuilder.Dto.*;

import java.util.List;
import java.util.stream.Collectors;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

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

    public Recipes convertRequestDtoToEntity(RecipesRequestDto requestDto) {
        Recipes recipe = new Recipes();

        recipe.setRecipeName(requestDto.getRecipeName());
        recipe.setDayOfWeek(requestDto.getDayOfWeek());
        recipe.setCreatedBy(requestDto.getCreatedBy());

        return recipe;
    }

    public List<RecipesDto> getAllRecipes() {
        List<Recipes> recipes = _repo.findAll();

        List<RecipesDto> recipesDtoList = recipes.stream()
                .map(x -> convertToDto(x))
                .collect(Collectors.toList());

        return recipesDtoList;
    }

    public RecipesDto getRecipeById(int id) {
        Recipes recipe = _repo.findById(id).orElseThrow();
        RecipesDto dto = convertToDto(recipe);

        return dto;
    }

    public UpdateResponseDto<RecipesDto> createRecipe(RequestDto<RecipesRequestDto> requestDto) {
        Recipes recipe = convertRequestDtoToEntity(requestDto.getData());

        Timestamp currentTimestamp = Timestamp.from(Instant.now());
        recipe.setCreatedDate(currentTimestamp);

        Recipes newRecipe = _repo.save(recipe);
        RecipesDto newDto = convertToDto(newRecipe);

        return new UpdateResponseDto<RecipesDto>(newDto, 1);
    }

    public UpdateResponseDto<RecipesDto> updateRecipe(int id, RequestDto<RecipesRequestDto> requestDto) {
        Optional<Recipes> recipeOpt = _repo.findById(id);
        if (recipeOpt.isEmpty())
            return new UpdateResponseDto<RecipesDto>();

        Timestamp currentTimestamp = Timestamp.from(Instant.now());

        Recipes recipe = recipeOpt.get();
        recipe.setRecipeName(requestDto.getData().getRecipeName());
        recipe.setDayOfWeek(requestDto.getData().getDayOfWeek());
        recipe.setCreatedBy(requestDto.getData().getCreatedBy());
        recipe.setCreatedDate(currentTimestamp);

        Recipes updatedRecipe = _repo.save(recipe);
        RecipesDto updatedDto = convertToDto(updatedRecipe);

        return new UpdateResponseDto<RecipesDto>(updatedDto, 1);
    }
}
