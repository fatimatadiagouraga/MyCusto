package com.example.demo.Panier;

import com.example.demo.Plat.Plat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface Servicepanier {

    public Panier  ajoutPanier(Panier panier,Long id_plat, Long id_client);
    public List<Panier>  panierParClt(Long id_client);
    public Panier supprimerPanier(Long id_panier);
    public List<Plat> menudujour(LocalDate date);

}
