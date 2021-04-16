package com.company;

import com.company.ejercicio2.Cliente;
import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.CuentaBancaria;
import com.company.ejercicio3.Usuario;

public class Main {

    public static void main(String[] args) {
	    //ej2();
        ej3();
    }

    public static void ej2(){
        Cliente cliente1 = new Cliente("Franco","email", 15);
        ItemVenta producto1 = new ItemVenta(1,"Monitor",2,5000.00);
        ItemVenta producto2 = new ItemVenta(2,"Teclado",1,800.00);
        ItemVenta producto3 = new ItemVenta(3,"Mouse",1,1000.00);
        Factura factura1 = new Factura(cliente1);

        System.out.println(factura1);
        factura1.agregarItem(producto1);
        factura1.agregarItem(producto2);
        factura1.agregarItem(producto3);
        System.out.println(factura1);
    }

    public static void ej3(){
        Usuario usuario1 = new Usuario("Franco", 'h');
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(usuario1, 10000.00);

        System.out.println(usuario1.getUsuario());
        cuentaBancaria1.depositarDinero(500.00);
        cuentaBancaria1.extraerDinero(1500.00);
        cuentaBancaria1.extraerDinero(15000.00);
        cuentaBancaria1.extraerDinero(11000.00);

        cuentaBancaria1.verOperaciones();
    }
}
