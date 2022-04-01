package com.example.demo.Plat;

import com.example.demo.Menu.Jour;
import com.example.demo.Menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RepositoryPlat extends JpaRepository<Plat,Long> {

    @Query("SELECT plat FROM Plat plat WHERE plat.etat=:etat AND plat.menu.etat=:etat")
    List<Plat> findPlatByEtatAndMenu(@Param("etat") Etat etat);

    List<Plat> findPlatByEtat(Etat etat);


    @Query("Select plat from Plat plat where plat.menu.menujour=:jour")
    List<Plat> findPlatByMenu(@Param("jour") Jour jour);
    List<Plat> findPlatByMenuAndEtat(Menu menu,Etat etat);
    Menu findPlatByMenu(Menu menu);

}
