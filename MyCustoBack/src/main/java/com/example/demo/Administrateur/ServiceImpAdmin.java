package com.example.demo.Administrateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpAdmin implements ServiceAdmin{
    @Autowired
    RepositoryAdmin repositoryAdmin;

    @Override
    public String ajouterAdmin(Administrateur administrateur) {
        repositoryAdmin.save(administrateur);
        return "Ajout effectué avec succès";
    }

    @Override
    public List<Administrateur> listerAdmin() {
        return repositoryAdmin.findAll();
    }

    @Override
    public Administrateur modifierAdmin(Administrateur administrateur, Long id_admin) {
        Administrateur administrateur1=repositoryAdmin.findById(id_admin).get();
        administrateur1.setNom(administrateur.getNom());
        administrateur1.setPrenom(administrateur.getPrenom());
        administrateur1.setAdresse(administrateur.getAdresse());
        administrateur1.setTéléphone(administrateur.getTéléphone());
        administrateur1.setLogin(administrateur.getLogin());
        administrateur1.setMotdepasse(administrateur.getMotdepasse());
        administrateur1.setProfil(administrateur.getProfil());
        return repositoryAdmin.save(administrateur1);
    }

    @Override
    public String supprimerAdmin(Long id_admin) {
        repositoryAdmin.deleteById(id_admin);
        return "Suppression effectuée avec succès";
    }
    @Override
    public String login (String motdepasse,String login){
        repositoryAdmin.findByMotdepasseAndLogin(motdepasse,login);
                return "succes";
    }
}
