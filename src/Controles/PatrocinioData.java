
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
        Conexion conexion;
        
    
    public PatrocinioData(Conexion conexion) {
        this.con = conexion.getConexion();
    }
    
    public void guardarPatrocinio(Patrocinio patrocinio) {
     
            String sql = "INSERT INTO patrocinio (id_sponsor, id_jugador, activo) VALUES ( ? , ? , ? ))";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                ps.setInt(1, patrocinio.getSponsor().getIdSponsor());
                ps.setInt(2, patrocinio.getJugador().getIdJugador());
                ps.setBoolean(3,patrocinio.isActivo()); 
                ps.executeUpdate();
                
               JOptionPane.showMessageDialog(null, "Patrocinio guardado con exito.");
             } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al guardar Sponsor "+ex);
        }}
    
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
            JOptionPane.showMessageDialog(null, "Sponsor actualizado");
        
             }else{
              JOptionPane.showMessageDialog(null, "El Sponsor no existe"); 
           }
            ps.close();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Sponsor");
        }

 }
    /*
    public Patrocinio buscarPatrocinio (int ID){
        Patrocinio pat = new Patrocinio();
        
        SponsorData sd = new SponsorData(conexion);
        JugadorData jd=new JugadorData(conexion);
        
        String sql = "SELECT * FROM patrocinio Where id_patrocinio = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                pat.setIdPatrocinio(rs.getInt("id_patrocinio"));
                
                Sponsor spon = s.buscarSponsor(rs.getInt("id_sponsor"));
                pat.setIdPatrocinador(spon);
                
                Jugador jug = j.buscarJugador(rs.getInt("id_jugador"));
                pat.setIdJugador(jug);
                
                pat.setActivo(rs.getBoolean("activo"));
                
            }
        }
        catch(SQLException ex){
            System.out.println("Patrocinio no encontrado: " + ex);
        }
          return pat;
}   */
    
    public void bajaPatrocinio (int id){
         String sql = "UPDATE patrocinio SET activo = ? WHERE id_patrocinio = ? ";
         try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            }
         catch(SQLException ex){
             System.out.println("Patrocinio no encontrado: " + ex);
            }
}   
 
    public void altaSponsor (int id){
          String sql = "UPDATE patrocinio SET activo = ? WHERE id_patrocinio = ? ";
         try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
         System.out.println("Patrocinio no encontrado: " + ex);
        }
}
      
    public void borrarPatrocinio(int id){
            String sql="DELETE FROM patrocinio WHERE id_patrocinio=?";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();

                System.out.println("Patrocinio borrado definitivamente");
            } 
            catch (SQLException ex) {
                 System.out.println("Error al borrar "+ex);
            }
    }
    
    public List<Patrocinio> buscarTodosPatrocinio(){
          List<Patrocinio> resultados = new ArrayList<>();
          
          SponsorData s = new SponsorData(conexion);          
          JugadorData j = new JugadorData(conexion);
          
          String sql = "SELECT * FROM patrocinio ";
          try{
              PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  Patrocinio patrocinio = new Patrocinio();
                  patrocinio.setIdPatrocinio(rs.getInt("id_patrocinio"));
                  
                  Sponsor spon = s.buscarSponsor(rs.getInt("id_sponsor"));
                  patrocinio.setSponsor(spon);
                  
                  Jugador jug = j.buscarJugador(rs.getInt("id_jugador"));
                  patrocinio.setJugador(jug);
                  
                  patrocinio.setActivo(rs.getBoolean("activo"));
                  
                  resultados.add(patrocinio);
              }
              ps.close();
          }
          catch(SQLException ex){
              System.out.println("No se encontraron resultados: "+ ex);
          }
        return resultados;
  }
    
}
