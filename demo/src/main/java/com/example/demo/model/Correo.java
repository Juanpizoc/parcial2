package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "correo")
public class Correo {
    
    private String correo;
 
    public Correo() {}

    public Correo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}