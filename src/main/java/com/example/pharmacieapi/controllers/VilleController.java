package com.example.pharmacieapi.controllers;


import java.util.List;

import com.example.pharmacieapi.entity.Ville;
import com.example.pharmacieapi.entity.Zone;
import com.example.pharmacieapi.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/villes")
public class VilleController {

	@Autowired
	private VilleRepository repository;

	@PostMapping("/save")
	public Ville save(@RequestBody Ville ville) {
		return repository.save(ville);

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Ville s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}

	@GetMapping("/all")
	public List<Ville> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countVille() {
		return repository.count();
	}
    
	@GetMapping("/zonesByVille/{id}")
	public List<Zone> findZone(@PathVariable(required = true) String id) {
		Ville s = repository.findById(Integer.parseInt(id));
		return s.getZones();
	}

	@GetMapping("/getVilleById/{id}")
	public Ville getVilleById(@PathVariable(value = "id") int id){
		return repository.findById(id);
	}

	@PutMapping("/update/{id}")
	public void updateById(@PathVariable(value = "id") int id,@RequestBody Ville ville){
		Ville v = repository.findById(id);
		v.setNom(ville.getNom());
		repository.save(v);
	}
}
