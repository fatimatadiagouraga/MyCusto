package com.example.demo.Ingredient;

import com.example.demo.Plat.Plat;
import javax.persistence.*;
import java.util.List;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredient;
    private String imageIngredient;
    private String nomIngredient;

    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PlatIngredient"
    )
    private List<Plat> plats;*/

    public Ingredient() {
    }

    public Ingredient(String imageIngredient, String nomIngredient, List<Plat> plats) {
        this.imageIngredient = imageIngredient;
        this.nomIngredient = nomIngredient;

    }

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getImageIngredient() {
        return imageIngredient;
    }

    public void setImageIngredient(String imageIngredient) {
        this.imageIngredient = imageIngredient;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }


}
