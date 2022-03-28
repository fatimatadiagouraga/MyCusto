package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/mycustoapi/menu/")
public class ControllerMenu {
    @Autowired
    ServiceMenu serviceMenu;



    @PostMapping("ajoutMenu")
    public Menu ajouterMenu(@RequestBody Menu menu) {
        return   serviceMenu.ajouterMenu(menu);

    }

    @GetMapping("listeMenu")
    public List<Menu> listerMenu() {
        return serviceMenu.listerMenu();
    }

    @PutMapping("modifierMenu/{id_menu}")
    public Menu modifierMenu(@RequestBody Menu menu,@PathVariable Long id_menu) {
        return serviceMenu.modifierMenu(menu,id_menu);
    }

    @DeleteMapping("supprimerMenu/{id_menu}")
    public Menu supprimerMenu(@PathVariable Long id_menu) {
        return serviceMenu.supprimerMenu(id_menu);}

    @GetMapping("menubyId/{id_menu}")
    public Menu menubyId(@PathVariable Long id_menu) {
        return serviceMenu.menubyId(id_menu);
    }

    @GetMapping("date")
    public Menu menuByDate(){
        return serviceMenu.menuByDate();
    }

    @GetMapping("corbeille")
        public List<Menu> corbeille(){
            return serviceMenu.corbeille();
        }

    @DeleteMapping("restaureMenu/{id_menu}")
    public Menu restaureMenu(@PathVariable Long id_menu) {
        return serviceMenu.restaureMenu(id_menu);}


}
