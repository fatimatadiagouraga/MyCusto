package com.example.demo.Panier;

import com.example.demo.Client.Client;
import com.example.demo.Plat.Plat;

import javax.persistence.*;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_panier;
    private Boolean commander;
    private int quantite;
    private int montant;
    private Boolean selection;
    @ManyToOne
    private Plat plat;
    private Boolean supprimer;
    @ManyToOne
    private Client client;




    public Panier() {
    }

    public Long getId_panier() {
        return id_panier;
    }

    public void setId_panier(Long id_panier) {
        this.id_panier = id_panier;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }



    public Boolean getSelection() {
        return selection;
    }

    public void setSelection(Boolean selection) {
        this.selection = selection;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boolean getCommander() {
        return commander;
    }

    public void setCommander(Boolean commander) {
        this.commander = commander;
    }
}
