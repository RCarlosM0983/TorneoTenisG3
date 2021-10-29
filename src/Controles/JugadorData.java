
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

