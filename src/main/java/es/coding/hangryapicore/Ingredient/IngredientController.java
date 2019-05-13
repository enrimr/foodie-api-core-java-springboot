package es.coding.hangryapicore.Ingredient;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IngredientController {

    private final AtomicLong counter = new AtomicLong();

    ArrayList<Ingredient> db = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("init");
        db.add(new Ingredient(counter.incrementAndGet(),"Milk", 0,200, 0));
        db.add(new Ingredient(counter.incrementAndGet(),"Coffee", 0,50, 0));
    }
    @RequestMapping(value = "/ingredient", method = RequestMethod.GET)
    public ArrayList<Ingredient> ingredient() {
        System.out.println("ingredient");

        /*ArrayList<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient(counter.incrementAndGet(),"Milk", 0,200, 0));
        ingredientList.add(new Ingredient(counter.incrementAndGet(),"Coffee", 0,50, 0));*/
        return this.db;
    }

    @RequestMapping(name = "/ingredient", method = RequestMethod.POST)
    public @ResponseBody Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        Ingredient newIngredient = new Ingredient(counter.incrementAndGet(),
                ingredient.getName(),
                ingredient.getType(),
                ingredient.getAmount(),
                ingredient.getUnit());
        this.db.add(newIngredient);
        return newIngredient;
    }
}