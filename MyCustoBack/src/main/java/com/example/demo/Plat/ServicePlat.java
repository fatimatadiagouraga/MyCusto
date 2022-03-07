package com.example.demo.Plat;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service

public interface ServicePlat {
    public Plat ajouterPlat(Plat plat, MultipartFile image) throws IOException;
    public List<Plat> listerPlat();
    public Plat modifierPlat(Plat plat,Long id_plat);
    public String supprimerPlat(Long id_plat);
    public Plat platbyId(Long id_plat);
    public byte[] getPhoto(long id) throws IOException;

}
