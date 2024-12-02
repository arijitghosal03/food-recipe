package com.recipe.foods.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "recipe")
public class Recipe{
    @Id
    private Integer id;
    
    private String name;
    private String description;
    private String ingredients;
}