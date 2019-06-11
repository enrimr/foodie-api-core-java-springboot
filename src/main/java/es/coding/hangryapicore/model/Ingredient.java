package es.coding.hangryapicore.model;

public class Ingredient {

    private final Long id;
    private final String name;
    private final int type;
    private final int amount;
    private final int unit;

    public Ingredient(Long id, String name, int type, int amount, int unit) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getType() {
        return type;
    }
    public int getAmount() {
        return amount;
    }
    public int getUnit() {
        return unit;
    }
}