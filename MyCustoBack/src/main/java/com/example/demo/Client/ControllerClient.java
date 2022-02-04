package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/mycusto/client/api")
public class ControllerClient {
    @Autowired
   ServiceClient serviceClient;
    

    //liste globale des Clients
    @GetMapping("/listeClient")
    public ResponseEntity<?> list(){
       return new ResponseEntity<>(serviceClient.List(), HttpStatus.OK);
    }
    //ajouter client
    @PostMapping("/ajoutClient")
    public @ResponseBody ResponseEntity<?> save(@RequestBody Client client){
        return new ResponseEntity<>(serviceClient.AjouterClient(client), HttpStatus.OK);
    }
    //modification
    @PutMapping("/modifierClient/{id_client}")
    public @ResponseBody ResponseEntity<?> update(@RequestBody Client client, @PathVariable(name="id_client") Long id_client){
        return new ResponseEntity<>(serviceClient.ModifierClient(client, id_client), HttpStatus.OK);
    }

}
