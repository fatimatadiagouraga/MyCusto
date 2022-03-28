package com.example.demo.Commande;
import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Client.Client;
import com.example.demo.Panier.Panier;
import com.example.demo.Plat.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mycustoApi/commande/")

public class ControllerCommande
{
        @Autowired
        ServiceCommande serviceCommande;
//Ajouter commande
        @PostMapping("ajouterCommande/{id_client}")
        public Commande ajoutermenu(@RequestBody Commande commande,@PathVariable Long id_client)
         {
             return serviceCommande.ajoutCommande(commande,id_client);
         }
//listerCommande

         @GetMapping("listeCommande")
           public List<Commande> liste(){
            return serviceCommande.listeCommande();
         }

//


    @DeleteMapping("supprimer/{idCommande}")
    public Commande supprimerCommande(@PathVariable Long idCommande) {
    return serviceCommande.supprimerCommande(idCommande);
   }

    @PutMapping("modifiercommande/{idCommande}/{id_admin}")
    public Commande modifierCommande(@RequestBody Commande commande, @PathVariable Long idCommande,@PathVariable Long id_admin) {
        return serviceCommande.modifierCommande(commande,idCommande,id_admin);
    }


    //liste des commandes livrées par clients

    @GetMapping("listeCommandeClt/{id_client}")
    public List<Commande> commandeClt(@PathVariable Long id_client) {
        return serviceCommande.commandeClt(id_client);
    }


    //list de commande Encours par client
    @GetMapping("commandeEnCours/{id_client}")
    public List<Commande> commandeCltEtat(@PathVariable Long id_client) {
        return serviceCommande.commandeCltEtat(id_client);
    }

    //commdes en cours admin methode
    @GetMapping("commandeEnCours")
    public List<Commande> listeCommandeEnCours() {
        return serviceCommande.listeCommandeEnCours();
    }

    //commandes livrées admin methode
    @GetMapping("commandeLivre")
    public List<Commande> listeCommandeLivrer() {
        return serviceCommande.listeCommandeLivrer();
    }

    //client valide commande comme quoi cest livrer
    @DeleteMapping("validerLivraison/{idCommande}")
    public Commande valideLivraison( @PathVariable Long idCommande) {
        return serviceCommande.valideLivraison(idCommande);
    }

    @DeleteMapping("encours/{id_Commande}")
    public Commande encours( @PathVariable Long id_Commande) {
        return serviceCommande.Encours(id_Commande);
    }




}
