package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ServiceImpClient implements ServiceClient {
        @Autowired
        RepositoryClient repositoryClient;


        @Override
        public List<Client> List() {

            return repositoryClient.findClientByEtatClient(EtatClient.Activer);
        }

        @Override
        public Client AjouterClient(Client client) {
            Optional<Client> optionalClient=repositoryClient.findByLogin(client.getLogin());
            if (optionalClient.isPresent()){
                return null;
            }else{
                client.setEtatClient(EtatClient.Activer);
                client.setSupprimer(false);
                return repositoryClient.save(client);

        }}

        @Override
        public Client ModifierClient(Client client, Long id_client) {

            Client client1 = repositoryClient.findById(id_client).get();
            client1.setNom(client.getNom());
            client1.setPrenom(client.getPrenom());
            client1.setAdresse(client.getAdresse());
            client1.setEmail(client.getEmail());
            client1.setTelephone(client.getTelephone());
            client1.setLogin(client.getLogin());
            client1.setMotdepasse(client.getMotdepasse());
            Optional<Client> c = repositoryClient.findClientByLogin(client1.getLogin());
            if (c.isPresent()) {
                return null;
            } else {
                return repositoryClient.save(client1);
            }
        }


        @Override
        public Client ClientById(Long id_client) {
            return repositoryClient.findById(id_client).get();
        }

        @Override
        public Client SupprimerClient(Long id_client) {
            Client c =repositoryClient.findById(id_client).get();
            c.setSupprimer(true);
            c.setEtatClient(EtatClient.Desactiver);
            return repositoryClient.save(c);


        }

        @Override
        public Optional<Client> connexion(String login, String motdepasse) {
           return repositoryClient.findClientByLoginAndMotdepasseAndEtatClient(login,motdepasse,EtatClient.Activer);

        }

        @Override
        public List<Client> corbeilleClt() {
            return repositoryClient.findClientByEtatClient(EtatClient.Desactiver);
        }


}
