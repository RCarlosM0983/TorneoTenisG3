/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author carlo_000
 */
public class Ranking {
    private Jugador jugador;
    private int puntos;

    public Ranking() {
    }
    
    

    public Ranking(Jugador jugador, int puntos) {
        this.jugador = jugador;
        this.puntos = puntos;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
