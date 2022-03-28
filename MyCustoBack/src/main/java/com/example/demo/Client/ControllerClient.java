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
    public Client AjouterClient(@RequestBody Client client) {
        return serviceClient.AjouterClient(client);
    }

    @PutMapping("modifierClient/{id_client}")
    public Client ModifierClient(@RequestBody Client client, @PathVariable Long id_client) {
        return serviceClient.ModifierClient(client, id_client);
    }

    @DeleteMapping("supprimerClient/{id_client}")
    public Client SupprimerClient(@PathVariable Long id_client) {
        return  serviceClient.SupprimerClient(id_client);


    }

    @GetMapping("clientById/{id_client}")
    public Client ClientById(@PathVariable Long id_client) {
        return serviceClient.ClientById(id_client);
    }


    @GetMapping("login")
    public Optional<Client> connexion(@RequestParam String login, @RequestParam String motdepasse) {
        return serviceClient.connexion(login, motdepasse);
    }

   @GetMapping("corbeille")
    public  List<Client> corb(){
        return serviceClient.corbeilleClt();
   }
}