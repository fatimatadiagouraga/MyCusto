package com.example.demo.Commande;

import com.example.demo.Panier.Panier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mycustoApi/commande/")

public class ControllerCommande {
    @Autowired
    ServiceCommande serviceCommande;

    @PostMapping("ajoutcommande")
    public Commande ajouterCommande(@RequestBody Commande commande){
        commande.setEtat(Etat.Attente);
        return serviceCommande.ajoutCommande(commande);
        }

    /*@GetMapping("listerCommande")
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
    }*/





}
