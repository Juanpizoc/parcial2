package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.NumeroRepository;

@Service
public class NumeroService {

    @Autowired
    private NumeroRepository numeroRepository;

    public String validarMultiplo(int numero) {
        return numeroRepository.esMultiploDeTres(numero);
    }
}