package com.example.demo.Panier;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Servicepanier {

    public Panier ajoutPanier(Panier panier,Long id_plat, Long id_client);
    public Panier panierParClt(Long id_client);
    public void supprimerPanier(Long id_panier);

}
