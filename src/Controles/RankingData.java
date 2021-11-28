/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Modelos.Jugador;
import Modelos.Ranking;
import Modelos.Torneo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo_000
 */
public class RankingData {
     private Connection con = null;     
  
  public RankingData(Conexion conn){ 
      con = conn.conectar();
    }
  
  public ArrayList<Ranking> obtenerTablaPosiciones(int idTorneo){
      
     ArrayList <Ranking> posiciones = new ArrayList<>(); 
     
  String sql = "SELECT ganador, SUM(Puntos) AS Puntaje "
                + "FROM (SELECT ganador, COUNT(ganador)*3 AS PUNTOS "
                + "FROM encuentros "
                + "WHERE id_torneo = ? AND ganador IS NOT NULL GROUP BY GANADOR "
                + "UNION SELECT id_jugador AS ganador, COUNT(id_jugador) AS Puntos "
                + "FROM patrocinio, ( SELECT DISTINCT ganador FROM encuentros WHERE id_torneo = ? "
                + " AND ganador is not null) AS Ganadores"
                +" WHERE id_jugador = ganador"
                +" GROUP BY id_jugador) AS Resultado"
                +" GROUP BY ganador"
                +" ORDER BY Puntaje DESC";
   try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Conexion c = new Conexion();
            JugadorData jd = new JugadorData(c);
            
            RankingData rd = new RankingData(c);
              
              ps = con.prepareStatement(sql);
              ps.setInt(1, idTorneo);
              ps.setInt(2, idTorneo);
              ResultSet rs= ps.executeQuery();
              
            while(rs.next()){
                Ranking r = new Ranking();
                r.setJugador(jd.buscarJugadorId(rs.getInt("ganador")));
                r.setPuntos(rs.getInt("Puntaje"));
                
                
                posiciones.add(r);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
     
      return posiciones;
  }
   public ArrayList<Ranking> obtenerGanadores(int idTorneo){
      
     ArrayList<Ranking>ganadores = new ArrayList<>(); 
     
  String sql = "SELECT ganador, COUNT(ganador)*3 AS PUNTOS FROM encuentros  WHERE id_torneo = ? AND ganador IS NOT NULL GROUP BY GANADOR;";
  
  try {
            PreparedStatement ps= con.prepareStatement(sql);
            Conexion c = new Conexion();
            JugadorData jd = new JugadorData(c);
            
            RankingData rd = new RankingData(c);
              
              ps = con.prepareStatement(sql);
              ps.setInt(1, idTorneo);
              ResultSet rs= ps.executeQuery();
              
            while(rs.next()){
                Ranking r = new Ranking();
                r.setJugador(jd.buscarJugadorId(rs.getInt("ganador")));
                r.setPuntos(rs.getInt("Puntos"));
    
                
                
                ganadores.add(r);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
  
  return ganadores;
   }
}
