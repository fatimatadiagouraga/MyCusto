package com.example.demo.Panier;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryPanier extends JpaRepository<Panier,Long> {
    List<Panier> findPanierByClient(Long id_client);
}
