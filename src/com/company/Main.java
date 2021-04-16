package com.company;

import com.company.ejercicio2.Cliente;
import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.CuentaBancaria;
import com.company.ejercicio3.Usuario;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Joshua", "Bloch",  "joshua@email.com", 'M');
        Autor[] autores = new Autor[3];
        autores[0] = new Autor("Jane", "Bach",  "jane@email.com", 'F');
        autores[1] = new Autor("Jake", "Bick",  "jake@email.com", 'M');
        autores[2] = new Autor("John", "Bane",  "john@email.com", 'M');
        Libro libro = new Libro("Effective Java", 450, 150, autor, autores);

        autor.printAutor();
        System.out.println(" ");
        libro.printLibro();
        System.out.println(" ");
        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        System.out.println(" ");
        System.out.println("Los datos del autor de " + libro.getTitulo() + " son:");
        autor.printAutor();
        System.out.println(" ");
        libro.printDetalleLibro();
        System.out.println(" ");
        libro.printAutoresLibro();

        //ej2();
        //ej3();
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
