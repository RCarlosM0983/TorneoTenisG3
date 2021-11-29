/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneotenis;

import Controles.Conexion;
import Controles.EstadioData;
import Controles.JugadorData;
import Controles.TorneoData;
import Modelos.Estadio;
import Modelos.Jugador;
import Modelos.Torneo;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author carlo_000
 */
public class TorneoTenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion c = new Conexion();
        JugadorData jd = new JugadorData(c);
        EstadioData ed = new EstadioData(c);
        TorneoData td = new TorneoData(c);
       // Torneo t = new Torneo(1, "Master 1000", LocalDate.of(2021, 11, 25), LocalDate.of(2022, 01, 25), false);
        Torneo t = new Torneo("Master 2000", LocalDate.of(2021, 11, 25), LocalDate.of(2022, 01, 25), true);
        //Jugador j = new Jugador(26);
        //Jugador j1 = new Jugador(23);
        //Jugador j1 = new Jugador(24, "Juan Lopez", 23487624, LocalDate.of(1991, 04, 25), 1.8, 78.5, "Defensivo", "derecho", true);
        //jd.actualizarJugador(j1);
        //jd.borrarJugador(j1.getIdJugador());
        
       // Estadio e1 = new Estadio("xxx", "zzz", 22, 32, "lll", true, "ddd", 30000, true);
       // ed.registrarEstadio(e1);
       //td.actualizarTorneo(t);
       // System.out.println(td.obtenerTorneos());
       //jd.obtenerJugadores();
       // System.out.println(ed.buscarEstadio(1));
       // System.out.println(ed.obtenerEstadios());
       // System.out.println(jd.obtenerJugadores()); 
       // System.out.println(td.buscarTorneo(3));
       //td.registrarTorneo(t);
       //td.borrarTorneo(4);
       //ed.borrarEstadio(3);
       jd.borrarJugador(16);
    }
    
}
