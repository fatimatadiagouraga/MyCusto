package com.example.demo.Commande;
import com.example.demo.Client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RepositoryCommande extends JpaRepository<Commande,Long> {

}