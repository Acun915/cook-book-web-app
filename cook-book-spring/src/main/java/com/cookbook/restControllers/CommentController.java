package com.cookbook.restControllers;

import com.cookbook.DTOs.CommentDTO;
import com.cookbook.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/rest/recipes/{id}")
    public CommentDTO addComment(@PathVariable Long id, @RequestBody CommentDTO commentDTO) {
        commentDTO.setRecipeId(id);
        return commentService.addComment(commentDTO);
    }
}
