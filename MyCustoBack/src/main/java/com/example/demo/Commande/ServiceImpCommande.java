package com.example.demo.Commande;

import com.example.demo.Menu.RepositoryMenu;
import com.example.demo.Plat.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpCommande implements ServiceCommande{
    @Autowired
    RepositoryCommande repCommande;

    @Override
    public String ajoutCommande(Commande commande) {

        repCommande.save(commande);
        return "";
    }

    @Override
    public String supprimerCommande(Long idCommande) {
   repCommande.deleteById(idCommande);
        return "";
    }

    @Override
    public Commande modifierCommande(Commande commande, Long idCommande) {
        Commande commande1= repCommande.findById(idCommande).get();
        commande1.setMenu(commande.getMenu());
        return repCommande.save(commande1);
    }

    @Override
    public List<Commande> listeCommande() {
        return repCommande.findAll();
    }



}
