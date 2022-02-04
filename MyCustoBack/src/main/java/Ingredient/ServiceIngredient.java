package Ingredient;

import java.util.List;

public interface ServiceIngredient {
    public String ajouterIngredient(Ingredient ingredient);
    public String modifierIngredient(Ingredient ingredient,Long id_ingredient);
    public String supprimerIngredient(Long id_ingredient);
    public List<Ingredient> listerIngredient();
    public String ingredientById(Long id_ingredient);
}
