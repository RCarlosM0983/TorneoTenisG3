<<<<<<< HEAD

package Controles;

import Modelos.Jugador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class JugadorData {
    
    private Connection con;
  
   public JugadorData(Conexion conn){
       /*
       try {
            con = conn.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion "+ ex);
        }
*/
      con = conn.conectar();
    
    }
  
   public void guardarJugador(Jugador j){
    String sql = "INSERT INTO jugador(nombreApellido, dni, FechaNac, altura, peso, estilo, manoHabil, activo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, j.getNombreApellido());
            ps.setInt(2, j.getDni());
            ps.setDate(3,  Date.valueOf(j.getFechaNac()));
            ps.setDouble(4, j.getAltura());
            ps.setDouble(5, j.getPeso());
            ps.setString(6, j.getEstilo());
            ps.setString(7, j.getManoHabil());
            ps.setBoolean(8, j.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                j.setIdJugador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Jugador guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el jugador ");
        }
    }
   
   public void actualizarJugador(Jugador j){
        try {
            String sql = "UPDATE jugador SET nombreApellido = ?, dni = ?, fechaNac = ?, altura = ?, peso = ?, estilo = ?, manoHabil = ?, activo = ? WHERE id_jugador = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);            
            
            ps.setString(1, j.getNombreApellido());
            ps.setInt(2, j.getDni());
            ps.setDate(3,  Date.valueOf(j.getFechaNac()));
            ps.setDouble(4, j.getAltura());
            ps.setDouble(5, j.getPeso());
            ps.setString(6, j.getEstilo());
            ps.setString(7, j.getManoHabil());
            ps.setBoolean(8, j.isActivo());
            ps.setInt(9, j.getIdJugador());            
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Jugador actualizado");
        
      }else{
              JOptionPane.showMessageDialog(null, "El Jugador no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Jugador");
        }
  }

   public List<Jugador> obtenerJugadores(){
        Jugador j = new Jugador();
        ArrayList<Jugador> jugadores=new ArrayList<>();        
        String sql="SELECT * FROM jugador";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                
                j.setDni(rs.getInt("dni"));
                j.setActivo(rs.getBoolean("activo"));
                j.setNombreApellido(rs.getString("nombreApellido"));
                j.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                j.setIdJugador(rs.getInt("id_jugador"));
                j.setPeso(rs.getFloat("peso"));
                j.setAltura(rs.getFloat("altura"));
                j.setEstilo(rs.getString("estilo"));
                j.setManoHabil(rs.getString("manoHabil"));
                jugadores.add(j);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return jugadores;
    }
   
   public Jugador buscarJugador(int idJugador){
        Jugador j = new Jugador();
        String sql = "SELECT * FROM jugador WHERE id_jugador = ? ";

      PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.setInt(1, idJugador);
              ResultSet rs = ps.executeQuery();

              while(rs.next()){
                  
                  j.setDni(rs.getInt("dni"));
                  j.setActivo(rs.getBoolean("activo"));
                  j.setNombreApellido(rs.getString("nombreApellido"));
                  j.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                  j.setIdJugador(rs.getInt("id_jugador"));
                  j.setPeso(rs.getFloat("peso"));
                  j.setAltura(rs.getFloat("altura"));
                  j.setEstilo(rs.getString("estilo"));
                  j.setManoHabil(rs.getString("manoHabil"));

              }
              ps.close();

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }

      return j;
    }
   
   public void borrarJugador(int idJugador){
      String sql = "UPDATE jugador SET activo = false WHERE id_jugador = ?";
    
      try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idJugador);
        
         ResultSet rs =ps.executeQuery();
        
      if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Jugador borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Jugador "+ex);
        }   
    }
   
 }
=======

package Controles;

import Modelos.Jugador;
import java.sql.*;
import javax.swing.JOptionPane;


public class JugadorData {
    
    private Connection con = null;
  
  public JugadorData(Conexion conn){
        
      con = conn.conectar();
    
    }
   public void guardarJugador(Jugador j){
    String sql = "INSERT INTO jugador(nombreApellido, dni, FechaNac, altura, peso, estilo, manoHabil, activo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, j.getNombreApellido());
            ps.setInt(2, j.getDni());
            ps.setDate(3,  Date.valueOf(j.getFechaNac()));
            ps.setDouble(4, j.getAltura());
            ps.setDouble(5, j.getPeso());
            ps.setString(6, j.getEstilo());
            ps.setString(7, j.getManoHabil());
            ps.setBoolean(8, j.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                j.setIdJugador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Jugador guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el jugador ");
        }
    }
    public void borrarJugador(int idJugador){
      String sql = "UPDATE jugador SET activo = false WHERE idJugador = ?";
       try {
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, idJugador);
      if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Jugador borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Jugador");
        }   
   }
   public void actualizarJugador(Jugador j){
        try {
            String sql = "UPDATE jugador SET nombreApellido = ?, dni = ?, fechaNac = ?, altura = ?, peso = ?, estilo = ?, manoHabil = ?, activo = ? WHERE idJugador = ?";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
           ps.setString(1, j.getNombreApellido());
            ps.setInt(2, j.getDni());
            ps.setDate(3,  Date.valueOf(j.getFechaNac()));
            ps.setDouble(4, j.getAltura());
            ps.setDouble(5, j.getPeso());
            ps.setString(6, j.getEstilo());
            ps.setString(7, j.getManoHabil());
            ps.setBoolean(8, j.isActivo());
            ps.setInt(9, j.getIdJugador());
            
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Jugador actualizado");
        
      }else{
              JOptionPane.showMessageDialog(null, "El Jugador no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Jugador");
        }
  }
}

>>>>>>> main
