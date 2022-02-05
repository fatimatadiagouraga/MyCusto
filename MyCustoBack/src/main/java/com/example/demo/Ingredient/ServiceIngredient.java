package com.example.demo.Ingredient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceIngredient {
    public String ajouterIngredient(Ingredient ingredient);
    public String supprimerIgredient(Long idIgredient);
    public Ingredient modifier(Ingredient ingredient,Long idIngredient);
    public List<Ingredient> listerIngredient();
}
