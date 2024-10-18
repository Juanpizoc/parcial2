package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "numeros")
public class Numero {
    
    private int numero;

    public Numero() {}

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
