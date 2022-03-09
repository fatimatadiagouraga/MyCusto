package com.example.demo.Commande;

import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Client.Client;
import com.example.demo.Menu.Menu;
import com.example.demo.Panier.Panier;
import com.example.demo.Plat.Plat;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCommande;
    private LocalDate date = LocalDate.now();
    @Enumerated
    private Etat etat;

    @OneToMany
    List<Panier> panierList;

    @ManyToOne
    private Administrateur administrateur;

    public Commande() {
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public List<Panier> getPanierList() {
        return panierList;
    }

    public void setPanierList(List<Panier> panierList) {
        this.panierList = panierList;
    }

    public Commande(int prix, LocalDate date, Client client, Menu menu) {
        this.date = date;




    }


}