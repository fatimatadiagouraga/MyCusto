package com.example.demo.Plat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Plat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_plat;
    private String nom_plat;
    private String image_plat;
    private String description;
    private Integer recette_plat;

    public Long getId_plat() {
        return id_plat;
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

    public String getImage_plat() {
        return image_plat;
    }

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
}
