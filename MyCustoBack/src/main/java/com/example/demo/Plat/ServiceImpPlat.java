package com.example.demo.Plat;


import com.example.demo.FileUploadUtil;
import com.example.demo.Menu.Jour;
import com.example.demo.Menu.RepositoryMenu;
import com.example.demo.Panier.Panier;
import com.example.demo.Panier.RepositoryPanier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service

public class ServiceImpPlat implements ServicePlat {


    @Autowired
    RepositoryPlat repositoryPlat;
    @Autowired
    RepositoryMenu repositoryMenu;
    @Autowired
    RepositoryPanier repositoryPanier;
    private Panier panier;
    private int somme;


    @Override
    public Plat ajouterPlat(Plat plat, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        plat.setImage_plat(fileName);
        Plat savedPlat = repositoryPlat.save(plat);
        String uploadDir = "src/main/resources/Photos/" + savedPlat.getId_plat();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return savedPlat;


    }

    @Override
    public List<Plat> listerPlat() {

        return repositoryPlat.findPlatByEtat(Etat.Activer);
    }

    @Override
    public Plat modifierPlat(Plat plat,Long id_plat) {
        Plat plat1 = repositoryPlat.findById(id_plat).get();
        plat1.setNom_plat(plat.getNom_plat());
        plat1.setMenu(plat.getMenu());
        plat1.setIngredients(plat.getIngredients());
        //plat1.setImage_plat(plat.getImage_plat());//
        plat1.setPrix_plat(plat.getPrix_plat());
        plat1.setDescription(plat.getDescription());
        return repositoryPlat.save(plat1);

    }

    @Override
    public Plat supprimerPlat(Long id_plat) {
        Plat p = repositoryPlat.findById(id_plat).get();
        p.setSupprimer(true);
        p.setEtat(Etat.Desactiver);
        return repositoryPlat.save(p) ;
    }

    @Override
    public Plat platbyId(Long id_plat) {
       return repositoryPlat.findById(id_plat).get();

    }

    @Override
    public byte[] getPhoto(long id_plat) throws IOException {
        Plat plat = repositoryPlat.findById(id_plat).get();
        String photo = plat.getImage_plat();
        File file = new File("src/main/resources/Photos/" +plat.getId_plat() + "/" +photo);
        Path path = Paths.get(file.toURI());

        return Files.readAllBytes(path);
    }

    @Override
    public List<Plat> menudujour(Jour jour) {

        return repositoryPlat.findPlatByMenu(jour);
    }

    @Override
    public List<Plat> mj() {

        return null;
    }

    /*@Override
    public Plat platForPanier(Plat p, Long id_plat) {
        repositoryPlat.findById(id_plat).get();
        somme+= p.getPrix_plat();
        panier.setNom_plat(p.getNom_plat());
        panier.setPrix_plat(p.getPrix_plat());
        panier.setPrix_total(somme);
        return null;
    }*/


}
