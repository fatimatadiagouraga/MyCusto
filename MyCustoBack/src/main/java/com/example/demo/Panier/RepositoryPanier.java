package com.example.demo.Panier;

import com.example.demo.Client.Client;
import com.example.demo.Plat.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryPanier extends JpaRepository<Panier,Long> {
    List<Panier> findPanierByClientAndCommander(Client client,Boolean commander);
    List<Panier> findPanierByCommanderAndClientAndPlat(Boolean commander, Client client, Plat plat);
}
