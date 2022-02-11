package com.example.demo.Commande;

import com.example.demo.Plat.Plat;

import java.util.List;

public interface ServiceCommande {

    public String ajoutCommande(Commande commande);
    public String supprimerCommande(Long idCommande);
    public Commande modifierCommande(Commande commande,Long idCommande);
    public List<Commande> listeCommande();


}
