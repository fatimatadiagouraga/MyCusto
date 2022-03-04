package com.example.demo.Plat;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryPlat extends JpaRepository<Plat,Long> {
    List<Plat> findPlatByEtat(Etat etat);

}
