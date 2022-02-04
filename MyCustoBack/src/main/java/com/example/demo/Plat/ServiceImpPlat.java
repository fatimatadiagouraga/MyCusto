package com.example.demo.Plat;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpPlat implements ServicePlat{

    @Autowired
    RepositoryPlat repositoryPlat;
    @Override
    public String ajouterPlat(Plat plat) {
        repositoryPlat.save(plat);
        return "ajout avec succès";
    }

    @Override
    public List<Plat> listerPlat() {
        return repositoryPlat.findAll();
    }

    @Override
    public String modifierPlat(Plat plat, Long id_plat) {
        Plat plat1 = repositoryPlat.findById(id_plat).get();
        plat1.setNom_plat(plat.getNom_plat());
        plat1.setImage_plat(plat.getImage_plat());
        plat1.setDescription(plat.getDescription());
        plat1.setRecette_plat(plat.getRecette_plat());
        repositoryPlat.save(plat1);
        return "modification avec succès";
    }

    @Override
    public String supprimerPlat(Long id_plat) {
        repositoryPlat.deleteById(id_plat);
        return "supprimer avec succès";
    }

    @Override
    public String platbyId(Long id_plat) {
        repositoryPlat.findById(id_plat).get();
        return null;
    }
}
