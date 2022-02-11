package com.example.demo.Commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mycustoapi/commande/")

public class ControllerCommande {
    @Autowired
    ServiceCommande serviceCommande;

    @PostMapping("ajoutCommande")
    public String ajouterCommande(@RequestBody Commande commande){
        serviceCommande.ajoutCommande(commande);
        return " ";}

    @GetMapping("listerCommande")
        public List<Commande> listeCommande() {
            return serviceCommande.listeCommande();
        }
    @DeleteMapping("supprimerCommande/{idCommande}")
    public String suppCommande(@PathVariable Long idCommande){
         serviceCommande.supprimerCommande(idCommande);
         return " ";
    }
    @PutMapping("modifierCommande/{idCommande}")
    public Commande modifCommande(@RequestBody Commande commande,@PathVariable Long idCommande){
     return serviceCommande.modifierCommande(commande,idCommande);
    }





}
