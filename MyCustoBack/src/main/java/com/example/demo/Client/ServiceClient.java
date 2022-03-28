package com.example.demo.Client;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ServiceClient {

  List<Client> List();
   Client AjouterClient(Client client);
   Client ModifierClient(Client client,Long id_client);
   Client ClientById(Long id_client);
   Client SupprimerClient(Long id_client);
   Optional<Client> connexion(String login, String motdepasse);
   List<Client> corbeilleClt();
}
