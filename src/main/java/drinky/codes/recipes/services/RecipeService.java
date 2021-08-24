package drinky.codes.recipes.services;

import drinky.codes.recipes.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService{

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
