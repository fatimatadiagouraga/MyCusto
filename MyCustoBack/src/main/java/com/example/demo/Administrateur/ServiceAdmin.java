package com.example.demo.Administrateur;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ServiceAdmin {
    public Administrateur ajouterAdmin (Administrateur administrateur);
    public List<Administrateur> listerAdmin();
    public Administrateur modifierAdmin(Administrateur administrateur,Long id_admin);
    public Administrateur supprimerAdmin(Long id_admin);
    public Optional<Administrateur> login (String motdepasse, String login);
    public Administrateur adminById(Long id_admin);
    public List<Administrateur> corbeille();
    public Administrateur restaureAdmin(Long id_admin);

}
