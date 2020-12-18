package com.cookbook.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ingredients;
    private String content;
    @OneToMany
    @JoinColumn(name = "recipe_id")
    private List<CommentEntity> comments;

    public RecipeEntity(String title, String ingredients, String content, List<CommentEntity> comments){
        this.title=title;
        this.ingredients=ingredients;
        this.content=content;
        this.comments=comments;
    }

    public RecipeEntity(String title, String ingredients, String content){
        this.title=title;
        this.ingredients=ingredients;
        this.content=content;
        this.comments= new ArrayList<>();
    }
}
