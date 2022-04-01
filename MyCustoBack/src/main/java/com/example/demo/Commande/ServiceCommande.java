package com.example.demo.Commande;
import java.time.LocalDate;
import java.util.List;

public interface ServiceCommande {

    public Commande ajoutCommande(Commande commande,Long id_client);
    public Commande supprimerCommande(Long id_Commande);
    public Commande modifierCommande(Commande commande,Long id_Commande,Long id_admin);
    public Commande valideLivraison(Long id_Commande);
    public Commande Encours(Long id_Commande);
    public List<Commande> listeCommande();
    public List<Commande>  commandeClt(Long id_client);
    public List<Commande>  commandeCltEtat(Long id_client);
    public List<Commande> listeCommandeEnCours();
    public List<Commande> listeCommandeLivrer();
    










}
