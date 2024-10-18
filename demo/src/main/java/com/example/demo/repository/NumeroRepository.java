package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Numero;

@Repository
public interface NumeroRepository extends JpaRepository<Numero, Long> {
    
    @Query(value = "SELECT es_multiplo_de_tres(:numero) FROM DUAL", nativeQuery = true)
    String esMultiploDeTres(@Param("numero") int numero);
}
