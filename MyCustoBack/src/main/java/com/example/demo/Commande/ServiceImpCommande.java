package com.example.demo.Commande;

import com.example.demo.Client.Client;
import com.example.demo.Client.RepositoryClient;
import com.example.demo.Menu.RepositoryMenu;
import com.example.demo.Panier.Panier;
import com.example.demo.Panier.RepositoryPanier;
import com.example.demo.Plat.Plat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpCommande implements ServiceCommande{
    @Autowired
    RepositoryCommande repCommande;
    @Autowired
    RepositoryPanier repositoryPanier;
    @Autowired
    RepositoryClient repositoryClient;


    @Override
    public Commande ajoutCommande(Commande commande,Long id_client) {
        Client client=repositoryClient.findById(id_client).get();
        commande.setClient(client);
        commande.setEtat(Etat.Attente);
        int somme = 0;
        List<Panier> liste = commande.getPanierList();
        for (int i =0; i<liste.size(); i++){
            somme = somme + liste.get(i).getPlat().getPrix_plat();
            liste.get(i).setCommander(true);
            repositoryPanier.save(liste.get(i));
        }

        commande.setMontant(somme);

        return repCommande.save(commande);
    }

    @Override
    public void supprimerCommande(Long idCommande) {

    }

    @Override
    public Commande modifierCommande(Commande commande, Long idCommande) {
        Commande c =repCommande.findById(idCommande).get();
        c.setEtat(commande.getEtat());
        return repCommande.save(c) ;
    }

    @Override
    public List<Commande> listeCommande() {
        return repCommande.findCommandeByEtat(Etat.Attente);
    }

    /*@Override
    public void supprimerCommande(Long idCommande) {
   repCommande.deleteById(idCommande);
       return ;
    }

    @Override
    public Commande modifierCommande(Commande commande, Long idCommande) {
        Commande commande1= repCommande.findById(idCommande).get();

        return repCommande.save(commande1);
    }

    @Override
    public List<Commande> listeCommande() {
        return repCommande.findAll();
    }*/



}
