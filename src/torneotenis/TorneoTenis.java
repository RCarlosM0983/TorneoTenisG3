/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneotenis;

import Controles.Conexion;
import Controles.EstadioData;
import Controles.JugadorData;
import Modelos.Estadio;
import Modelos.Jugador;
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
        
        //Jugador j = new Jugador(26);
        //Jugador j1 = new Jugador(23);
        //Jugador j1 = new Jugador(24, "Juan Lopez", 23487624, LocalDate.of(1991, 04, 25), 1.8, 78.5, "Defensivo", "derecho", true);
        //jd.actualizarJugador(j1);
        //jd.borrarJugador(j1.getIdJugador());
        
        Estadio e1 = new Estadio("aaaaa", "bbb", "cccc", "ddd", 22, 32, 30000, true);
        ed.registrarEstadio(e1);
    }
    
}
