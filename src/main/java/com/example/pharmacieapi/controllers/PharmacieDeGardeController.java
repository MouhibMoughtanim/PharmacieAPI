package com.example.pharmacieapi.controllers;

import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.entity.PharmacieDeGarde;
import com.example.pharmacieapi.service.PharmacieDeGardeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pharmaciesDeGarde")
public class PharmacieDeGardeController {

    @Autowired
    private PharmacieDeGardeService service;

    @PostMapping("/add")
    public PharmacieDeGarde save(@RequestBody PharmacieDeGarde p) {
        return service.addPharmacieDeGarde(p);
    }
}
