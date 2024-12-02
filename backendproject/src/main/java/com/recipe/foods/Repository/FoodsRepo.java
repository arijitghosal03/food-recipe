package com.recipe.foods.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recipe.foods.model.Recipe;

public interface FoodsRepo extends MongoRepository<Recipe,Integer> {
}