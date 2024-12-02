    package com.example.backend;

    import java.util.ArrayList;
    import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;


    @SpringBootApplication
    public class BackendApplication {

        public static void main(String[] args) {
            SpringApplication.run(BackendApplication.class, args);
         }
    }

    @RestController
    @RequestMapping("/recipes")
    class RecipeController {

        private List<Recipe> recipes = new ArrayList<>();
        
        @Autowired
        private RecipeRepository recipeRepository;
        
        public RecipeController() {
            Recipe recipe = new Recipe();
            recipe.setName("Pancakes");
            recipes.add(recipe);
        }

        @GetMapping("/")
        public List<Recipe> getAllRecipes() {
           // System.out.println("GET /recipes");
            return recipeRepository.findAll();
        }

        @PostMapping
        public Recipe addRecipe(@RequestBody Recipe recipe) {
            System.out.println("POST /recipes");
            recipes.add(recipe);
            recipeRepository.save(recipe);
            return recipe;
        }
    }
