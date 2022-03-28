package com.example.demo.Administrateur;

import com.example.demo.Client.Client;
import com.example.demo.Client.EtatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpAdmin implements ServiceAdmin{
    @Autowired
    RepositoryAdmin repositoryAdmin;

    @Override
    public Administrateur ajouterAdmin(Administrateur administrateur) {
        Optional<Administrateur> adminlog =repositoryAdmin.findByLogin(administrateur.getLogin());
        if(adminlog.isPresent()){
            return null;
        }else {

        return  repositoryAdmin.save(administrateur);
    }}

    @Override
    public List<Administrateur> listerAdmin() {
        return repositoryAdmin.findAdministrateurByEtat(Etat.activer);

    }

    @Override
    public Administrateur modifierAdmin(Administrateur administrateur, Long id_admin) {
        Administrateur administrateur1 = repositoryAdmin.findById(id_admin).get();
        administrateur1.setNom(administrateur.getNom());
        administrateur1.setPrenom(administrateur.getPrenom());
        administrateur1.setAdresse(administrateur.getAdresse());
        administrateur1.setTelephone(administrateur.getTelephone());
        administrateur1.setLogin(administrateur.getLogin());
        administrateur1.setProfil(administrateur.getProfil());
        administrateur1.setGenre(administrateur.getGenre());
        Optional<Administrateur> ad =repositoryAdmin.findByLogin(administrateur1.getLogin());
        if (ad.isPresent()){
            return null;
        }else{
            return repositoryAdmin.save(administrateur1);
        }

    }

    @Override
    public Administrateur supprimerAdmin(Long id_admin) {
        Administrateur c =repositoryAdmin.findById(id_admin).get();
        c.setSupprimer(true);
        c.setEtat_admin(Etat.desactiver);
        return repositoryAdmin.save(c);

    }
    @Override
    public Optional<Administrateur> login (String motdepasse, String login){
      return  repositoryAdmin.findByMotdepasseAndLoginAndEtat(motdepasse,login,Etat.activer);

    }

    @Override
    public Administrateur adminById(Long id_admin) {
        return repositoryAdmin.findById(id_admin).get();
    }

    @Override
    public List<Administrateur> corbeille() {
        return repositoryAdmin.findAdministrateurByEtat(Etat.desactiver);
    }

    @Override
    public Administrateur restaureAdmin(Long id_admin) {
        Administrateur c =repositoryAdmin.findById(id_admin).get();
        c.setSupprimer(false);
        c.setEtat_admin(Etat.activer);
        return repositoryAdmin.save(c);
    }
}
