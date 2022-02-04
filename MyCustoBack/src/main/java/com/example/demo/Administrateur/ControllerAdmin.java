package com.example.demo.Administrateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/api/administrateur/")
public class ControllerAdmin {
    @Autowired
    ServiceAdmin serviceAdmin;

    @PostMapping("ajoutAdmin")
    public String ajouterAdmin(@RequestBody Administrateur administrateur){
      serviceAdmin.ajouterAdmin(administrateur);
      return "successss";
    }
    @GetMapping("listeAdmin")
    public List<Administrateur> listerAdmin() {
        return serviceAdmin.listerAdmin();
    }
    @PutMapping
    public Administrateur modifierAdmin(@RequestBody Administrateur administrateur, @PathVariable Long id_admin) {
     return serviceAdmin.modifierAdmin(administrateur,id_admin);

    }

    @DeleteMapping
    public String supprimerAdmin(@PathVariable Long id_admin) {
        serviceAdmin.supprimerAdmin(id_admin);
        return "Suppression effectuée avec succès";
    }

}
