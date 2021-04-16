package com.company.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nombre;
    private char genero;

    public Usuario(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getUsuario(){
        return String.format("Usuario[id=%s, nombre=%s, genero=%c]",this.id.toString(), this.nombre, this.genero);
    }
}
