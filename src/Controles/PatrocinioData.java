
package Controles;

import Modelos.Jugador;
import Modelos.Patrocinio;
import Modelos.Sponsor;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PatrocinioData {
        private Connection con;
        
        
    
    public PatrocinioData(Conexion conn){ 
      con = conn.conectar();
    }
    
    public void guardarPatrocinio(Patrocinio patrocinio) {
     if(existe(patrocinio)){
         JOptionPane.showMessageDialog(null, "El Patrocinio ya existe");
     }else{
            String sql = "INSERT INTO patrocinio(id_sponsor, id_jugador, activo) VALUES (?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                ps.setInt(1, patrocinio.getSponsor().getIdSponsor());
                ps.setInt(2, patrocinio.getJugador().getIdJugador());
                ps.setBoolean(3,patrocinio.isActivo()); 
                ps.executeUpdate();
                
               JOptionPane.showMessageDialog(null, "Patrocinio guardado con exito.");
             } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al guardar Patrocinio ");
             }
        }
    }
    
    public void modificarPatrocinio (Patrocinio patrocinio) {
        String sql = "UPDATE patrocinio SET  id_sponsor = ?, id_jugador = ?,  activo = ?  WHERE id_patrocinio = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                     
            ps.setInt(1, patrocinio.getSponsor().getIdSponsor());
            ps.setInt(2, patrocinio.getJugador().getIdJugador());
            ps.setBoolean(3,patrocinio.isActivo());
            ps.setInt(4, patrocinio.getIdPatrocinio());
             
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Patrocinio actualizado");
        
             }else{
              JOptionPane.showMessageDialog(null, "El Patrocinio no existe"); 
           }
            ps.close();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Patrocinio");
        }

 }
    
    public Patrocinio buscarPatrocinio (int ID){
        Patrocinio p = new Patrocinio();
        Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
        JugadorData jd=new JugadorData(c);
        
        String sql = "SELECT * FROM patrocinio Where id_patrocinio = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                p.setIdPatrocinio(rs.getInt("id_patrocinio"));
                
                Sponsor spon = sd.buscarSponsor(rs.getInt("id_sponsor"));
                p.setSponsor(spon);
                Jugador jug = jd.buscarJugador(rs.getInt("id_jugador"));
                p.setJugador(jug); 
                p.setActivo(rs.getBoolean("activo"));
                
            }
        }
        catch(SQLException ex){
            System.out.println("Patrocinio no encontrado: " + ex);
        }
          return p;
}   
    
 
      
    public void borrarPatrocinio(int id){
            String sql="DELETE FROM patrocinio WHERE id_patrocinio=?";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();

                JOptionPane.showMessageDialog(null, "Patrocinio eliminado");
            } 
            catch (SQLException ex) {
                 System.out.println("Error al eliminar patrocinio ");
            }
    }
    
    public ArrayList<Patrocinio> buscarTodosPatrocinio(){
          Conexion c = new Conexion();
          ArrayList<Patrocinio> resultados = new ArrayList<>();
          
          SponsorData sd = new SponsorData(c);          
          JugadorData jd = new JugadorData(c);
          
          String sql = "SELECT * FROM patrocinio";
           try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
                 Patrocinio p = new Patrocinio();
                 Sponsor s = sd.buscarSponsor(rs.getInt("id_sponsor"));
                 Jugador j = jd.buscarJugador(rs.getInt("id_jugador"));
                 p.setSponsor(s);
                 p.setJugador(j);
                 p.setIdPatrocinio(rs.getInt("id_patrocinio"));
                 p.setActivo(rs.getBoolean("activo"));
                 
                 resultados.add(p);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return resultados;
  }
    
    public ArrayList<Patrocinio> buscarPatrociniosInactivos(){
          Conexion c = new Conexion();
          ArrayList<Patrocinio> inactivos = new ArrayList<>();
          
          SponsorData sd = new SponsorData(c);          
          JugadorData jd = new JugadorData(c);
          
          String sql = "SELECT * FROM patrocinio WHERE activo = 0";
           try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
                 Patrocinio p = new Patrocinio();
                 Sponsor s = sd.buscarSponsor(rs.getInt("id_sponsor"));
                 Jugador j = jd.buscarJugador(rs.getInt("id_jugador"));
                 p.setSponsor(s);
                 p.setJugador(j);
                 p.setIdPatrocinio(rs.getInt("id_patrocinio"));
                 p.setActivo(rs.getBoolean("activo"));
                 
                 inactivos.add(p);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return inactivos;
  }
    public ArrayList<Patrocinio> buscarPatrociniosActivos(){
          Conexion c = new Conexion();
          ArrayList<Patrocinio> activos = new ArrayList<>();
          
          SponsorData sd = new SponsorData(c);          
          JugadorData jd = new JugadorData(c);
          
          String sql = "SELECT * FROM patrocinio WHERE activo = 1";
           try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
                 Patrocinio p = new Patrocinio();
                 Sponsor s = sd.buscarSponsor(rs.getInt("id_sponsor"));
                 Jugador j = jd.buscarJugador(rs.getInt("id_jugador"));
                 p.setSponsor(s);
                 p.setJugador(j);
                 p.setIdPatrocinio(rs.getInt("id_patrocinio"));
                 p.setActivo(rs.getBoolean("activo"));
                 
                 activos.add(p);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return activos;
  }
    public void actualizarPatrocinio(Patrocinio p){
        String sql = "UPDATE patrocinio SET activo = ? WHERE id_patrocinio = ?";
                
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1,p.isActivo());         
            ps.setInt(2, p.getIdPatrocinio());
             
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Patrocinio actualizado");
        
             }else{
              JOptionPane.showMessageDialog(null, "El Patrocinio no existe"); 
           }
            ps.close();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Patrocinio");
        }
    }
    public boolean existe(Patrocinio p){
      boolean existe = false;
      ArrayList<Patrocinio>patrocinios = this.buscarTodosPatrocinio();
      for (Patrocinio pat: patrocinios){
          if(p.getJugador().getIdJugador()== pat.getJugador().getIdJugador() && p.getSponsor().getIdSponsor() == pat.getSponsor().getIdSponsor()){
              existe = true;
          }
      }
      return existe;
    }
    
}
