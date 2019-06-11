package es.coding.hangryapicore.service;

import es.coding.hangryapicore.model.Ingredient;
import es.coding.hangryapicore.model.IngredientEntity;
import es.coding.hangryapicore.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class IngredientServiceImpl implements IIngredientService {

    @Autowired
    private IngredientRepository repository;

    private final AtomicLong counter = new AtomicLong();
    ArrayList<Ingredient> db = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("init");
        repository.deleteAll();
        repository.save(new IngredientEntity(counter.incrementAndGet(),"Milk", 0,200, 0));
        db.add(new Ingredient(counter.incrementAndGet(),"Milk", 0,200, 0));
        db.add(new Ingredient(counter.incrementAndGet(),"Coffee", 0,50, 0));
    }

    @Override
    public ArrayList<Ingredient> getIngredients() {
        return db;
    }

    @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        db.add(ingredient);
        return null;
    }
}
