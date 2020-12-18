package com.cookbook.mappers;

import com.cookbook.DTOs.RecipeDTO;
import com.cookbook.entities.RecipeEntity;

import java.util.stream.Collectors;

public class RecipeMapper {

    public static RecipeDTO toDTO(RecipeEntity entity) {
        RecipeDTO dto = new RecipeDTO();

        dto.setTitle(entity.getTitle());
        dto.setIngredients(entity.getIngredients());
        dto.setContent(entity.getContent());
        dto.setCommentIds(entity.getComments().stream()
                                .map(comment -> comment.getId())
                                .collect(Collectors.toList()));

        return dto;
    }

    public static RecipeEntity toEntity(RecipeDTO dto) {
        RecipeEntity entity = new RecipeEntity();

        entity.setTitle(dto.getTitle());
        entity.setIngredients(dto.getIngredients());
        entity.setContent(dto.getContent());

        return entity;
    }
}
