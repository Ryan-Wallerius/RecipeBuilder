package ryanwallerius.recipebuilder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;
import ryanwallerius.recipebuilder.Data.Repository.MealPlannerRepository;
import ryanwallerius.recipebuilder.Dto.MealPlannerDto;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MealPlannerService implements IMealPlannerService {
    private final MealPlannerRepository _repo;

    @Autowired
    public MealPlannerService(MealPlannerRepository repo) {
        _repo = repo;
    }

    // Convert a MealPlanner entity to a MealPlannerDto
    private MealPlannerDto convertToDto(MealPlanner mealPlanner) {
        MealPlannerDto dto = new MealPlannerDto();
        dto.setId(mealPlanner.getId());
        dto.setAsOfWeek(mealPlanner.getAsOfWeek());
        dto.setCreatedBy(mealPlanner.getCreatedBy());
        dto.setCreatedDate(mealPlanner.getCreatedDate());
        return dto;
    }

    // Convert a MealPlannerDto to a MealPlanner entity
    private MealPlanner convertToEntity(MealPlannerDto dto) {
        MealPlanner mealPlanner = new MealPlanner();
        mealPlanner.setId(dto.getId());
        mealPlanner.setAsOfWeek(dto.getAsOfWeek());
        mealPlanner.setCreatedBy(dto.getCreatedBy());
        mealPlanner.setCreatedDate(dto.getCreatedDate());
        return mealPlanner;
    }

    public List<MealPlannerDto> getAllMeals() {
        List<MealPlanner> mealPlannerList = _repo.findAll();

        List<MealPlannerDto> mealPlannerDtoList = mealPlannerList.stream()
                .map(x -> convertToDto(x))
                .collect(Collectors.toList());

        return mealPlannerDtoList;
    }
}