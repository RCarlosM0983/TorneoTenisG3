package Modelos;

import java.time.LocalDate;


public class Encuentro {
  
    private int idPartido = -1;
    private Jugador jugador1;
    private Jugador jugador2;
    private LocalDate fechaEncuentro;
    private String estado;
    private int resultado;
    private Jugador jGanador;
    private String idEstadio;
    private boolean activo;
    private Torneo idTorneo;

    public Encuentro() {
    }

    public Encuentro(int idPartido, Jugador jugador1, Jugador jugador2, LocalDate fechaEncuentro, String estado, int resultado, Jugador jGanador, String idEstadio, boolean activo, Torneo idTorneo) {
        this.idPartido = idPartido;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.fechaEncuentro = fechaEncuentro;
        this.estado = estado;
        this.resultado = resultado;
        this.jGanador = jGanador;
        this.idEstadio = idEstadio;
        this.activo = activo;
        this.idTorneo = idTorneo;
    }

    public Encuentro(Jugador jugador1, Jugador jugador2, LocalDate fechaEncuentro, String estado, int resultado, Jugador jGanador, String idEstadio, boolean activo, Torneo idTorneo) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.fechaEncuentro = fechaEncuentro;
        this.estado = estado;
        this.resultado = resultado;
        this.jGanador = jGanador;
        this.idEstadio = idEstadio;
        this.activo = activo;
        this.idTorneo = idTorneo;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
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

    public LocalDate getFechaEncuentro() {
        return fechaEncuentro;
    }

    public void setFechaEncuentro(LocalDate fechaEncuentro) {
        this.fechaEncuentro = fechaEncuentro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Jugador getjGanador() {
        return jGanador;
    }

    public void setjGanador(Jugador jGanador) {
        this.jGanador = jGanador;
    }

    public String getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(String idEstadio) {
        this.idEstadio = idEstadio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Torneo getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Torneo idTorneo) {
        this.idTorneo = idTorneo;
    }
    
    
}
