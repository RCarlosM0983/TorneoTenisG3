package Modelos;

import java.time.LocalDate;


public class Encuentro {
    private int id_encuentro;
    private LocalDate fechaEnc;
    private String estadoEnCurso;
    private Jugador ganador;
    private Jugador jugador1;
    private Jugador jugador2;
    private Estadio estadio;
    private Torneo torneo;
    private boolean activo;
    private String resultado= "0-0";   
    

    public Encuentro(int id_encuentro, LocalDate fechaEnc, String estadoEnCurso, Jugador ganador, Jugador jugador1, Jugador jugador2, Estadio estadio, Torneo torneo, boolean activo) {
        this.id_encuentro = id_encuentro;
        this.fechaEnc = fechaEnc;
        this.estadoEnCurso = estadoEnCurso;
        this.ganador = ganador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.estadio = estadio;
        this.torneo = torneo;
        this.activo = activo;
    }

    public Encuentro(LocalDate fechaEnc, String estadoEnCurso, Jugador ganador, Jugador jugador1, Jugador jugador2, Estadio estadio, Torneo torneo, boolean activo, String resultado) {
        this.fechaEnc = fechaEnc;
        this.estadoEnCurso = estadoEnCurso;
        this.ganador = ganador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.estadio = estadio;
        this.torneo = torneo;
        this.activo = activo;
        this.resultado = resultado;
    }

    public Encuentro(int id_encuentro, LocalDate fechaEnc, String estadoEnCurso, Jugador jugador1, Jugador jugador2, Estadio estadio, Torneo torneo, boolean activo) {
        this.id_encuentro = id_encuentro;
        this.fechaEnc = fechaEnc;
        this.estadoEnCurso = estadoEnCurso;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.estadio = estadio;
        this.torneo = torneo;
        this.activo = activo;
    }

    
    public Encuentro(LocalDate fechaEnc, String estadoEnCurso, Jugador jugador1, Jugador jugador2, Estadio estadio, Torneo torneo, boolean activo) {
        this.fechaEnc = fechaEnc;
        this.estadoEnCurso = estadoEnCurso;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.estadio = estadio;
        this.torneo = torneo;
        this.activo = activo;
    }

    
    public Encuentro() {
    }

    public int getId_encuentro() {
        return id_encuentro;
    }

    public void setId_encuentro(int id_encuentro) {
        this.id_encuentro = id_encuentro;
    }

    public LocalDate getFechaEnc() {
        return fechaEnc;
    }

    public void setFechaEnc(LocalDate fechaEnc) {
        this.fechaEnc = fechaEnc;
    }

    public String getEstadoEnCurso() {
        return estadoEnCurso;
    }

    public void setEstadoEnCurso(String estadoEnCurso) {
        this.estadoEnCurso = estadoEnCurso;
    }

    public Jugador getGanador() {
        return ganador;
    } 

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
       
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "idEncuentro=" + id_encuentro + "Fecha de encuentro: " + fechaEnc;
    }
    
}
