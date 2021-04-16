package com.company.ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private LocalDateTime fecha;
    private Cliente cliente;
    private List<ItemVenta> listaProductos;

    public Factura(Cliente cliente) {
        this.idFactura = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.listaProductos = new ArrayList<ItemVenta>();
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenta> getListaProductos() {
        return listaProductos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarItem(ItemVenta item) {
        listaProductos.add(item);
    }

    private double getTotalSinDescuento() {
        double total = 0.0;
        for (ItemVenta item : listaProductos) {
            total += item.getCantidad() * item.getpUnitario();
        }
        return total;
    }

    private double calcularDescuento(double total) {
        if (cliente.getDescuento() != 0) {
            total = total * cliente.getDescuento() / 100;
        }
        return total;
    }

    public double getTotalConDescuento() {
        double total = 0.0;
        double descuento = 0.0;
        total = this.getTotalSinDescuento();
        descuento = this.calcularDescuento(total);
        total -= descuento;
        return total;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("Factura[id=%s, fecha=%s, monto=%1.2f, montoDesc=%1.2f, %s]",
                this.idFactura.toString(), this.fecha.format(formatter), this.getTotalConDescuento(),
                this.calcularDescuento(this.getTotalSinDescuento()), cliente.toString());
    }

}
