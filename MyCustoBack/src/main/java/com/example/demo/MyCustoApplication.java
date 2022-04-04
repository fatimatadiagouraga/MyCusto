package com.example.demo;

import com.example.demo.Administrateur.Administrateur;
import com.example.demo.Administrateur.Etat;
import com.example.demo.Administrateur.Profil;
import com.example.demo.Administrateur.ServiceImpAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCustoApplication implements CommandLineRunner {

	@Autowired
	ServiceImpAdmin serviceImpAdmin;

	public static void main(String[] args) {
		SpringApplication.run(MyCustoApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Administrateur administrateur=new Administrateur("Diagouraga","Fatimata","Lafiabougou",74424229,"gousstatissta@gmail.com","F","logintima","tatakama1993#", Profil.superadmin, Etat.activer,false);
         serviceImpAdmin.ajouterAdmin(administrateur);
	}
}
