package com.example.pharmacieapi.service;

import com.example.pharmacieapi.entity.Garde;
import com.example.pharmacieapi.repositories.GardeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardeService {
    @Autowired
    private GardeRepository repository;

    public List<Garde> findAllGardes(){

        return repository.findAll();
    }
}
