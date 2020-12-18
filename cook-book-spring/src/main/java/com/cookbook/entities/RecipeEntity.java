package com.cookbook.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ingredients;
    private String content;
    @OneToMany
    @JoinColumn(name = "comment_id")
    private List<CommentEntity> commentEntities;
}
