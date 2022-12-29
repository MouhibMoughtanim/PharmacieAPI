package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.PharmacieDeGarde;
import com.example.pharmacieapi.entity.PharmacieDeGardeRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacieDeGardeRepository extends JpaRepository<PharmacieDeGarde, PharmacieDeGardeRelation> {
}
