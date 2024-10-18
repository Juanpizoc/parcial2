package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CorreoRepository;

@Service
public class CorreoService {

    @Autowired
    private CorreoRepository correoRepository;

    public String validarCorreo(String correo) {
        return correoRepository.validarCorreo(correo);
        
    }
}
