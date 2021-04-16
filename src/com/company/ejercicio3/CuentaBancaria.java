package com.company.ejercicio3;

import java.util.UUID;

public class CuentaBancaria {
    UUID id;
    Usuario propietario;
    double balance;

    public CuentaBancaria(Usuario propietario, double balance) {
        this.id = UUID.randomUUID();
        this.propietario = propietario;
        this.balance = balance;
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
        System.out.println("Dinero depositado, su saldo es: $" + this.balance);
    }

    public void extraerDinero(double dinero){
        if(this.balance - dinero < -2000){
            System.out.println("Error! Saldo insificiente para realizar la operacion");
        }else {
            this.balance -= dinero;
            System.out.println("Dinero extraido, su saldo es: $" + this.balance);
        }
    }
}
