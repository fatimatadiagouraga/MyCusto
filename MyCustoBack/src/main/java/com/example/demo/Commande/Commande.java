package com.example.demo.Commande;

import com.example.demo.Client.Client;
import com.example.demo.Menu.Menu;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idCommande;
    private int prix;
    private LocalDate date = LocalDate.now();


    @OneToOne
    private Client client;

    @OneToOne
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

    public Commande(int prix, LocalDate date, Client client, Menu menu) {
        this.prix = prix;
        this.date = date;
        this.client = client;
        this.menu = menu;
    }
}
