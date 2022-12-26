package com.example.pharmacieapi.controllers;


import java.util.List;

import com.example.pharmacieapi.entity.Zone;
import com.example.pharmacieapi.repositories.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/zones")
public class ZoneController {

	@Autowired
	private ZoneRepository repository;

	@PostMapping("/save")
	public void save(@RequestBody Zone Zone) {
		repository.save(Zone);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countZone() {
		return repository.count();
	}

	@PutMapping("/update/{id}")
	public void updateById(@PathVariable(value = "id") int id,@RequestBody Zone zone){
		Zone z = repository.findById(id);
		z.setNom(zone.getNom());
		z.setVille(zone.getVille());
		repository.save(z);
	}

	@GetMapping("/getZoneById/{id}")
	public Zone getZoneById(@PathVariable(value = "id") int id){
		return repository.findById(id);
	}
}
/*	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable("id") final int id, @RequestBody User user) {
		Optional<User> e = userService.getUserById(id);
		if(e.isPresent()) {
			User currentUser = e.get();

			String nom = user.getNom();
			if(nom != null) {
				currentUser.setNom(nom);
			}
			String prenom = user.getPrenom();
			if(prenom != null) {
				currentUser.setPrenom(prenom);
			}
			String email = user.getEmail();
			if(email != null) {
				currentUser.setEmail(email);
			}
			String genre = user.getGenre();
			if(genre != null) {
				currentUser.setGenre(genre);
			}
			Date dateNaissance = user.getDateNaissance();
			if(dateNaissance != null){
				currentUser.setDateNaissance(dateNaissance);
			}
			int telephone = user.getTelephone();
			if (String.valueOf(telephone) != null){
				currentUser.setTelephone(telephone);
			}

			userService.saveUser(currentUser);
			return currentUser;
		} else {
			return null;
		}
	}*/