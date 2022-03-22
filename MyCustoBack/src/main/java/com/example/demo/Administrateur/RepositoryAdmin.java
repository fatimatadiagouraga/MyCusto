package com.example.demo.Administrateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface RepositoryAdmin extends JpaRepository<Administrateur,Long>{

Optional<Administrateur> findByMotdepasseAndLoginAndEtat(String motdepasse,String login,Etat etat);
Optional<Administrateur> findByLogin(String login);
Optional<Administrateur> findByEmailAndLogin(String email,String login);
List<Administrateur> findAdministrateurByEtat(Etat etat);
}
