package es.coding.hangryapicore.repository;

import es.coding.hangryapicore.model.IngredientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface IngredientRepository extends MongoRepository<IngredientEntity, Long> {
    public ArrayList<IngredientEntity> findByName(String name);
    public ArrayList<IngredientEntity> findByType(int type);
}
