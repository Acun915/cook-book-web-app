package com.cookbook.services;

import com.cookbook.DTOs.RecipeDTO;
import com.cookbook.entities.RecipeEntity;
import com.cookbook.mappers.RecipeMapper;
import com.cookbook.repositories.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public List<RecipeDTO> getAllRecipes() {
        return recipeRepository.findAll().stream()
                .map(entity -> RecipeMapper.toDTO(entity))
                .collect(Collectors.toList());
    }

    public RecipeDTO getRecipeById(Long id) {
        RecipeEntity recipeEntity = recipeRepository.findById(id).get();
        return RecipeMapper.toDTO(recipeEntity);
    }

    public void deleteRecipeById(Long id) {
        recipeRepository.deleteById(id);
    }

    public RecipeDTO addRecipe(RecipeDTO recipeDTO) {
        RecipeEntity recipeEntity = RecipeMapper.toEntity(recipeDTO);

        recipeRepository.save(recipeEntity);

        recipeDTO.setId(recipeEntity.getId());

        return recipeDTO;
    }


}
