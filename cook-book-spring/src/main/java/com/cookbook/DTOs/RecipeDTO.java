package com.cookbook.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RecipeDTO {
    private Long id;
    private String title;
    private String ingredients;
    private String content;
    private List<String> comments;
}
