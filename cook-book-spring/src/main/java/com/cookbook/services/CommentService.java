package com.cookbook.services;

import com.cookbook.DTOs.CommentDTO;
import com.cookbook.entities.CommentEntity;
import com.cookbook.entities.RecipeEntity;
import com.cookbook.mappers.RecipeMapper;
import com.cookbook.repositories.CommentRepository;
import com.cookbook.repositories.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final RecipeRepository recipeRepository;

    public CommentDTO addComment(CommentDTO commentDTO) {
        RecipeEntity recipeEntity = recipeRepository.findById(commentDTO.getRecipeId()).get();

        CommentEntity commentEntity = commentRepository.save(new CommentEntity(commentDTO.getContent(), recipeEntity));

        commentDTO.setId(commentEntity.getId());

        return commentDTO;
    }

}
