package com.example.demo.Menu;

import javax.persistence.*;
import java.time.LocalDate;

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

    public Menu() {
    }

    public Menu(String image_menu, String nom_menu, String description_menu, LocalDate date) {
        this.image_menu = image_menu;
        this.nom_menu = nom_menu;
        this.description_menu = description_menu;
        this.date = date;
    }

    public Long getId_menu() {
        return id_menu;
    }

    public String getImage_menu() {
        return image_menu;
    }

    public void setImage_menu(String image_menu) {
        this.image_menu = image_menu;
    }

    public String getDescription_menu() {
        return description_menu;
    }

    public void setDescription_menu(String description_menu) {
        this.description_menu = description_menu;
    }

    public void setId_menu(Long id_menu) {
        this.id_menu = id_menu;
    }

    public String getNom_menu() {
        return nom_menu;
    }

    public void setNom_menu(String nom_menu) {
        this.nom_menu = nom_menu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
