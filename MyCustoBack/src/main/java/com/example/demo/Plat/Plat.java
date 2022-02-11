package com.example.demo.Plat;


import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Client.Client;
import com.example.demo.Commande.Commande;
import com.example.demo.Ingredient.Ingredient;
import com.example.demo.Menu.Menu;

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
    private Integer recette_plat  ;
    private Boolean selected=false;
    private int prix_plat;


    @JsonIgnore
    @OneToMany(mappedBy = "plats")
    private List<Commande> command;

    @ManyToMany(mappedBy ="platList",  cascade = CascadeType.ALL)
    private List<Menu> menus;



    @ManyToMany(cascade = CascadeType.ALL )
   @JoinTable(
           name = "PlatAdmin"
   )
   private List<Administrateur> admin;

    @ManyToMany(mappedBy ="plats",  cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    public Plat() {}

    public Plat(String nom_plat, String image_plat, String description, Integer recette_plat, Boolean selected, int prix_plat, List<Client> clients, List<Menu> menus, List<Administrateur> admin, List<Ingredient> ingredients) {
        this.nom_plat = nom_plat;
        this.image_plat = image_plat;
        this.description = description;
        this.recette_plat = recette_plat;
        this.selected = selected;
        this.prix_plat = prix_plat;
        this.menus = menus;
        this.admin = admin;
        this.ingredients = ingredients;
    }

    public Plat(List<Commande> command) {
        this.command = command;
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

    public Integer getRecette_plat() {
        return recette_plat;
    }

    public void setRecette_plat(Integer recette_plat) {
        this.recette_plat = recette_plat;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public int getPrix_plat() {return prix_plat;}

    public void setPrix_plat(int prix_plat) {
        this.prix_plat = prix_plat;
    }



    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
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

    public List<Commande> getCommand() {
        return command;
    }

    public void setCommand(List<Commande> command) {
        this.command = command;
    }
}
