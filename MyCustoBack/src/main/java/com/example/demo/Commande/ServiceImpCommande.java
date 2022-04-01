package com.example.demo.Commande;

import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Administrateur.RepositoryAdmin;
import com.example.demo.Client.Client;
import com.example.demo.Client.RepositoryClient;
import com.example.demo.Menu.RepositoryMenu;
import com.example.demo.Panier.Panier;
import com.example.demo.Panier.RepositoryPanier;
import com.example.demo.Plat.Plat;
import com.jayway.jsonpath.internal.function.text.Length;
import org.hibernate.query.criteria.internal.expression.function.LengthFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceImpCommande implements ServiceCommande{
    @Autowired
    RepositoryCommande repCommande;
    @Autowired
    RepositoryPanier repositoryPanier;
    @Autowired
    RepositoryClient repositoryClient;
    @Autowired
    RepositoryAdmin repositoryAdmin;



    @Override
    public Commande ajoutCommande(Commande commande,Long id_client) {
        Client client=repositoryClient.findById(id_client).get();
        commande.setClient(client);
        commande.setEtat(Etat.Attente);
        commande.setSupprimer(false);
        int somme = 0;

        List<Panier> liste = commande.getPanierList();
        for (int i =0; i<liste.size(); i++){
            somme = somme + liste.get(i).getMontant();
            liste.get(i).setCommander(true);
            repositoryPanier.save(liste.get(i));
        }

        commande.setMontant(somme);

        return repCommande.save(commande);
    }

    @Override
    public Commande supprimerCommande(Long idCommande) {
        Commande commande=repCommande.findById(idCommande).get();
        commande.setSupprimer(true);
        return repCommande.save(commande);
    }


    @Override
    public Commande modifierCommande(Commande commande, Long idCommande,Long id_admin) {
        Commande c =repCommande.findById(idCommande).get();
        Administrateur admin=repositoryAdmin.findById(id_admin).get();
        c.setEtat(commande.getEtat());
        c.setAdministrateur(admin);
        return repCommande.save(c) ;
    }
//admins methode
    @Override
    public List<Commande> listeCommande() {
        return repCommande.findCommandeByEtat(Etat.Attente);
    }

//client methode liste commandes livrées par client
    @Override
    public List<Commande> commandeClt(Long id_client) {
        Client client =repositoryClient.findById(id_client).get();
        return repCommande.findCommandeByClientAndSupprimerAndEtat(client,false,Etat.Livrer);
    }

//client methode liste des commandes en cours par client
    @Override
    public List<Commande> commandeCltEtat(Long id_client) {
        Client client =repositoryClient.findById(id_client).get();
        return repCommande.findCommandeByClientAndEtat(client,Etat.Encours);
    }

//liste des commandes en cours methodes admins
    @Override
    public List<Commande> listeCommandeEnCours() {
        return repCommande.findCommandeByEtat(Etat.Encours);
    }

 //liste des commandes livrées methode admin
    @Override
    public List<Commande> listeCommandeLivrer() {
        return repCommande.findCommandeByEtat(Etat.Livrer);
    }




// validation de commande par le client

    @Override
    public Commande valideLivraison( Long id_Commande) {
        Commande c =repCommande.findById(id_Commande).get();
        c.setEtat(Etat.Livrer);
        return repCommande.save(c);
    }

    @Override
    public Commande Encours(Long id_Commande) {
        Commande c =repCommande.findById(id_Commande).get();
        c.setEtat(Etat.Encours);
        return repCommande.save(c);
    }


}
