package com.example.demo.Commande;

import com.example.demo.Client.Client;
import com.example.demo.Menu.Menu;
import com.example.demo.Plat.Plat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCommande;
    private int prix;
    private LocalDate date = LocalDate.now();
    @Enumerated
    private Etat etat;

    public Commande() {
    }

    @ManyToOne
    private Client client;

    @ManyToOne
    private Plat plats;

    @ManyToOne
    private Menu menu;

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Plat getPlats() {
        return plats;
    }

    public void setPlats(Plat plats) {
        this.plats = plats;
    }

    public Commande(int prix, LocalDate date, Client client, Menu menu) {
        this.prix = prix;
        this.date = date;
        this.client = client;
        this.menu = menu;
    }

    public Commande(Plat plats) {
        this.plats = plats;
    }
}
