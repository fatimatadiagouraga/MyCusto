package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/mycusto/client/api/")
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
    public Client ModifierClient(Client client, Long id_client){
       return serviceClient.ModifierClient(client,id_client);
    }
    @DeleteMapping("supprimerClient/{id_client}")
    public String SupprimerClient(Long id_client) {
        serviceClient.SupprimerClient(id_client);
        return "suppression effectuée avec succèes";

    }
    @GetMapping("clientById/{id_client}")
    public Client ClientById(Long id_client) {
        return serviceClient.ClientById(id_client);
    }

}
