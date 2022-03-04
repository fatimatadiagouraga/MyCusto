package com.example.demo.Menu;


import com.example.demo.Commande.Commande;

import com.example.demo.Plat.Plat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;



    @Column(nullable = false)

    private String nom_menu;
    private String description_menu;
    private LocalDate date;

    public Menu() {
    }


    @JsonIgnore
    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;


    @ManyToMany(mappedBy ="menus",  cascade = CascadeType.ALL)
    private List<Plat> plats;


    /*@JsonIgnore
    @OneToMany(mappedBy = "m")
    private List<MenuPlat> menuPlats;*/




    public Long getId_menu() {
        return id_menu;
    }

    public void setId_menu(Long id_menu) {
        this.id_menu = id_menu;
    }

    public String getNom_menu() {
        return nom_menu;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }

    public void setNom_menu(String nom_menu) {
        this.nom_menu = nom_menu;
    }

    public String getDescription_menu() {
        return description_menu;
    }

    public void setDescription_menu(String description_menu) {
        this.description_menu = description_menu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    public Menu(List<Commande> commandes) {
        this.commandes = commandes;
    }
    public List<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
