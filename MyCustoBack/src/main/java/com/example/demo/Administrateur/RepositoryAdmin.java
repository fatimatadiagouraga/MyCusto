package com.example.demo.Administrateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryAdmin extends JpaRepository<Administrateur,Long>{



}
