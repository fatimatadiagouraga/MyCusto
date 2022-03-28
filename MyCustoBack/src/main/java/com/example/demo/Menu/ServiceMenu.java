package com.example.demo.Menu;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ServiceMenu {
    public Menu ajouterMenu (Menu menu);
    public List<Menu> listerMenu();
    public Menu modifierMenu(Menu menu,Long id_menu);
    public Menu supprimerMenu(Long id_menu);
    public Menu menubyId(Long id_menu);
    public Menu menuByDate();
    public List<Menu> corbeille();
    public Menu restaureMenu(Long id_menu);

}
