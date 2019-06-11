package es.coding.hangryapicore.controller;

import es.coding.hangryapicore.model.Ingredient;
import es.coding.hangryapicore.service.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IngredientController {

    @Autowired
    IIngredientService ingredientService;
    private final AtomicLong counter = new AtomicLong();

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @RequestMapping(value = "/ingredient", method = RequestMethod.GET)
    public ArrayList<Ingredient> ingredient() {
        System.out.println("ingredient");
        return ingredientService.getIngredients();
    }

    @RequestMapping(name = "/ingredient", method = RequestMethod.POST)
    public @ResponseBody Ingredient createIngredient(@RequestBody Ingredient ingredient) {

        Ingredient newIngredient = new Ingredient(counter.incrementAndGet(),
                ingredient.getName(),
                ingredient.getType(),
                ingredient.getAmount(),
                ingredient.getUnit());

        return ingredientService.createIngredient(newIngredient);
    }
}