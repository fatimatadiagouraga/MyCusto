package com.example.demo.Panier;

import com.example.demo.Plat.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mycustoApi/panier/")

public class ControllerPanier {
    @Autowired
    Servicepanier servicepanier;

    @PostMapping("ajouterPanier/{id_plat}/{id_client}")
    public Panier ajout(@RequestBody Panier panier,@PathVariable Long id_plat,@PathVariable Long id_client){
        return servicepanier.ajoutPanier(panier,id_plat,id_client);
    }

   @GetMapping("panierClient/{id_client}")
    public List<Panier> panierClient(@PathVariable Long id_client){
        return  servicepanier.panierParClt(id_client);
   }

   @DeleteMapping("suppPanier/{id_panier}")
    public Panier supprimerPanier(@PathVariable Long id_panier){
        return servicepanier.supprimerPanier(id_panier);
   }


   @PutMapping("updateQ/{id_panier}/{quantite}")
    public Panier update(@PathVariable Long id_panier, @PathVariable int quantite){
        return servicepanier.updateQ(id_panier,quantite);
    }

    @GetMapping("deselect/{id_client}/{id_plat}")
    public List<Panier> desected(@PathVariable Long id_client,@PathVariable Long id_plat){
        return servicepanier.deselect(id_client,id_plat);
    }

    @DeleteMapping("supprimer/{id_client}")
    public void toutSup(@PathVariable Long id_client){
        servicepanier.suppPanierClient(id_client);
    }

}
