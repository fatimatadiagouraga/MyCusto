package com.example.demo.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface RepositoryClient extends JpaRepository <Client, Long>{

    Optional<Client> findClientByLoginAndMotdepasseAndEtatClient(String motdepasse, String login,EtatClient etatClient);

    Optional<Client> findByLogin(String login);

    List<Client> findClientByEtatClient(EtatClient etatClient);

    Optional<Client> findClientByLogin(String login);


}
