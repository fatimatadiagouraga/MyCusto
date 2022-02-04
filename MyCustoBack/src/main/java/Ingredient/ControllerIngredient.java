package Ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/ingredient/")
public class ControllerIngredient {
    @Autowired
    ServiceIngredient serviceIngredient;
    @PostMapping("ajoutIngredient")
    public String ajouterIngredient(@RequestBody Ingredient ingredient) {
        serviceIngredient.ajouterIngredient(ingredient);
        return "ajout avec succès";
    }
    @PutMapping("modiferIngredient")
    public String modifierIngredient(@RequestBody Ingredient ingredient, @PathVariable Long id_ingredient) {
        serviceIngredient.modifierIngredient(ingredient, id_ingredient);
        return "modififé avec succès";
    }
    @DeleteMapping("supprimerIngredient")
    public String supprimerIngredient(Long id_ingredient) {
        serviceIngredient.supprimerIngredient(id_ingredient);
        return "supprimer avec succès";
    }
    @GetMapping("listeIngredient")
    public List<Ingredient> listerIngredient() {
        return serviceIngredient.listerIngredient();
    }
    @GetMapping("ingredientById")
    public String ingredientById(Long id_ingredient) {
        serviceIngredient.ingredientById(id_ingredient);
        return null;
    }
}
