
package Modelos;


public class Estadio {
    
    private int idEstadio = -1;
    private String nombre;
    private String ciudad;
    private String categoria;
    private String direccionComercial;
    private float ancho;
    private float largo;
    private int capacidad;
    private boolean enUso;

    public Estadio() {
    }

    public Estadio(int idEstadio, String nombre, String ciudad, String categoria, String direccionComercial, float ancho, float largo, int capacidad, boolean enUso) {
        this.idEstadio = idEstadio;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.direccionComercial = direccionComercial;
        this.ancho = ancho;
        this.largo = largo;
        this.capacidad = capacidad;
        this.enUso = enUso;
    }

    public Estadio(String nombre, String ciudad, String categoria, String direccionComercial, float ancho, float largo, int capacidad, boolean enUso) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.direccionComercial = direccionComercial;
        this.ancho = ancho;
        this.largo = largo;
        this.capacidad = capacidad;
        this.enUso = enUso;
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

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
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

}