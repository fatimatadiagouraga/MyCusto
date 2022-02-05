package com.example.demo.Menu;

import com.example.demo.Client.Client;
import com.example.demo.Commande.Commande;
import com.example.demo.Plat.Plat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;
    @Column(nullable = false)
    private String image_menu;
    private String nom_menu;
    private String description_menu;
    private LocalDate date;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Selection")
    private List<Plat> platList;

    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;

    public Menu(String image_menu, String nom_menu, String description_menu, LocalDate date, List<Plat> platList, List<Commande> commandes) {
        this.image_menu = image_menu;
        this.nom_menu = nom_menu;
        this.description_menu = description_menu;
        this.date = date;
        this.platList = platList;
        this.commandes = commandes;
    }

    public Long getId_menu() {
        return id_menu;
    }

    public void setId_menu(Long id_menu) {
        this.id_menu = id_menu;
    }

    public String getImage_menu() {
        return image_menu;
    }

    public void setImage_menu(String image_menu) {
        this.image_menu = image_menu;
    }

    public String getNom_menu() {
        return nom_menu;
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

    public List<Plat> getPlatList() {
        return platList;
    }

    public void setPlatList(List<Plat> platList) {
        this.platList = platList;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
