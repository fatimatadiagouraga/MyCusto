package com.example.demo.Plat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/mycustoapi/plat/")
public class ControllerPlat {
    @Autowired
    ServicePlat servicePlat;
//Ajout des Plats
    @PostMapping("ajoutplat")
    public String ajouterPlat(@RequestBody Plat plat) {
        servicePlat.ajouterPlat(plat);
        return "ajout effectué avec succès";
    }
    //Modification des plats
    @PutMapping("modifierPlat")
    public String modifierPlat(@RequestBody Plat plat,@PathVariable Long id_plat) {
        servicePlat.modifierPlat(plat,id_plat);
        return "modification effectué avec succès";
    }
    //Liste Globale des Plats
    @GetMapping("listePlat")
    public List<Plat> listerPlat() {

        return servicePlat.listerPlat();
    }

    //Suppression Plat
    @DeleteMapping("supprimerPlat")
    public String supprimerPlat(@PathVariable Long id_plat) {
        servicePlat.supprimerPlat(id_plat);
        return "supprimer effectué avec succès";
    }

    //Détails Plat
    @GetMapping("platById/{id_plat}")
    public Plat platbyId(@PathVariable Long id_plat) {
        return servicePlat.platbyId(id_plat);
    }



   }
