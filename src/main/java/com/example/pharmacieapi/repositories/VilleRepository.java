package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;




public interface VilleRepository extends JpaRepository<Ville, Integer> {
	
	Ville findById(int id);

}
