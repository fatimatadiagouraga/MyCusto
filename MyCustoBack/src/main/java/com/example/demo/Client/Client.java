package com.example.demo.Client;

import com.example.demo.Commande.Commande;
import com.example.demo.Plat.Plat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity

public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private String motdepasse;
    private String login;
    @Enumerated(EnumType.STRING)
    private EtatClient etatClient;

    private Boolean supprimer=false;


    public Client(String motdepasse, String login) {
        this.motdepasse = motdepasse;
        this.login = login;
    }

    public Client() {}

    public Client(String nom, String prenom, String adresse, String telephone,EtatClient etatClient, Boolean supprimer, String email, String motdepasse, String login, List<Commande> commandes, List<Plat> plats) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.motdepasse = motdepasse;
        this.login = login;

        this.etatClient = etatClient ;
        this.supprimer = supprimer;

    }



    public Long getId_client() {
        return id_client;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    public EtatClient getEtatClient() {
        return etatClient;
    }

    public void setEtatClient(EtatClient etatClient) {
        this.etatClient = etatClient;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }
}




