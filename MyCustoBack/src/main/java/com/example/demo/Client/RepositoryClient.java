package com.example.demo.Client;

import com.example.demo.Administrateur.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface RepositoryClient extends JpaRepository <Client, Long>{

    Optional<Client> findClientByLoginAndMotdepasseAndEtatClient(String motdepasse, String login,EtatClient etatClient);

    Optional<Client> findByEmailAndLogin(String email,String login);
}
