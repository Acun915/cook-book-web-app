package com.cookbook.services;

import com.cookbook.entities.CommentEntity;
import com.cookbook.entities.RecipeEntity;
import com.cookbook.entities.UserEntity;
import com.cookbook.repositories.CommentRepository;
import com.cookbook.repositories.RecipeRepository;
import com.cookbook.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InitialDataService {

    private final RecipeRepository recipeRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    private RecipeEntity recipe1;
    private RecipeEntity recipe2;
    private RecipeEntity recipe3;

    private UserEntity user1;
    private UserEntity user2;
    private UserEntity user3;

    @PostConstruct
    public void init() {
        createDummyUsers();
        fillWithDummyRecipes();
        createDummyComments();
    }

    private void createDummyComments() {
        commentRepository.save(new CommentEntity("ZAJEBISTE!!!", recipe1, user1));
        commentRepository.save(new CommentEntity("5 gwiazdek polecam.",recipe1,user2));
        commentRepository.save(new CommentEntity("Smakuje jak gówno rofl", recipe2, user1));
        commentRepository.save(new CommentEntity("Polecam dodać parmezan", recipe1, user3));
        commentRepository.save(new CommentEntity("zatrułem się tym ścierwem, obyś zdechł", recipe2, user3));
    }

    private void fillWithDummyRecipes() {
       recipe1 =  recipeRepository.save(new RecipeEntity("Pizza Pepperoni", "mąka,woda,drożdże,sos,ser,salami","zrobić i upiec"));
       recipe2 = recipeRepository.save(new RecipeEntity("Carbonara", "makaron,boczek,sos", "podsmażyć boczek dodać sos wymieszać z ugotowanym makaronem"));
       recipe3 = recipeRepository.save(new RecipeEntity("Naleśniki", "mąka,woda,jajko,olej", "wymieszać i usmażyć na patelni"));
    }

    private void createDummyUsers() {
        user1 = userRepository.save(new UserEntity("Userro12345"));
        user2 = userRepository.save(new UserEntity("Tomo1337"));
        user3 = userRepository.save(new UserEntity("MasterChief808"));
    }

}
