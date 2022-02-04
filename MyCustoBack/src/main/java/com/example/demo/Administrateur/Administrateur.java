package com.example.demo.Administrateur;

import javax.persistence.*;

@Entity
public class Administrateur {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Long id_admin;
        private String nom ;
        private String prenom;
        private String adresse;
        private int téléphone;
        private String email ;
        private String genre;
        @Column(nullable = false)
        private String login;
        @Column(nullable = false)
        private int motdepasse;
        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Profil profil;

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

        public int getTéléphone() {
                return téléphone;
        }

        public void setTéléphone(int téléphone) {
                this.téléphone = téléphone;
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

        public int getMotdepasse() {
                return motdepasse;
        }

        public void setMotdepasse(int motdepasse) {
                this.motdepasse = motdepasse;
        }

        public Profil getProfil() {
                return profil;
        }

        public void setProfil(Profil profil) {
                this.profil = profil;
        }

        public Administrateur() {
        }

        public Administrateur(String nom, String prenom, String adresse, int téléphone, String email, String genre, String login, int motdepasse, Profil profil) {
                this.nom = nom;
                this.prenom = prenom;
                this.adresse = adresse;
                this.téléphone = téléphone;
                this.email = email;
                this.genre = genre;
                this.login = login;
                this.motdepasse = motdepasse;
                this.profil = profil;



        }
}
