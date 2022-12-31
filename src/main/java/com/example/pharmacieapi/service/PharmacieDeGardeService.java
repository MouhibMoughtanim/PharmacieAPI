package com.example.pharmacieapi.service;


import com.example.pharmacieapi.entity.PharmacieDeGarde;
import com.example.pharmacieapi.repositories.PharmacieDeGardeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacieDeGardeService {
    @Autowired
    private PharmacieDeGardeRepository repository;

    public PharmacieDeGarde addPharmacieDeGarde(PharmacieDeGarde p){
        return repository.save(p);
    }
    public List<PharmacieDeGarde> getAllPharmaciesDeGarde(){
        return repository.findAll();
    }

}
