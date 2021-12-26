
package org.jgp.system.models;


public class CompraProductos {
    private int id;
    private int idProveedor;
    private String total;

    public CompraProductos() {
    }

    public CompraProductos(int id, int idProveedor, String total) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
}
