package com.cookbook.restControllers;

import com.cookbook.DTOs.CommentDTO;
import com.cookbook.DTOs.RecipeDTO;
import com.cookbook.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @CrossOrigin
    @GetMapping("/rest/recipes")
    @ResponseBody
    public List<RecipeDTO> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/rest/recipes/{id}")
    @ResponseBody
    public RecipeDTO getRecipeById(@PathVariable Long id){
        return recipeService.getRecipeById(id);
    }

    @DeleteMapping("/rest/recipes/{id}")
    public void deleteRecipeById(@PathVariable Long id){
        recipeService.deleteRecipeById(id);
    }

    @PostMapping("/rest/recipes")
    public RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO) {
        return recipeService.addRecipe(recipeDTO);
    }

    @PostMapping("/rest/recipes/{id}")
    public CommentDTO addComment(@PathVariable(name = "id") Long recipeId, @RequestBody CommentDTO commentDTO) {

        return recipeService.addComment(recipeId, commentDTO);
    }
}