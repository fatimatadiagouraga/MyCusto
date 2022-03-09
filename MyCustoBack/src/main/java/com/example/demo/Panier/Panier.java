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
    @ManyToOne
    private Plat plat;

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
