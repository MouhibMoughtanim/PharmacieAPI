package com.example.pharmacieapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Pharmacie")
@Table(name = "Pharmacie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String adresse;
	private Double lat;
	private Double log;
	private int etat;

	@ManyToOne
	@JoinColumn(name = "zone_id")
	private Zone zone;

	@OneToMany(mappedBy = "pharmacie",fetch = FetchType.EAGER)
	@JsonIgnore
	private List<PharmacieDeGarde> gardes ;

	@OneToOne
	@JoinColumn(name = "user_id")

	private User user;


}
