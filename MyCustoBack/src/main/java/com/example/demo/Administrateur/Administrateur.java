package com.example.demo.Administrateur;

import com.example.demo.Menu.Menu;
import com.example.demo.Plat.Plat;

import javax.persistence.*;
import java.util.List;

@Entity
public class Administrateur {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Long id_admin;
        private String nom ;
        private String prenom;
        private String adresse;
        private int telephone;
        private String email ;
        private String genre;
        @Column(nullable = false)
        private String login;
        @Column(nullable = false)
        private String motdepasse;
        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Profil profil;
        @Enumerated(EnumType.STRING)
        private Etat etat=Etat.activer;
        private Boolean supprimer=false;

        /*@ManyToMany(mappedBy ="admin",  cascade = CascadeType.ALL)
        private List<Plat> pla;*/

        public Long getId_admin() {
                return id_admin;
        }



        public void setId_admin(Long id_admin) {
                this.id_admin = id_admin;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public String getAdresse() {
                return adresse;
        }

        public void setAdresse(String adresse) {
                this.adresse = adresse;
        }

        public int getTelephone() {
                return telephone;
        }

        public void setTelephone(int telephone) {
                this.telephone = telephone;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getMotdepasse() {
                return motdepasse;
        }

        public void setMotdepasse(String motdepasse) {
                this.motdepasse = motdepasse;
        }

        public Profil getProfil() {
                return profil;
        }

        public void setProfil(Profil profil) {
                this.profil = profil;
        }

        public Etat getEtat_admin() {
                return etat;
        }

        public void setEtat_admin(Etat etat_admin) {
                this.etat = etat_admin;
        }

        public Boolean getSupprimer() {
                return supprimer;
        }

        public void setSupprimer(Boolean supprimer) {
                this.supprimer = supprimer;
        }

        public Administrateur() {
        }

        public Administrateur(String nom, String prenom, String adresse, int telephone, String email, String genre, String login, String motdepasse, Profil profil, Etat etat, Boolean supprimer) {
                this.nom = nom;
                this.prenom = prenom;
                this.adresse = adresse;
                this.telephone = telephone;
                this.email = email;
                this.genre = genre;
                this.login = login;
                this.motdepasse = motdepasse;
                this.profil = profil;
                this.etat = etat;
                this.supprimer = supprimer;
        }
}
