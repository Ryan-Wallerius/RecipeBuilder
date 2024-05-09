package ryanwallerius.recipebuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ryanwallerius.recipebuilder.Data.Repository.MealPlannerRepository")
public class RecipeBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeBuilderApplication.class, args);
	}
}
