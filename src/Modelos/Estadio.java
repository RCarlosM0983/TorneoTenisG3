
package Modelos;


public class Estadio {
    
    private int idEstadio = -1;
    private String nombre;
    private String ciudad;
    private String categoria;
    private boolean activo;
    private String direccionComercial;
    private String dimension;
    private int capacidad;
    private int estado_enUso;

    public Estadio(String nombre, String ciudad, String categoria, boolean activo, String direccionComercial, String dimension, int capacidad, int estado_enUso) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.activo = activo;
        this.direccionComercial = direccionComercial;
        this.dimension = dimension;
        this.capacidad = capacidad;
        this.estado_enUso = estado_enUso;
    }

    public Estadio() {
    }

    public Estadio(int idEstadio, String nombre, String ciudad, String categoria, boolean activo, String direccionComercial, String dimension, int capacidad, int estado_enUso) {
        this.idEstadio = idEstadio;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.activo = activo;
        this.direccionComercial = direccionComercial;
        this.dimension = dimension;
        this.capacidad = capacidad;
        this.estado_enUso = estado_enUso;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEstado_enUso() {
        return estado_enUso;
    }

    public void setEstado_enUso(int estado_enUso) {
        this.estado_enUso = estado_enUso;
    }
    
    

}