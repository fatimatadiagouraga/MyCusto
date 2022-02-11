package com.example.demo.Administrateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface RepositoryAdmin extends JpaRepository<Administrateur,Long>{

Optional<Administrateur> findByMotdepasseAndLogin(String motdepasse,String login);
Optional<Administrateur> findByEmailAndLogin(String email,String login);


}
