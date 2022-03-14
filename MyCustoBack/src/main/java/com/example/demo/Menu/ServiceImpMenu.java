package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpMenu implements ServiceMenu{
    @Autowired
    RepositoryMenu repositoryMenu;

    @Override
    public Menu ajouterMenu(Menu menu) {
        menu.setEtat(Etat.Activer);
        menu.getDate().getDayOfWeek();
      return   repositoryMenu.save(menu);

    }

    @Override
    public List<Menu> listerMenu() {

        return repositoryMenu.findMenuByEtat(Etat.Activer);
    }

    @Override
    public Menu modifierMenu(Menu menu, Long id_menu) {
        Menu menu1=repositoryMenu.findById(id_menu).get();
        menu1.setNom_menu(menu.getNom_menu());

        menu1.setDescription_menu(menu.getDescription_menu());
        return repositoryMenu.save(menu1);
    }

    @Override
    public Menu supprimerMenu(Long id_menu) {
        Menu menu=repositoryMenu.findById(id_menu).get();
        menu.setEtat(Etat.Desactiver);
        menu.setSupprimer(true);
       return repositoryMenu.save(menu);

    }

    @Override
    public Menu menubyId(Long id_menu) {
        return repositoryMenu.findById(id_menu).get();
    }
}
