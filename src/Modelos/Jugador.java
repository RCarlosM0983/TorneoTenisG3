

package Modelos;

import java.time.LocalDate;


public class Jugador {
    private int idJugador = -1;
    private String nombreApellido;
    private int dni;
    private LocalDate fechaNac;
    private float altura;
    private float peso;
    private String estilo;
    private String manoHabil;
    //private int torneosGanados;
   // private int ranking;
   // private Torneo torneo;
   // private int puntaje;
    private boolean activo;
    
     public Jugador() {
    }
     public Jugador(int idJugador){
         this.idJugador = idJugador;
     }

    public Jugador(String nombreApellido, int dni, LocalDate fechaNac, float altura, float peso, String estilo, String manoHabil, boolean activo) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
        this.manoHabil = manoHabil;
        this.activo = activo;
    }

    public Jugador(int idJugador, String nombreApellido, int dni, LocalDate fechaNac, float altura, float peso, String estilo, String manoHabil, boolean activo) {
        this.idJugador = idJugador;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
        this.manoHabil = manoHabil;
        this.activo = activo;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getManoHabil() {
        return manoHabil;
    }

    public void setManoHabil(String manoHabil) {
        this.manoHabil = manoHabil;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
 @Override
    public String toString() {
        return idJugador + "," + nombreApellido;
    }
   
}
