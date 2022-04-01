package com.example.demo.Commande;
import com.example.demo.Client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface RepositoryCommande extends JpaRepository<Commande,Long> {
    List<Commande> findCommandeByEtat(Etat etat);
    List<Commande> findCommandeByClientAndSupprimerAndEtat(Client client,Boolean supprimer,Etat etat);
    List<Commande> findCommandeByClientAndEtat(Client client,Etat etat );
    List<Commande> findCommandeByDate(LocalDate date);


}