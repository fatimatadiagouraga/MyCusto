package com.example.demo.Menu;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ServiceMenu {
    public String ajouterMenu (Menu menu);
    public List<Menu> listerMenu();
    public Menu modifierMenu(Menu menu,Long id_menu);
    public String supprimerMenu(Long id_menu);
}
