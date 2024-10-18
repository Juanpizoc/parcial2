package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.NumeroService;

import jakarta.persistence.Column;

@RestController
@RequestMapping("/api/numero")
public class NumeroController {

    @Autowired
    private NumeroService numeroService;

    @GetMapping("/validarMultiplo")
    public ResponseEntity<String> validarMultiplo(@RequestParam int numero) {
        String resultado = numeroService.validarMultiplo(numero);
        return ResponseEntity.ok(resultado);
    }
}