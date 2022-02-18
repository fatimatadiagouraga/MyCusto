package com.example.demo.Plat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/mycustoapi/plat/")
public class ControllerPlat {
    @Autowired
    ServicePlat servicePlat;


    @PostMapping("ajoutplat")
    public Plat ajouterPlat(Plat plat, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        return servicePlat.ajouterPlat(plat, multipartFile);
    }


    //Modification des plats
    @PutMapping("modifierPlat/{id_plat}")
    public Plat modifierPlat(@PathVariable Long id_plat,@RequestBody Plat plat) {
      return  servicePlat.modifierPlat(plat,id_plat);

    }
    //Liste Globale des Plats
    @GetMapping("listePlat")
    public List<Plat> listerPlat() {

        return servicePlat.listerPlat();
    }

    //Suppression Plat
    @DeleteMapping("supprimerPlat/{id_plat}")
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
