package com.example.demo.Plat;


import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Commande.Commande;
import com.example.demo.Ingredient.Ingredient;
import com.example.demo.MenuPlat.MenuPlat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity

public class Plat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_plat;
    private String nom_plat;
    private String image_plat;
    private String description;
    private int prix_plat;
    private Boolean supprimer=false;
    @Enumerated
    private Etat etat;


    @ManyToMany(cascade = CascadeType.ALL )
    @JoinTable(name = "PlatAdmin")
    private List<Administrateur> admin;

    @ManyToMany(mappedBy ="plats",  cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    @JsonIgnore
    @OneToMany(mappedBy = "p")
    private List<MenuPlat> menuPlats;

    public Plat() {}

    public Plat(String nom_plat, String image_plat, String description,Etat etat ,Boolean supprimer,int prix_plat, List<Administrateur> admin, List<Ingredient> ingredients) {
        this.nom_plat = nom_plat;
        this.image_plat = image_plat;
        this.description = description;
        this.prix_plat = prix_plat;
        this.admin = admin;
        this.ingredients = ingredients;
        this.etat = etat;
        this.supprimer = supprimer;

    }



    public Long getId_plat() {
        return id_plat;
    }

    public Plat(Long id_plat) {
        this.id_plat = id_plat;
    }

    public void setId_plat(Long id_plat) {
        this.id_plat = id_plat;
    }

    public String getNom_plat() {
        return nom_plat;
    }

    public void setNom_plat(String nom_plat) {
        this.nom_plat = nom_plat;
    }

    public String getImage_plat() {return image_plat;}

    public void setImage_plat(String image_plat) {
        this.image_plat = image_plat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix_plat() {return prix_plat;}

    public void setPrix_plat(int prix_plat) {
        this.prix_plat = prix_plat;
    }

    public List<Administrateur> getAdmin() {
        return admin;
    }

    public void setAdmin(List<Administrateur> admin) {
        this.admin = admin;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public List<MenuPlat> getMenuPlats() {
        return menuPlats;
    }

    public void setMenuPlats(List<MenuPlat> menuPlats) {
        this.menuPlats = menuPlats;
    }
}
