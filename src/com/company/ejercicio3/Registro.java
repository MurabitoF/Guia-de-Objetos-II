package com.company.ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro {
    private Usuario usuario;
    private double dinero;
    private LocalDateTime fecha;

    public Registro(Usuario usuario, double dinero) {
        this.usuario = usuario;
        this.dinero = dinero;
        this.fecha = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void verRegistro(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        if(dinero < 0){
            System.out.println(String.format("%s:El cliente %s, retiro %1.2f", fecha.format(formatter), usuario.getNombre(), this.dinero));
        }else{
            System.out.println(String.format("%s:El cliente %s, deposito %1.2f", fecha.format(formatter),usuario.getNombre(), this.dinero));
        }
    }
}
