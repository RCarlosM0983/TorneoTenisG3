
package Modelos;

import java.time.LocalDate;


public class Torneo {
    
    private int idTorneo = -1;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;

    public Torneo() {
    }

    public Torneo(int idTorneo, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean activo) {
        this.idTorneo = idTorneo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean activo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    } 

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
