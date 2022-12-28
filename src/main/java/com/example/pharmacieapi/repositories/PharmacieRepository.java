package com.example.pharmacieapi.repositories;

import com.example.pharmacieapi.entity.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {

	@Query("select p from Pharmacie p where p.etat=0")
	List<Pharmacie> findAllPharmacieAttente();

	@Query("select p from Pharmacie p where p.etat=1")
	List<Pharmacie> findAllPharmacieAccepte();

	@Query("select p from Pharmacie p where p.etat=2")
	List<Pharmacie> findAllPharmacieRefus();

	@Query("select p from Pharmacie p where p.zone.ville.id =:id and p.etat=1")
	List<Pharmacie> findAllPharmacieByVille(@Param("id") int id);

	@Query("select p from Pharmacie p where p.zone.id =:id and p.etat=1")
	List<Pharmacie> findAllPharmacieByZone(@Param("id") int id);

}
