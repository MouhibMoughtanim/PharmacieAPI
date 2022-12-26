package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
	
	Pharmacie findById(int id);

}
