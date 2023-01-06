package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.entity.PharmacieDeGarde;
import com.example.pharmacieapi.entity.PharmacieDeGardeRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PharmacieDeGardeRepository extends JpaRepository<PharmacieDeGarde, PharmacieDeGardeRelation> {

    List<PharmacieDeGarde> findAllByPharmacie(Pharmacie pharmacie);

    @Query("select pg from PharmacieDeGarde pg where CURRENT_DATE NOT BETWEEN pg.PharmacieDeGardeRelation.dateDebut and pg.dateFin")
    List<PharmacieDeGarde> findAllPharmacieDispo();

    @Query("select pg from PharmacieDeGarde pg where CURRENT_DATE BETWEEN pg.PharmacieDeGardeRelation.dateDebut and pg.dateFin ")
    List<PharmacieDeGarde> findAllPharmacieEnGarde();
}
