package ryanwallerius.recipebuilder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryanwallerius.recipebuilder.Data.Entity.MealPlanner;
import ryanwallerius.recipebuilder.Data.Repository.MealPlannerRepository;
import ryanwallerius.recipebuilder.Dto.*; 
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
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
        dto.setMealPlannerId(mealPlanner.getMealPlannerId());
        dto.setAsOfWeek(mealPlanner.getAsOfWeek());
        dto.setCreatedBy(mealPlanner.getCreatedBy());
        dto.setCreatedDate(mealPlanner.getCreatedDate());
        return dto;
    }

    // Convert a MealPlannerDto to a MealPlanner entity
    private MealPlanner convertToEntity(MealPlannerDto dto) {
        MealPlanner mealPlanner = new MealPlanner();
        mealPlanner.setMealPlannerId(dto.getMealPlannerId());
        mealPlanner.setAsOfWeek(dto.getAsOfWeek());
        mealPlanner.setCreatedBy(dto.getCreatedBy());
        mealPlanner.setCreatedDate(dto.getCreatedDate());
        return mealPlanner;
    }

    public MealPlanner convertRequestDtoToEntity(MealPlannerRequestDto requestDto) {
        MealPlanner mealPlanner = new MealPlanner();

        mealPlanner.setAsOfWeek(requestDto.getAsOfWeek());
        mealPlanner.setCreatedBy(requestDto.getCreatedBy());

        return mealPlanner;
    }

    public List<MealPlannerDto> getAllMeals() {
        List<MealPlanner> mealPlannerList = _repo.findAll();

        List<MealPlannerDto> mealPlannerDtoList = mealPlannerList.stream()
                .map(x -> convertToDto(x))
                .collect(Collectors.toList());

        return mealPlannerDtoList;
    }

    public MealPlannerDto getMealPlanById(int id) {
        MealPlanner mealPlanner = _repo.findById(id).orElseThrow(); 
        MealPlannerDto dto = convertToDto(mealPlanner);

        return dto;
    }

    public UpdateResponseDto<MealPlannerDto> createMealPlan(RequestDto<MealPlannerRequestDto> requestDto) {
        MealPlanner mealPlanner = convertRequestDtoToEntity(requestDto.getData());

        Timestamp currentTimestamp = Timestamp.from(Instant.now());
        mealPlanner.setCreatedDate(currentTimestamp);

        mealPlanner = _repo.save(mealPlanner);
        MealPlannerDto dto = convertToDto(mealPlanner);

        return new UpdateResponseDto<MealPlannerDto>(dto, 1);
    }

    public UpdateResponseDto<MealPlannerDto> updateMealPlan(int id, RequestDto<MealPlannerRequestDto> requestDto) {
        Optional<MealPlanner> mealPlannerOpt = _repo.findById(id); 
        if (mealPlannerOpt.isEmpty())
            return new UpdateResponseDto<MealPlannerDto>(); 

        Timestamp currentTimestamp = Timestamp.from(Instant.now());
           
        MealPlanner mealPlanner = mealPlannerOpt.get();
        mealPlanner.setAsOfWeek(requestDto.getData().getAsOfWeek());
        mealPlanner.setCreatedBy(requestDto.getData().getCreatedBy());
        mealPlanner.setCreatedDate(currentTimestamp);

        mealPlanner = _repo.save(mealPlanner);
        MealPlannerDto dto = convertToDto(mealPlanner);

        return new UpdateResponseDto<MealPlannerDto>(dto, 1);
    }
}