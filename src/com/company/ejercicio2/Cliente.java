package com.company.ejercicio2;

import java.util.UUID;

public class Cliente {
    private UUID idCliente;
    private String nombre;
    private String email;
    private int descuento;

    public Cliente(String nombre, String email, int descuento){
        this.idCliente = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public Cliente(String nombre, String email){
        this.idCliente = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = 0;
    }

    public UUID getIdCliente() {
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

    /*public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString(){
        return String.format("Cliente[id=%s, nombre=%s, email=%s, descuento=%d]",this.idCliente.toString(), this.nombre, this.nombre, this.descuento);
    }
}
