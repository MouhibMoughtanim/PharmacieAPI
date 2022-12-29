package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface VilleRepository extends JpaRepository<Ville, Integer> {

    @Query("select v.nom ,(select count(p) from Pharmacie p where p.zone.ville.id=v.id) from Ville v group by v.nom")
    List findNbrPharmacieVille();

}
