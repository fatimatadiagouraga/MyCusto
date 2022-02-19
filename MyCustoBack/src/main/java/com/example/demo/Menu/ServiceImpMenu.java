package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpMenu implements ServiceMenu{
    @Autowired
    RepositoryMenu repositoryMenu;

    @Override
    public String ajouterMenu(Menu menu) {
        repositoryMenu.save(menu);
        return "Ajout effectué avec succès";
    }

    @Override
    public List<Menu> listerMenu() {
        return repositoryMenu.findAll();
    }

    @Override
    public Menu modifierMenu(Menu menu, Long id_menu) {
        Menu menu1=repositoryMenu.findById(id_menu).get();
        menu1.setNom_menu(menu.getNom_menu());

        menu1.setDescription_menu(menu.getDescription_menu());
        return repositoryMenu.save(menu1);
    }

    @Override
    public String supprimerMenu(Long id_menu) {
        repositoryMenu.deleteById(id_menu);
        return "suppression effectuée avec succès";
    }
}
