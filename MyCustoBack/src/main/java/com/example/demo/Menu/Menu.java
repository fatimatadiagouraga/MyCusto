package com.example.demo.Menu;


import com.example.demo.Commande.Commande;

import com.example.demo.Plat.Plat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;

    @Column(nullable = false)
    private String nom_menu;
    private String description_menu;

    private LocalDate date=LocalDate.now() ;
    private LocalDate d ;



    @Enumerated(EnumType.STRING)
    private Jour menujour;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    private Boolean supprimer=false;

    public Menu() {
    }


    /*@JsonIgnore
    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;*/

    public Long getId_menu() {
        return id_menu;
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

    public LocalDate getD() {
        return d;
    }

    public void setD(LocalDate d) {
        this.d = d;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }

    public Jour getMenujour() {
        return menujour;
    }

    public void setMenujour(Jour menujour) {
        this.menujour = menujour;
    }


}
