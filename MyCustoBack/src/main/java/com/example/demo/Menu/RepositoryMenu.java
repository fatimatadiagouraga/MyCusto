package com.example.demo.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryMenu extends JpaRepository<Menu,Long> {

    List<Menu> findMenuByEtat(Etat etat);
}
