package com.company.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CuentaBancaria {
    UUID id;
    Usuario propietario;
    double balance;
    private List<Registro> operaciones;

    public CuentaBancaria(Usuario propietario, double balance) {
        this.id = UUID.randomUUID();
        this.propietario = propietario;
        this.balance = balance;
        operaciones = new ArrayList<Registro>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositarDinero(double dinero){
        this.balance += dinero;
        agregarRegistro(dinero);
        System.out.println("Dinero depositado, su saldo es: $" + this.balance);
    }

    public void extraerDinero(double dinero){
        if(this.balance - dinero < -2000){
            System.out.println("Error! Saldo insificiente para realizar la operacion");
        }else {
            this.balance -= dinero;
            agregarRegistro(-dinero);
            System.out.println("Dinero extraido, su saldo es: $" + this.balance);
        }
    }

    private void agregarRegistro(double dinero){
        if(operaciones.size() <= 10){
            operaciones.add(new Registro(propietario,dinero));
        }else{
            operaciones.remove(0);
            operaciones.add(new Registro(propietario,dinero));
        }
    }
    public void verOperaciones(){
        for (Registro operacion: operaciones) {
            operacion.verRegistro();
        }
    }
}
