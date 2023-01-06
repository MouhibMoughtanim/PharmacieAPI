package com.example.pharmacieapi.controllers;

import com.example.pharmacieapi.entity.Garde;
import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.service.GardeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gardes")
@CrossOrigin("http://localhost:3000")
public class GardeController {

    @Autowired
    private GardeService service;

    @GetMapping("/all")
    public List<Garde> findAllGarde(){
        return service.findAllGardes();
    }

}
