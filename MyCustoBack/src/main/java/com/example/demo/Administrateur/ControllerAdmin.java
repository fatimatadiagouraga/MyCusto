package com.example.demo.Administrateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/mycustoApi/administrateur/")
public class ControllerAdmin {
    @Autowired
    ServiceAdmin serviceAdmin;

    @PostMapping("ajoutAdmin")
    @ResponseBody
    public Administrateur ajouterAdmin(@RequestBody Administrateur administrateur){
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
    public Administrateur supprimerAdmin(@PathVariable Long id_admin) {
        return  serviceAdmin.supprimerAdmin(id_admin);

    }
    @PostMapping("login")
    public Optional<Administrateur> login(@RequestParam String motdepasse, @RequestParam String login){
        return serviceAdmin.login(motdepasse,login);

    }

}
