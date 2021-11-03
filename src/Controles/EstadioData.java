package Controles;

import Modelos.Estadio;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EstadioData {
    
     private Connection con = null;

    public EstadioData() {
    }
     
     
  
  public EstadioData(Conexion conn){ 
      con = conn.conectar();
    }
  public void registrarEstadio(Estadio e){
    String sql = "INSERT INTO estadio(nombre, ciudad, ancho, largo, categoria, habilitado, direccion, capacidad, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCiudad());
            ps.setDouble(3, e.getAncho());
            ps.setDouble(4, e.getLargo());
            ps.setString(5, e.getCategoria());
            ps.setBoolean(6, e.isEnUso());
            ps.setString(7, e.getDireccionComercial());
            ps.setInt(8, e.getCapacidad());
            ps.setBoolean(9, e.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                e.setIdEstadio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Estadio registrado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el estadio "+ex);
        }
  }
   

  public ArrayList<Estadio> obtenerEstadios(){
        Estadio e = new Estadio();
        ArrayList<Estadio> estadios=new ArrayList<>();        
        String sql="SELECT * FROM jugador";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                e.setIdEstadio(rs.getInt("id_estadio"));
                e.setNombre(rs.getString("nombre"));
                e.setCiudad(rs.getString("ciudad"));
                e.setAncho(rs.getDouble("ancho"));
                e.setLargo(rs.getDouble("largo"));
                e.setCategoria(rs.getString("categoria"));
                e.setEnUso(rs.getBoolean("habilitado"));
                e.setDireccionComercial(rs.getString("direccion"));
                e.setCapacidad(rs.getInt("capacidad"));
                e.setActivo(rs.getBoolean("activo"));
                
                estadios.add(e);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return estadios;
    }
 
  public Estadio buscarEstadio(int idEstadio){
        Estadio e = new Estadio();
        String sql = "SELECT * FROM jugador WHERE id_estadio = ? ";

      PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.setInt(1, idEstadio);
              ResultSet rs = ps.executeQuery();

              while(rs.next()){
                e.setIdEstadio(rs.getInt("id_estadio"));  
                e.setNombre(rs.getString("nombre"));
                e.setCiudad(rs.getString("ciudad"));
                e.setAncho(rs.getDouble("ancho"));
                e.setLargo(rs.getDouble("largo"));
                e.setCategoria(rs.getString("categoria"));
                e.setEnUso(rs.getBoolean("habilitado"));
                e.setDireccionComercial(rs.getString("direccion"));
                e.setCapacidad(rs.getInt("capacidad"));
                e.setActivo(rs.getBoolean("activo"));

              }
              ps.close();

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }

      return e;
    }
  public void borrarEstadio(int idEstadio){
      String sql = "UPDATE estadio SET activo = false WHERE id_estadio = ?";
    
      try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idEstadio);
        
         ResultSet rs =ps.executeQuery();
        
      if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Estadio borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Estadio "+ex);
        }   
    }
  public void actualizarEstadio(Estadio e){
        try {
            String sql = "UPDATE jugador SET nombre = ?, ciudad = ?, ancho = ?, largo = ?, categoria = ?, habilitado = ?, direccion = ?, capacidad = ?, activo = ? WHERE id_estadio = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);            
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCiudad());
            ps.setDouble(3, e.getAncho());
            ps.setDouble(4, e.getLargo());
            ps.setString(5, e.getCategoria());
            ps.setBoolean(6, e.isEnUso());
            ps.setString(7, e.getDireccionComercial());
            ps.setInt(8, e.getCapacidad());
            ps.setBoolean(9, e.isActivo()); 
            ps.setInt(10, e.getIdEstadio());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Estadio actualizado");
        
      }else{
              JOptionPane.showMessageDialog(null, "El Estadio no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Estadio");
        }
  }
}
