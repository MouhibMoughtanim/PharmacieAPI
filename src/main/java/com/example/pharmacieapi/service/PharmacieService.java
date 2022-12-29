package com.example.pharmacieapi.service;

import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.repositories.PharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacieService {

    @Autowired
    private PharmacieRepository repository;

    public Pharmacie addPharmacie(Pharmacie p){
        return repository.save(p);
    }

    public List<Pharmacie> findAllPharmacie(){

        return repository.findAll();
    }

    public Pharmacie  findPharmacieById(int id){

        return repository.findById(id).orElse(null);
    }

    public String deletePharmacie(int id){
        repository.deleteById(id);
        return "Pharmacie "+id+" est supprimé !!";
    }

    public Pharmacie updatePharmacie(Pharmacie p,int id){
        return repository.findById(id).map(
                pharmacie -> {
                    pharmacie.setNom(p.getNom());
                    pharmacie.setAdresse(p.getAdresse());
                    pharmacie.setLat(p.getLat());
                    pharmacie.setLog(p.getLog());
                    pharmacie.setZone(p.getZone());
                    return repository.save(pharmacie);
                }
        ).orElse(null);
    }

    public Pharmacie acceptePharmacie(int id){
        return repository.findById(id).map(
                pharmacie -> {
                    pharmacie.setEtat(1);
                    return repository.save(pharmacie);
                }
        ).orElse(null);
    }

    public Pharmacie refusPharmacie(int id){
        return repository.findById(id).map(
                pharmacie -> {
                    pharmacie.setEtat(2);
                    return repository.save(pharmacie);
                }
        ).orElse(null);
    }

    public List<Pharmacie> findAllPharmacieEnAttente() {
        return repository.findAllPharmacieAttente();
    }

    public List<Pharmacie> findAllPharmacieAccepte() {
        return repository.findAllPharmacieAccepte();
    }

    public List<Pharmacie> findAllPharmacieRefus() {
        return repository.findAllPharmacieRefus();
    }

    public List<Pharmacie> findAllPharmacieByVille(int id) {
        return repository.findAllPharmacieByVille(id);
    }

    public List<Pharmacie> findAllPharmacieByZone(int id) {
        return repository.findAllPharmacieByZone(id);
    }

}
