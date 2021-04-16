package com.company.ejercicio2;

import java.util.UUID;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String email;
    private int descuento;

    public Cliente(String nombre, String email, int descuento){
        this.idCliente = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public Cliente(String nombre, String email){
        this.idCliente = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.descuento = 0;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getCliente(){
        return String.format("Cliente[id=%s, nombre=%s, email=%s, descuento=%d]",this.idCliente, this.nombre, this.nombre, this.descuento);
    }
}
