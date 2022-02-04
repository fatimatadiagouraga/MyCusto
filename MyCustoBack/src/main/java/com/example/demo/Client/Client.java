package com.example.demo.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    

}

