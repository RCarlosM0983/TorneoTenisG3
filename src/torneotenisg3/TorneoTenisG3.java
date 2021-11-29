/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneotenisg3;

import Controles.Conexion;
import Controles.EncuentroData;
import Controles.EstadioData;
import Controles.JugadorData;
import Controles.PatrocinioData;
import Controles.RankingData;
import Controles.SponsorData;
import Modelos.Jugador;
import Modelos.Patrocinio;
import java.time.LocalDate;

/**
 *
 * @author carlo_000
 */
public class TorneoTenisG3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j = new Jugador();
        Conexion c = new Conexion();
        JugadorData jd = new JugadorData(c);
        EncuentroData ed = new EncuentroData(c);
        PatrocinioData pd = new PatrocinioData(c);
        SponsorData sd = new SponsorData(c);
        Patrocinio p = new Patrocinio();
        EstadioData esd = new EstadioData(c);
       //  System.out.println(pd.buscarTodosPatrocinio());
        // System.out.println(sd.buscarTodosSponsor());
       // System.out.println(ed.buscarEncuentro(2).getGanador());
        j = jd.buscarJugador(22);
       // System.out.println(j);
        RankingData rd = new RankingData(c);
        //System.out.println(rd.obtenerGanadores(10));
        System.out.println(rd.obtenerTablaPosiciones(10));
        System.out.println(esd.obtenerEstadiosActivos());
    }
    
}
