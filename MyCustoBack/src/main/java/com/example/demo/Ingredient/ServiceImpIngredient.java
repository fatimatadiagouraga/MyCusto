package com.example.demo.Ingredient;

import com.example.demo.Administrateur.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ServiceImpIngredient implements ServiceIngredient{
    @Autowired
    RepositoryIngredient repositoryIngredient;

    @Override
    public String ajouterIngredient(Ingredient ingredient) {
        repositoryIngredient.save(ingredient);
        return "ajout effectuer avec succès";
    }

    @Override
    public String supprimerIgredient( Long idIgredient) {
        repositoryIngredient.deleteById(idIgredient);
        return "Suppression effectuée avec succès";
    }

    @Override
    public Ingredient modifier(Ingredient ingredient, Long idIngredient) {
        Ingredient ingredient1=repositoryIngredient.findById(idIngredient).get();
        ingredient1.setImageIngredient(ingredient.getImageIngredient());
        ingredient1.setNomIngredient(ingredient.getNomIngredient());
        return repositoryIngredient.save(ingredient1);
    }


    @Override
    public List<Ingredient> listerIngredient() {
        return repositoryIngredient.findAll();
    }
}
