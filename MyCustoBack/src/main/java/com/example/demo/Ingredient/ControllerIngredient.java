package com.example.demo.Ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/ingredient/")
public class ControllerIngredient {
    @Autowired
    ServiceIngredient serviceIngredient;

    @PostMapping("ajoutIngredient")
    public String ajouterIngredient(Ingredient ingredient) {
        serviceIngredient.ajouterIngredient(ingredient);
        return "ajout effectuer avec succès";
    }

    @DeleteMapping("supprimerIngredient/{idIngredient}")
    public String supprimerIgredient( Long idIgredient) {
        serviceIngredient.supprimerIgredient(idIgredient);
        return "Suppression effectuée avec succès";
    }

    @PutMapping("modifierIngredient/{idIngredient}")
    public Ingredient modifier(Ingredient ingredient, Long idIngredient) {
        return serviceIngredient.modifier(ingredient,idIngredient);
    }


    @GetMapping("listerIngredient")
    public List<Ingredient> listerIngredient() {
        return serviceIngredient.listerIngredient();
    }
}
