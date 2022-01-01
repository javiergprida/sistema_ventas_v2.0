
package org.jgp.system.models;


public class DetalleVentaProducto {
    private int id;
    private int idVenta;
    private double precio;
    private int cantidad;
    private double subTotal;

    public DetalleVentaProducto() {
    }

    public DetalleVentaProducto(int id, int idVenta, double precio, int cantidad, double subTotal) {
        this.id = id;
        this.idVenta = idVenta;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


}
