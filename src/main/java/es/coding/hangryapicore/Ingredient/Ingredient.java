package es.coding.hangryapicore.Ingredient;

public class Ingredient {

    private final long id;
    private final String name;
    private final int type;
    private final int amount;
    private final int unit;

    public Ingredient(long id, String content, int type, int amount, int unit) {
        this.id = id;
        this.name = content;
        this.type = type;
        this.amount = amount;
        this.unit = unit;
    }

    public long getId() {
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