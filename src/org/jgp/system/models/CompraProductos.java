
package org.jgp.system.models;

import java.util.Date;


public class CompraProductos {
    private int id;
    private int idProveedor;
    private String nombrePro;
    private Double total;
    private Date fecha;

    public CompraProductos() {
    }

    public CompraProductos(int id, int idProveedor, String nombrePro, Double total, Date fecha) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.nombrePro = nombrePro;
        this.total = total;
        this.fecha = fecha;
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

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

   
    

    
    
}
