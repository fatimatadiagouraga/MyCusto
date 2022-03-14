package com.example.demo.Panier;

import com.example.demo.Client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryPanier extends JpaRepository<Panier,Long> {
    List<Panier> findPanierByClient(Client client);
}
