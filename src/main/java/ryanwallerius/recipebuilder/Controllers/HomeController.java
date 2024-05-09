package ryanwallerius.recipebuilder.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/recipes")
    public String getRecipes() {
        // Your code here to fetch and return recipes
        return "List of recipes";
    }
}