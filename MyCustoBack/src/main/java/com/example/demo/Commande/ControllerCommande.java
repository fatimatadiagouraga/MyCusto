package com.example.demo.Commande;
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

        @PostMapping("ajouterCommande/{id_client}")
        public Commande ajoutermenu(@RequestBody Commande commande,@PathVariable Long id_client)
         {
             return serviceCommande.ajoutCommande(commande,id_client);
         }

         @GetMapping("listeCommande")
           public List<Commande> liste(){
            return serviceCommande.listeCommande();
         }


}
