package com.example.demo.Client;

import java.util.List;

public interface ServiceClient {
  List<Client> List();
  Client AjouterClient(Client client);
  Client ModifierClient(Client client,Long id_client);

  Client ClientById(Long id_client);
  void SupprimerAdmin(Long id_client);
}
