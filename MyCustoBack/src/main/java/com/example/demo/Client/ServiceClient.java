package com.example.demo.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceClient {

  List<Client> List();
   String AjouterClient(Client client);
   Client ModifierClient(Client client,Long id_client);
   Client ClientById(Long id_client);
   String SupprimerClient(Long id_client);
   String connexion(String login,String motdepasse);
}
