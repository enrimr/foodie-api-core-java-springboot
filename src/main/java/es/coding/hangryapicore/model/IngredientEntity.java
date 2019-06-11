package es.coding.hangryapicore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ingredient")
public class IngredientEntity {

    @Id
    private Long id;
    private String name;
    private int type;
    private int amount;
    private int unit;

    protected IngredientEntity() {}

    public IngredientEntity(Long id, String name, int type, int amount, int unit) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format(
                "Ingredient[id=%d, name='%s', type=%d, amount=%d, unit=%d]",
                id, name, type, amount, unit);
    }

}