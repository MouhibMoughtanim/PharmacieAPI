package com.example.pharmacieapi.controllers;

import com.example.pharmacieapi.entity.Pharmacie;
import com.example.pharmacieapi.entity.PharmacieDeGarde;
import com.example.pharmacieapi.service.PharmacieDeGardeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/pharmaciesDeGarde")
public class PharmacieDeGardeController {

    @Autowired
    private PharmacieDeGardeService service;

    @PostMapping("/add/{debut}/{fin}")
    public PharmacieDeGarde save(@RequestBody PharmacieDeGarde p, @PathVariable String debut,@PathVariable String fin) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date utilDate1 = sdf.parse(debut);
        java.util.Date utilDate2 = sdf.parse(fin);

        // Convert the java.util.Date object to a java.sql.Date object
        long millis1 = utilDate1.getTime();
        long millis2 = utilDate2.getTime();

        java.sql.Date debutSql = new java.sql.Date(millis1);
        java.sql.Date finSql = new java.sql.Date(millis2);

        p.setDateDebut(debutSql);
        p.setDateFin(finSql);

        return service.addPharmacieDeGarde(p);
    }
}
