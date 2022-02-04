package Ingredient;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpIngredient implements ServiceIngredient{
    @Autowired
    RepositoryIngredient repositoryIngredient;
    @Override
    public String ajouterIngredient(Ingredient ingredient) {
        repositoryIngredient.save(ingredient);
        return "ajout avec succès";
    }

    @Override
    public String modifierIngredient(Ingredient ingredient, Long id_ingredient) {
        Ingredient ingredient1=repositoryIngredient.findById(id_ingredient).get();
        ingredient1.setNom_ingredient(ingredient.getNom_ingredient());
        ingredient1.setImage_ingredient(ingredient.getImage_ingredient());
        repositoryIngredient.save(ingredient1);
        return "modification avec succès";
    }

    @Override
    public String supprimerIngredient(Long id_ingredient) {
        repositoryIngredient.deleteById(id_ingredient);
        return "supprimer avec succès";
    }

    @Override
    public List<Ingredient> listerIngredient() {
        return repositoryIngredient.findAll();
    }


    @Override
    public String ingredientById(Long id_ingredient) {
        repositoryIngredient.findById(id_ingredient).get();
        return null;
    }
}
