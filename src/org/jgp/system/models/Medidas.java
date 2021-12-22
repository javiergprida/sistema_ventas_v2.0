
package org.jgp.system.models;


public class Medidas {
    private int id;
    private String nombre;
    private String abreviatura;
    private String status;

    public Medidas() {
    }

    public Medidas(int id, String nombre, String abreviatura, String status) {
        this.id = id;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
