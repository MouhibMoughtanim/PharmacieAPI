package com.example.pharmacieapi.controllers;

import java.util.List;

import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.repositories.PharmacieRepository;
import com.example.pharmacieapi.service.PharmacieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pharmacies")
@CrossOrigin("http://localhost:3000")
public class PharmacieController {

	@Autowired
	private PharmacieService service;

	@PostMapping("/add")
	public Pharmacie save(@RequestBody Pharmacie p) {
		p.setEtat(0);
		return service.addPharmacie(p);
	}

	@GetMapping("/all")
	public List<Pharmacie> findAllPharmacie(){
		return service.findAllPharmacie();
	}

	@GetMapping("/allEnAttente")
	public List<Pharmacie> findAllPharmacieEnAttente(){
		return service.findAllPharmacieEnAttente();
	}

	@GetMapping("/allAccepte")
	public List<Pharmacie> findAllPharmacieAccepte(){
		return service.findAllPharmacieAccepte();
	}

	@GetMapping("/allRefus")
	public List<Pharmacie> findAllPharmacieRefus(){
		return service.findAllPharmacieRefus();
	}

	@GetMapping("/pharmacie/id={id}")
	public Pharmacie findPharmacieById(@PathVariable int id){
		return service.findPharmacieById(id);
	}

	@GetMapping("/pharmacie/ville={id}")
	public List<Pharmacie> findPharmacieByVille(@PathVariable int id){
		return service.findAllPharmacieByVille(id);
	}

	@GetMapping("/pharmacie/zone={id}")
	public List<Pharmacie> findPharmacieByZone(@PathVariable int id){
		return service.findAllPharmacieByZone(id);
	}

	@PutMapping("/acceptePharmacie/id={id}")
	public Pharmacie acceptePharmacie(@PathVariable int id){

		return service.acceptePharmacie(id);
	}

	@PutMapping("/refusPharmacie/id={id}")
	public Pharmacie refusPharmacie(@PathVariable int id){

		return service.refusPharmacie(id);
	}

	@PutMapping("/updatePharmacie/id={id}")
	public Pharmacie updatePharmacie(@RequestBody Pharmacie p,@PathVariable int id){

		return service.updatePharmacie(p,id);
	}

	@DeleteMapping("/deletePharmacie/id={id}")
	public String deletePharmacie(@PathVariable int id){
		return service.deletePharmacie(id);
	}
}