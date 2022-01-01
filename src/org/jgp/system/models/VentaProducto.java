
package org.jgp.system.models;

import java.util.Date;


public class VentaProducto {
    private int id;
    private int idCliente;
    private String nombreCli;
    private Double total;
    private Date fecha;

    public VentaProducto() {
    }

    public VentaProducto(int id, int idCliente, String nombreCli, Double total, Date fecha) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombreCli = nombreCli;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
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
