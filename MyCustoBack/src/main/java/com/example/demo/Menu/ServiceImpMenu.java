package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Service
public class ServiceImpMenu implements ServiceMenu{
    @Autowired
    RepositoryMenu repositoryMenu;

    @Override
    public Menu ajouterMenu(Menu menu) {
        menu.setEtat(Etat.Activer);
        return repositoryMenu.save(menu);

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
        menu1.setD(menu.getD());

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

    @Override
    public Menu menuByDate() {
        Menu menu = repositoryMenu.findByDateAndEtat(LocalDate.now(), Etat.Activer);
        if (menu!=null){
            return menu;
        }else{
            LocalDate yesterday = LocalDate.now().minusDays(1);
            return repositoryMenu.findByDateAndEtat(yesterday, Etat.Activer);
        }
    }

    @Override
    public List<Menu> corbeille() {
        return repositoryMenu.findMenuByEtat(Etat.Desactiver);
    }

    @Override
    public Menu restaureMenu(Long id_menu) {
        Menu menu=repositoryMenu.findById(id_menu).get();
        menu.setEtat(Etat.Activer);
        menu.setSupprimer(false);
        return repositoryMenu.save(menu);

    }
}
