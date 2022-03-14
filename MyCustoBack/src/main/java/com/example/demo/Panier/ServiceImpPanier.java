package com.example.demo.Panier;

import com.example.demo.Client.Client;
import com.example.demo.Client.RepositoryClient;
import com.example.demo.Plat.Plat;
import com.example.demo.Plat.RepositoryPlat;
import com.example.demo.Plat.ServiceImpPlat;
import com.example.demo.Plat.ServicePlat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceImpPanier implements Servicepanier{
    @Autowired
    RepositoryPanier repositoryPanier;
    @Autowired
    RepositoryPlat repositoryPlat;
    @Autowired
    RepositoryClient repositoryclient;


    @Override
    public Panier ajoutPanier(Panier panier,Long id_plat, Long id_client) {
        Plat plat= repositoryPlat.findById(id_plat).get();
        Client client=repositoryclient.findById(id_client).get();
        panier.setPlat(plat);
        panier.setClient(client);
        panier.setCommander(false);
        return repositoryPanier.save(panier);
    }

    @Override
    public List<Panier> panierParClt(Long id_client) {
        Client client =repositoryclient.findById(id_client).get();
        return  repositoryPanier.findPanierByClient(client);
    }

    @Override
    public void supprimerPanier(Long id_panier) {
        repositoryclient.deleteById(id_panier);
    }

    @Override
    public List<Plat> menudujour(LocalDate date) {
        return null;
    }

}
