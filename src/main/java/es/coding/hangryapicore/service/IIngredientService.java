package es.coding.hangryapicore.service;

import es.coding.hangryapicore.model.Ingredient;

import java.util.ArrayList;

public interface IIngredientService {

    ArrayList<Ingredient> getIngredients();

    Ingredient createIngredient(Ingredient ingredient);
}
