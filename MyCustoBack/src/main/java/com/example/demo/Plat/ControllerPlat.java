package com.example.demo.Plat;

import com.example.demo.Menu.Jour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/mycustoapi/plat/")
public class ControllerPlat {
    @Autowired
    ServicePlat servicePlat;


    @PostMapping("ajoutplat")
    public Plat ajouterPlat(Plat plat, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        return servicePlat.ajouterPlat(plat, multipartFile);
    }

    @GetMapping(value = "imageplat/{id_plat}",produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    byte[] getPhoto(@PathVariable("id_plat") long id) throws IOException{
        return servicePlat.getPhoto(id) ;
    }


    //Modification des plats
    @PutMapping("modifierPlat/{id_plat}")
    public Plat modifierPlat(@PathVariable Long id_plat,@RequestBody Plat plat) {
      return  servicePlat.modifierPlat(plat,id_plat);

    }
    //Liste Globale des Plats
    @GetMapping("listePlat")
    public List<Plat> listerPlat() {
        return servicePlat.listerPlat();
    }

    //Suppression Plat
    @DeleteMapping("supprimerPlat/{id_plat}")
    public Plat supprimerPlat(@PathVariable Long id_plat) {
        return servicePlat.supprimerPlat(id_plat);
    }

    //Détails Plat
    @GetMapping("platById/{id_plat}")
    public Plat platbyId(@PathVariable Long id_plat) {
        return servicePlat.platbyId(id_plat);
    }

    //Menu du jour
    @GetMapping("menudujour/{jour}")
    public List<Plat> menudujour(@PathVariable Jour jour){
        return servicePlat.menudujour(jour);
    }

    @GetMapping("listParMenu/{id_menu}")
    public List<Plat> platParMenu(@PathVariable Long id_menu){
        return servicePlat.platParMenu(id_menu);
    }

    @GetMapping("corbeille")
    public  List<Plat> corbeille(){
        return servicePlat.corbeille();
    }

    @DeleteMapping("restaurePlat/{id_plat}")
    public Plat restaurePlat(@PathVariable Long id_plat) {
        return servicePlat.restaurePlat(id_plat);
    }

   }
