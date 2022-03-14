package com.example.demo.Commande;

import com.example.demo.Panier.Panier;
import com.example.demo.Plat.Plat;

import java.util.List;

public interface ServiceCommande {

    public Commande ajoutCommande(Commande commande,Long id_client);
    public void supprimerCommande(Long idCommande);
    public Commande modifierCommande(Commande commande,Long idCommande);
    public List<Commande> listeCommande();


}
