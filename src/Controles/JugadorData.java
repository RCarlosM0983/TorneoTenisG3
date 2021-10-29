
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
    String sql = "INSERT INTO jugador(nombreApellido, dni, FechaNac, altura, peso, estilo, manoHabil, "
            + " activo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";
    
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

 /* public List<Alumno> obtenerAlumnos(){
        Alumno a;
        ArrayList<Alumno> alumnos=new ArrayList<>();        
        String sql="SELECT * FROM alumno";
        
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


