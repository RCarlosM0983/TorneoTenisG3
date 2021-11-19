
package Modelos;


public class Sponsor {
    
    private int idSponsor = -1;
    private String marca;
    private String indumentaria;
    private boolean activo;

    public Sponsor() {
    }

    public Sponsor(int idSponsor, String marca, String indumentaria, boolean activo) {
        this.idSponsor = idSponsor;
        this.marca = marca;
        this.indumentaria = indumentaria;
        this.activo = activo;
    }

    public Sponsor(String marca, String indumentaria, boolean activo) {
        this.marca = marca;
        this.indumentaria = indumentaria;
        this.activo = activo;
    }

    public int getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getIndumentaria() {
        return indumentaria;
    }

    public void setIndumentaria(String indumentaria) {
        this.indumentaria = indumentaria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  marca + "  " + indumentaria;
    }

   
    
    
}
