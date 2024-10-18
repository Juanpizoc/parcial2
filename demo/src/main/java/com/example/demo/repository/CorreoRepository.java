package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.Correo;


@Repository
public interface CorreoRepository extends JpaRepository<Correo, Long> {
    
    @Query(value = "SELECT validar_correo(:correo) FROM DUAL", nativeQuery = true)
    String validarCorreo(@Param("correo") String correo);
}

