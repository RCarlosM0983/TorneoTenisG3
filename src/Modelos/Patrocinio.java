
package Modelos;

import java.time.LocalDate;


public class Patrocinio {
   
    private int idPatrocinio = -1;
    private Sponsor sponsor;
    private Jugador jugador;
    private boolean activo;

    public Patrocinio() {
    }

    public Patrocinio(int idPatrocinio, Sponsor sponsor, Jugador jugador, boolean activo) {
        this.idPatrocinio = idPatrocinio;
        this.sponsor = sponsor;
        this.jugador = jugador;
        this.activo = activo;
    }

    public Patrocinio(Sponsor sponsor, Jugador jugador, boolean activo) {
        this.sponsor = sponsor;
        this.jugador = jugador;
        this.activo = activo;
    }

    public int getIdPatrocinio() {
        return idPatrocinio;
    }

    public void setIdPatrocinio(int idPatrocinio) {
        this.idPatrocinio = idPatrocinio;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idPatrocinio + "  "+ sponsor +" "+ jugador;
    }

}