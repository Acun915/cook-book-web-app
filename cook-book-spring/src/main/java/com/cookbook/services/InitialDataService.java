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

    private RecipeEntity recipe1;
    private RecipeEntity recipe2;
    private RecipeEntity recipe3;

    @PostConstruct
    public void init() {
        fillWithDummyRecipes();
        createDummyComments();
    }

    private void createDummyComments() {
        commentRepository.save(new CommentEntity("ZAJEBISTE!!!", recipe1));
        commentRepository.save(new CommentEntity("5 gwiazdek polecam.",recipe1));
        commentRepository.save(new CommentEntity("Smakuje jak gówno rofl", recipe2));
        commentRepository.save(new CommentEntity("Polecam dodać parmezan", recipe1));
        commentRepository.save(new CommentEntity("zatrułem się tym ścierwem, obyś zdechł", recipe2));
    }

    private void fillWithDummyRecipes() {
       recipe1 =  recipeRepository.save(new RecipeEntity("Pizza Pepperoni", "mąka,woda,drożdże,sos,ser,salami","zrobić i upiec"));
       recipe2 = recipeRepository.save(new RecipeEntity("Carbonara", "makaron,boczek,sos", "podsmażyć boczek dodać sos wymieszać z ugotowanym makaronem"));
       recipe3 = recipeRepository.save(new RecipeEntity("Naleśniki", "mąka,woda,jajko,olej", "wymieszać i usmażyć na patelni"));
    }

}
