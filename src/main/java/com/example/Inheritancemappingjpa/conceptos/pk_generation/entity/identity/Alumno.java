package com.example.Inheritancemappingjpa.conceptos.pk_generation.entity.identity;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
public class Alumno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usa una columna  auto incrementada por la base de datos (MySQL tiene AUTO_INCREMENT column attribute)
    private Long id;

//    create table alumno (
//            id bigint generated by default as identity,
//            nombre varchar(255),
//            primary key (id)
//    )

    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno1{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}