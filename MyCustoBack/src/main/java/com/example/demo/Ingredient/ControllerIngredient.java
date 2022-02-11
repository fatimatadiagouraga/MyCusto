package com.example.demo.Ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/mycustoapi/ingredient/")

public class ControllerIngredient {
    @Autowired
    ServiceIngredient serviceIngredient;

    @PostMapping("ajoutIngredient")
    public String ajouterIngredient(@RequestBody Ingredient ingredient) {
        serviceIngredient.ajouterIngredient(ingredient);
        return "ajout effectuer avec succès";
    }

    @DeleteMapping("supprimerIngredient/{idIngredient}")
    public String supprimerIgredient( @PathVariable Long idIngredient) {
        serviceIngredient.supprimerIgredient(idIngredient);
        return "Suppression effectuée avec succès";
    }

    @PutMapping("modifierIngredient/{idIngredient}")
    public Ingredient modifier(@RequestBody Ingredient ingredient, @PathVariable Long idIngredient) {
        return serviceIngredient.modifier(ingredient,idIngredient);
    }


    @GetMapping("listerIngredient")
    public List<Ingredient> listerIngredient() {

        return serviceIngredient.listerIngredient();
    }
}
