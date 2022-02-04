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
        return repositoryClient.save(client);
    }

    @Override
    public Client ClientById(Long id_client) {
        return repositoryClient.findById(id_client).get();
    }

    @Override
    public void SupprimerAdmin(Long id_client) {
        repositoryClient.deleteById(id_client);

    }
}
