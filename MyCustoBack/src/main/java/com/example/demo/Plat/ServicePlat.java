package com.example.demo.Plat;

import java.util.List;

public interface ServicePlat {
    public String ajouterPlat(Plat plat);
    public List<Plat> listerPlat();
    public String modifierPlat(Plat plat,Long id_plat);
    public String supprimerPlat(Long id_plat);
    public String platbyId(Long id_plat);
}
