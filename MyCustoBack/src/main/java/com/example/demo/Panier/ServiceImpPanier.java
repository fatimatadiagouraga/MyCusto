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
        int a=1;
        panier.setPlat(plat);
        panier.setClient(client);
        panier.setCommander(false);
        panier.setSupprimer(false);
        panier.setQuantite(a);
        panier.setMontant(plat.getPrix_plat());
        panier.setSelection(false);

        return repositoryPanier.save(panier);
    }

    @Override
    public List<Panier> panierParClt(Long id_client) {
        Client client =repositoryclient.findById(id_client).get();
        return  repositoryPanier.findPanierByClientAndCommander(client,false);
    }

    @Override
    public Panier supprimerPanier(Long id_panier) {
        Panier panier=repositoryPanier.findById(id_panier).get();
        panier.setSupprimer(true);
        panier.setCommander(true);
       return repositoryPanier.save(panier);

    }

    @Override
    public List<Plat> menudujour(LocalDate date) {
        return null;
    }

    @Override
    public Panier updateQ(Long id_panier, int quantite) {
        Panier panier =repositoryPanier.findById(id_panier).get();
        panier.setQuantite(quantite);
        panier.setMontant(panier.getPlat().getPrix_plat() * panier.getQuantite());
        return repositoryPanier.save(panier);
    }

    @Override
    public List<Panier> deselect(Long id_client,Long id_plat) {
        Client client1=repositoryclient.findById(id_client).get();
        Plat plat1 = repositoryPlat.findById(id_plat).get();
        return repositoryPanier.findPanierByCommanderAndClientAndPlat(false,client1,plat1);
    }

    @Override
    public void suppPanierClient(Long id_client) {
        repositoryPanier.deleteAll();
    }
}
