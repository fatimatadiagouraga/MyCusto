package com.example.demo.Administrateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mycustoApi/administrateur/")
public class ControllerAdmin {
    @Autowired
    ServiceAdmin serviceAdmin;

    @PostMapping("ajoutAdmin")
    public String ajouterAdmin(@RequestBody Administrateur administrateur){
        return serviceAdmin.ajouterAdmin(administrateur);
    }


    @GetMapping("listeAdmin")
    public List<Administrateur> listerAdmin() {
        return serviceAdmin.listerAdmin();
    }


    @PutMapping("modifierAdmin/{id_admin}")
    public Administrateur modifierAdmin(@RequestBody Administrateur administrateur, @PathVariable Long id_admin) {
     return serviceAdmin.modifierAdmin(administrateur,id_admin);

    }

    @DeleteMapping("supprimerAdmin/{id_admin}")
    public String supprimerAdmin(@PathVariable Long id_admin) {
        return  serviceAdmin.supprimerAdmin(id_admin);

    }
    @PostMapping("login/")
    public String login(@RequestParam String motdepasse,@RequestParam String login){
        return serviceAdmin.login(motdepasse,login);

    }

}
