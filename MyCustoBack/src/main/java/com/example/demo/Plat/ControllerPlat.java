package com.example.demo.Plat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/plat/")
public class ControllerPlat {
    @Autowired
    ServicePlat servicePlat;
    @PostMapping("ajoutplat")
    public String ajouterPlat(@RequestBody Plat plat) {
        servicePlat.ajouterPlat(plat);
        return "ajout avec succès";
    }
    @PutMapping("modifierPlat")
    public String modifierPlat(@RequestBody Plat plat,@PathVariable Long id_plat) {
        servicePlat.modifierPlat(plat,id_plat);
        return "modification avec succès";
    }
    @GetMapping("listePlat")
    public List<Plat> listerPlat() {

        return servicePlat.listerPlat();
    }
    @DeleteMapping("supprimerPlat")
    public String supprimerPlat(@PathVariable Long id_plat) {
        servicePlat.supprimerPlat(id_plat);
        return "supprimer avec succès";
    }
    @GetMapping("platById")
    public String platbyId(Long id_plat) {
        return servicePlat.platbyId(id_plat);
    }
}
