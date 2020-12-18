package com.cookbook.restControllers;

import com.cookbook.DTOs.RecipeDTO;
import com.cookbook.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping(path = "/rest/recipes")
    public List<RecipeDTO> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
}
