package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CorreoService;

import jakarta.persistence.Column;

@RestController
@RequestMapping("/api/correo")
public class CorreoController {

    @Autowired
    private CorreoService services;

    @GetMapping("/validar")
    public ResponseEntity<String> validarCorreo(@RequestParam String correo) {
        String resultado = services.validarCorreo(correo);
        return ResponseEntity.ok(resultado);
    }
}


