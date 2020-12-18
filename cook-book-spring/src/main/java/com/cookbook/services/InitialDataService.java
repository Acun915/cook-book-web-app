package com.cookbook.services;

import com.cookbook.entities.CommentEntity;
import com.cookbook.entities.RecipeEntity;
import com.cookbook.repositories.CommentRepository;
import com.cookbook.repositories.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InitialDataService {

    private final RecipeRepository recipeRepository;
    private final CommentRepository commentRepository;

    private CommentEntity comment1;
    private CommentEntity comment2;
    private CommentEntity comment3;
    private CommentEntity comment4;
    private CommentEntity comment5;

    @PostConstruct
    public void init() {
        fillWithDummyComments();
        fillWithDummyRecipes();
    }

    private void fillWithDummyComments() {
        comment1 = commentRepository.save(new CommentEntity("ZAJEBISTE!!!"));
        comment2 = commentRepository.save(new CommentEntity("5 gwiazdek polecam."));
        comment3 = commentRepository.save(new CommentEntity("Smakuje jak gówno rofl"));
        comment4 = commentRepository.save(new CommentEntity("Polecam dodać parmezan"));
        comment5 = commentRepository.save(new CommentEntity("zatrułem się tym ścierwem, obyś zdechł"));
    }

    private void fillWithDummyRecipes() {
        recipeRepository.save(new RecipeEntity("Pizza Pepperoni", "mąka,woda,drożdże,sos,ser,salami","zrobić i upiec", List.of(comment1, comment2,comment4)));
        recipeRepository.save(new RecipeEntity("Carbonara", "makaron,boczek,sos", "podsmażyć boczek dodać sos wymieszać z ugotowanym makaronem", List.of(comment3, comment5)));
        recipeRepository.save(new RecipeEntity("Naleśniki", "mąka,woda,jajko,olej", "wymieszać i usmażyć na patelni"));
    }

}
