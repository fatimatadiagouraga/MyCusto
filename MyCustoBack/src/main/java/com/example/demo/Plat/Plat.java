package com.example.demo.Plat;


import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Ingredient.Ingredient;
import com.example.demo.Menu.Menu;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(mappedBy ="platList",  cascade = CascadeType.ALL)
    private List<Menu> menus;


    public Plat(Long id_plat) {
        this.id_plat = id_plat;
    }

    @ManyToMany(cascade = CascadeType.ALL )
   @JoinTable(
           name = "PlatAdmin"
   )
   private List<Administrateur> admin;





    @ManyToMany(mappedBy ="plats",  cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    public List<Administrateur> getAdmin() {
        return admin;
    }

    public void setAdmin(List<Administrateur> admin) {
        this.admin = admin;
    }

    public Plat(List<Administrateur> admin) {
        this.admin = admin;
    }

    public Plat(String nom_plat, String image_plat, String description, Integer recette_plat, List<Menu> menus, List<Ingredient> ingredients) {
        this.nom_plat = nom_plat;
        this.image_plat = image_plat;
        this.description = description;
        this.recette_plat = recette_plat;
        this.menus = menus;
        this.ingredients = ingredients;
    }

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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
