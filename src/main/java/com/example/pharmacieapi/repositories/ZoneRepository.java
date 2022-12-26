package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	
	Zone findById(int id);

}
