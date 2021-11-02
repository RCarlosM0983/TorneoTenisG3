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
    String sql = "INSERT INTO estadio(nombre, ciudad, ancho, largo, categoria, habilitado, direccion, capacidad) VALUES (?, ?, ?; ?, ?, ?; ?, ?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCiudad());
            ps.setFloat(3, e.getAncho());
            ps.setFloat(4, e.getLargo());
            ps.setString(5, e.getCategoria());
            ps.setBoolean(6, e.isEnUso());
            ps.setString(7, e.getDireccionComercial());
            ps.setInt(8, e.getCapacidad());
            
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
  /*  

  public ArryList<Estadio> obtenerEstadios(){
        Estadio e;
        ArrayList<Estadio> estadios = new ArrayList<>();        
        String sql="SELECT * FROM estadio";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                a = new Alumno();
                a.setLegajo(rs.getInt("legajo"));
                a.setActivo(rs.getBoolean("activo"));
                a.setNombre(rs.getString("nombre"));
                a.setApellido(rs.getString("apellido"));
                a.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                a.setIdAlumno(rs.getInt("idAlumno"));
                alumnos.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return alumnos;
    }
 /*  
  public Alumno buscarAlumno(int idAlumno){
      Alumno a = null;
      String sql = "SELECT * FROM alumno WHERE idAlumno = ? ";
      
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                a = new Alumno();
                
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                a.setLegajo(rs.getInt("legajo"));
                a.setActivo(rs.getBoolean("activo"));
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
   
    return a;
  }
  
  public void borrarAlumno(int idAlumno){
      String sql = "UPDATE alumno SET activo = false WHERE idAlumno = ?";
    
      try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlumno);
        
         ResultSet rs =ps.executeQuery();
        
      if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Alumno borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar alumno");
        }   
    }
  
  public void actualizarAlumno(Alumno a){
        try {
            String sql = "UPDATE alumno SET apellido = ?, nombre = ?, fechaNac = ?, legajo = ?, activo = ? WHERE idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            ps.setString(1, a.getApellido());
            ps.setString(2, a.getNombre());
            //ps.setDate(3, a.getFechaNac().toLocalDate());
            ps.setDate(3, Date.valueOf(a.getFechaNac()));
            ps.setInt(4, a.getLegajo());
            ps.setBoolean(5, a.isActivo());
            ps.setInt(6, a.getIdAlumno());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Alumno actualizado");
        
      }else{
              JOptionPane.showMessageDialog(null, "El alumno no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar alumno");
        }
  }*/
}
