
package Modelos;


public class Estadio {
    
    private int idEstadio ;
    private String nombre;
    private String ciudad;
    private double ancho;
    private double largo;
    private String categoria;
    private boolean enUso;
    private String direccionComercial;
    private int capacidad;
    private boolean activo;

    public Estadio() {
    }

    public Estadio(int idEstadio, String nombre, String ciudad, double ancho, double largo, String categoria, boolean enUso, String direccionComercial, int capacidad, boolean activo) {
        this.idEstadio = idEstadio;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ancho = ancho;
        this.largo = largo;
        this.categoria = categoria;
        this.enUso = enUso;
        this.direccionComercial = direccionComercial;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    public Estadio(String nombre, String ciudad, double ancho, double largo, String categoria, boolean enUso, String direccionComercial, int capacidad, boolean activo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ancho = ancho;
        this.largo = largo;
        this.categoria = categoria;
        this.enUso = enUso;
        this.direccionComercial = direccionComercial;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}