package Controles;

import Modelos.Jugador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class JugadorData {
    
    private Connection con;
  
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
            ps.setFloat(4, j.getAltura());
            ps.setFloat(5, j.getPeso());
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
            ps.setFloat(4, j.getAltura());
            ps.setFloat(5, j.getPeso());
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

   public ArrayList<Jugador> obtenerJugadores(){
       
        ArrayList<Jugador> jugadores=new ArrayList<>();  
        
        String sql="SELECT * FROM jugador";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                Jugador j = new Jugador();
                j.setIdJugador(rs.getInt("id_jugador"));
                j.setDni(rs.getInt("dni"));
                j.setActivo(rs.getBoolean("activo"));
                j.setNombreApellido(rs.getString("nombreApellido"));
                j.setFechaNac(rs.getDate("fechaNac").toLocalDate());
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
        
           try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idJugador);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                  j.setIdJugador(rs.getInt("id_jugador"));
                  j.setDni(rs.getInt("dni"));
                  j.setActivo(rs.getBoolean("activo"));
                  j.setNombreApellido(rs.getString("nombreApellido"));
                  j.setFechaNac((rs.getDate("fechaNac")).toLocalDate());
                  
                  j.setPeso(rs.getFloat("peso"));
                  j.setAltura(rs.getFloat("altura"));
                  j.setEstilo(rs.getString("estilo"));
                  j.setManoHabil(rs.getString("manoHabil"));

              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar jugador");
        }

      return j;
    }
   
   public void borrarJugador(int idJugador){
      String sql = "DELETE FROM jugador WHERE id_jugador = ?";
    
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idJugador);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Jugador Eliminado");
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar jugador, el mismo se encuentra registrado en otro evento");
        }
    }
   
   public Jugador buscarJugadorPorDni(int dni){
       
        String sql = "SELECT * FROM jugador WHERE dni = ? ";
         Jugador j = new Jugador();
      PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.setInt(1, dni);
              ResultSet rs = ps.executeQuery();

              while(rs.next()){
                  j.setIdJugador(rs.getInt("id_jugador"));
                  j.setActivo(rs.getBoolean("activo"));
                  j.setNombreApellido(rs.getString("nombreApellido"));
                  j.setFechaNac(rs.getDate("fechaNac").toLocalDate());
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
   
   public Jugador buscarJugadorId(int id){
        Jugador j = null;
        
        String query = "SELECT * FROM jugador WHERE id_jugador = ?";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rst = ps.executeQuery();
            
            while(rst.next()){
                j = new Jugador();
                j.setIdJugador(rst.getInt("id_jugador"));
                j.setNombreApellido(rst.getString("nombreApellido"));
                j.setDni(rst.getInt("dni"));
                j.setFechaNac(rst.getDate("fechaNac").toLocalDate());
                j.setAltura(rst.getFloat("altura"));
                j.setPeso(rst.getFloat("peso"));
                j.setEstilo(rst.getString("estilo"));
                j.setManoHabil(rst.getString("manoHabil"));
                j.setActivo(rst.getBoolean("activo"));
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR...Jugador por ID No Encontrado");
         }
        return j;
    }
   
   public ArrayList<Jugador> obtenerJugadoresActivos(){
        
        ArrayList<Jugador> jugadores = new ArrayList<>();        
        String sql="SELECT * FROM jugador WHERE activo = 1 ";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                Jugador j = new Jugador();
                j.setIdJugador(rs.getInt("id_jugador"));
                j.setDni(rs.getInt("dni"));
                j.setActivo(rs.getBoolean("activo"));
                j.setNombreApellido(rs.getString("nombreApellido"));
                j.setFechaNac(rs.getDate("fechaNac").toLocalDate());                
                j.setPeso(rs.getFloat("peso"));
                j.setAltura(rs.getFloat("altura"));
                j.setEstilo(rs.getString("estilo"));
                j.setManoHabil(rs.getString("manoHabil"));
                
                jugadores.add(j);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en buscar Jugadores Activos.");
        }
        return jugadores;
    }
   
 }