package drinky.codes.recipes.controllers;

import drinky.codes.recipes.domain.Category;
import drinky.codes.recipes.domain.Recipe;
import drinky.codes.recipes.domain.UnitOfMeasure;
import drinky.codes.recipes.repositories.CategoryRepository;
import drinky.codes.recipes.repositories.UnitOfMeasureRepository;
import drinky.codes.recipes.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index","index.html"})
    public String home(Model model) {

        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());


        return "index";
    }

}
