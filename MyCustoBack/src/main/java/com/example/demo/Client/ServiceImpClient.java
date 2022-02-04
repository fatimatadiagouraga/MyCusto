package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceImpClient implements ServiceClient {
    @Autowired
    RepositoryClient repositoryClient;


    @Override
    public List<Client> List() {
        return repositoryClient.findAll();
    }

    @Override
    public Client AjouterClient(Client client) {
        return repositoryClient.save(client);
    }

    @Override
    public Client ModifierClient(Client client, Long id_client) {
        Client client1 = repositoryClient.findById(id_client).get();
        client1.setNom(client.getNom());
        client1.setPrenom(client.getPrenom());
        client1.setAdresse(client.getAdresse());
        client1.setEmail(client.getEmail());
        client1.setTelephone(client.getTelephone());
        return repositoryClient.save(client1);
    }

    @Override
    public Client ClientById(Long id_client) {
        return repositoryClient.findById(id_client).get();
    }

    @Override
    public String SupprimerClient(Long id_client) {
        repositoryClient.deleteById(id_client);
        return "suppression effectuée avec succèes";

    }
}
