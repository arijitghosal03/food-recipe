package com.recipe.foods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.foods.Repository.FoodsRepo;
import com.recipe.foods.model.Recipe;


@RestController
public class MainController {

    @Autowired  
    FoodsRepo repo;

    @PostMapping("/addrecipe")
    public void addRecipe(@RequestBody Recipe recipe){

        repo.save(recipe);
    }

    @GetMapping("/getrecipe")
    public List<Recipe> getAllRecipes() {
           // System.out.println("GET /recipes");
            return repo.findAll();
        }

    }