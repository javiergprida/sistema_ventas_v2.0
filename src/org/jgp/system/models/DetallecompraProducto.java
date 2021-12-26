
package org.jgp.system.models;


public class DetallecompraProducto {
    private int id;
    private int idCompra;
    private double precio;
    private int cantidad;
    private double subTotal;

    public DetallecompraProducto() {
    }

    public DetallecompraProducto(int id, int idCompra, double precio, int cantidad, double subTotal) {
        this.id = id;
        this.idCompra = idCompra;
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

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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
