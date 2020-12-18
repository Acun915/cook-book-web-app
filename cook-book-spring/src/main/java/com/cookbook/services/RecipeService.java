package com.cookbook.services;

import com.cookbook.DTOs.RecipeDTO;
import com.cookbook.mappers.RecipeMapper;
import com.cookbook.repositories.RecipeRepository;
import lombok.RequiredArgsConstructor;
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
}
