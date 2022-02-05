package com.example.demo.Administrateur;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceAdmin {
    public String ajouterAdmin (Administrateur administrateur);
    public List<Administrateur> listerAdmin();
    public Administrateur modifierAdmin(Administrateur administrateur,Long id_admin);
    public String supprimerAdmin(Long id_admin);
    public String login (String motdepasse,String login);
}
