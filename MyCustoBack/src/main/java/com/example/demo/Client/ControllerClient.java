package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/mycustoApi/client/")
public class ControllerClient {
    @Autowired
    ServiceClient serviceClient;


    //liste globale des Clients
    @GetMapping("listeClient")
    public List<Client> List() {
        return serviceClient.List();

    }

    @PostMapping("ajoutClient")
    public String AjouterClient(@RequestBody Client client) {
        return serviceClient.AjouterClient(client);
    }

    @PutMapping("modifierClient/{id_client}")
    public Client ModifierClient(@RequestBody Client client, @PathVariable Long id_client) {
        return serviceClient.ModifierClient(client, id_client);
    }

    @DeleteMapping("supprimerClient/{id_client}")
    public String SupprimerClient(@PathVariable Long id_client) {
        serviceClient.SupprimerClient(id_client);
        return "suppression effectuée avec succèes";

    }

    @GetMapping("clientById/{id_client}")
    public Client ClientById(@PathVariable Long id_client) {
        return serviceClient.ClientById(id_client);
    }


    @PostMapping("connexion")
    public Optional<Client> connexion(@RequestParam String login, @RequestParam String motdepasse) {
        return serviceClient.connexion(login, motdepasse);
    }
}