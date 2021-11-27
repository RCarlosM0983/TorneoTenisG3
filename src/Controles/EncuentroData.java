package Controles;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelos.Encuentro;
//import Modelos.Estadio;
import Modelos.Jugador;
import java.time.LocalDate;
//import Modelos.Torneo;

public class EncuentroData {
   private Connection con;
   private Conexion c = new Conexion();
   private EstadioData ed = new EstadioData(c);
   private TorneoData td = new TorneoData(c);
   private JugadorData jd = new JugadorData(c);
  
   public EncuentroData(Conexion conn){
      con = conn.conectar();    
    }
    
    public void guardarEncuentro(Encuentro en){
        String sql = "INSERT INTO encuentros (fechaEnc, finalizado, id_jugador1, id_jugador2, id_estadio, id_torneo, activo) VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(en.getFechaEnc()));
            ps.setBoolean(2, en.isFinalizado());          
            ps.setInt(3, en.getJugador1().getIdJugador());
            ps.setInt(4, en.getJugador2().getIdJugador());
            ps.setInt(5, en.getEstadio().getIdEstadio());
            ps.setInt(6, en.getTorneo().getIdTorneo());
            ps.setBoolean(7, en.isActivo());
            
            ps.executeUpdate();
            ResultSet rst = ps.getGeneratedKeys();
            
            if(rst.next()){
                en.setId_encuentro(rst.getInt(1));
                JOptionPane.showMessageDialog(null, "Encuentro Guardado");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR...al guardar Encuentro "+ex.getMessage());
        }
    }
    
    public Encuentro buscarEncuentro(int id){
        Encuentro e = new Encuentro();
        
        String sql = "SELECT * FROM encuentros WHERE id_encuentro = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rst = ps.executeQuery();
            
            while(rst.next()){
                e.setId_encuentro(rst.getInt("id_encuentro"));
                e.setFechaEnc(rst.getDate("fechaEnc").toLocalDate());
                e.setFinalizado(rst.getBoolean("finalizado"));
                e.setGanador(jd.buscarJugadorId(rst.getInt("ganador")));
                e.setJugador1(jd.buscarJugador(rst.getInt("id_jugador1")));
                e.setJugador2(jd.buscarJugador(rst.getInt("id_jugador2")));
                e.setEstadio(ed.buscarEstadioPorId(rst.getInt("id_estadio")));
                e.setTorneo(td.buscarTorneoId(rst.getInt("id_torneo")));
                e.setActivo(rst.getBoolean("activo"));
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR..Encuentro no encontrado "+ex.getMessage());
         }
        return e; 
    }
    
    public void ganadorEncuentro(Encuentro enc) {
         String sql = "UPDATE encuentros SET ganador = ?  WHERE id_encuentro = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
                
                ps.setInt(1, enc.getGanador().getIdJugador());
                ps.setInt(2, enc.getId_encuentro());
                
                ps.executeUpdate();

            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Ganador Actualizado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR... en Actualizar Ganador ");
             }
            ps.close();
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR...Jugador No Encontrado "+ex.getMessage());
         }
    }
    
    public void actualizarEncuentro(Encuentro enc){
        
         String sql = "UPDATE encuentros SET fechaEnc = ?, finalizado = ?, ganador = ?, id_jugador1 = ?, id_jugador2 = ?, id_estadio = ?, id_torneo = ?, activo = ?  WHERE id_encuentro = ?";
       
         try{
            PreparedStatement ps = con.prepareStatement(sql);
                
            ps.setDate(1, Date.valueOf(enc.getFechaEnc()));
            ps.setBoolean(2, enc.isFinalizado());
            ps.setInt(3, enc.getGanador().getIdJugador());
            ps.setInt(4, enc.getJugador1().getIdJugador());
            ps.setInt(5, enc.getJugador2().getIdJugador());
            ps.setInt(6, enc.getEstadio().getIdEstadio());
            ps.setInt(7, enc.getTorneo().getIdTorneo());
            ps.setBoolean(8, enc.isActivo());
            ps.setInt(9, enc.getId_encuentro());
                
            ps.executeUpdate();

            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Encuentro Actualizado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR... en Actualizar Encuentro");
             }
            ps.close();
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR...Encuentro No Encontrado "+ex.getMessage());
         }
    }
    
    public void actualizarEncuentroSinGanador(Encuentro enc){
        
         String sql = "UPDATE encuentros SET fechaEnc = ?, finalizado = ?, id_jugador1 = ?, id_jugador2 = ?, id_estadio = ?, id_torneo = ?, activo = ?  WHERE id_encuentro = ?";
       
         try{
            PreparedStatement ps = con.prepareStatement(sql);
                
            ps.setDate(1, Date.valueOf(enc.getFechaEnc()));
            ps.setBoolean(2, enc.isFinalizado());            
            ps.setInt(3, enc.getJugador1().getIdJugador());
            ps.setInt(4, enc.getJugador2().getIdJugador());
            ps.setInt(5, enc.getEstadio().getIdEstadio());
            ps.setInt(6, enc.getTorneo().getIdTorneo());
            ps.setBoolean(7, enc.isActivo());
            ps.setInt(8, enc.getId_encuentro());
                
            ps.executeUpdate();

            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Encuentro Actualizado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR... en Actualizar encuentro");
             }
            ps.close();
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR... Encuentro No Encontrado "+ex.getMessage());
         }
    }
    
    public void borrarEncuentro(int id) {
        String sql = "DELETE FROM encuentros  WHERE id_encuentro = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Encuentro Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR...en Eliminar Encuentro");
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR... Encuentro No Encontrado "+ex.getMessage());
         }
    }
    
    public List<Jugador> listaPosibleGanador(int id_encuentro){
        
        ArrayList<Jugador> listaDeJugadoresXPartido = new ArrayList<>();
        
        String sql = "SELECT encuentros.id_jugador1, encuentros.id_jugador2 "
                + "FROM encuentros WHERE encuentros.id_encuentro = ? ";
           
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_encuentro);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Jugador j1 = new Jugador();
                j1 = jd.buscarJugadorId(rs.getInt("id_jugador1"));                
                
                Jugador j2 = new Jugador();
                j2 = jd.buscarJugadorId(rs.getInt("id_jugador2"));
                
                 listaDeJugadoresXPartido.add(j1);
                 listaDeJugadoresXPartido.add(j2);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR... No hay jugadores"+ ex.getMessage());   
        }
        return  listaDeJugadoresXPartido;
    }       
    
    public List<Encuentro> listaDeEncuentros(){
        
     ArrayList<Encuentro> listaDeEncuentros = new ArrayList<>();
        
        String aql = "SELECT * FROM encuentros WHERE activo = true";
         
        try{
            PreparedStatement ps = con.prepareStatement(aql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){                
                Encuentro enc = new Encuentro(); 
                
                enc.setId_encuentro(rs.getInt("id_encuentro"));                
                enc.setFechaEnc(rs.getDate("fechaEnc").toLocalDate());
                enc.setFinalizado(rs.getBoolean("finalizado"));
                /*
                Jugador gan = jd.buscarJugadorId(rs.getInt("ganador"));
                enc.setGanador(gan);
                Jugador j1 = jd.buscarJugadorId(rs.getInt("id_jugador1"));
                enc.setJugador1(j1);
                Jugador j2 = jd.buscarJugadorId(rs.getInt("id_jugador2"));
                enc.setJugador2(j2);
                Estadio es = ed.buscarEstadioPorId(rs.getInt("id_estadio"));
                enc.setEstadio(es);
               // Torneo tor = td.buscarTorneoId(rs.getInt("id_torneo"));
                //enc.setTorneo(tor);
                */                
                enc.setGanador( jd.buscarJugadorId(rs.getInt("ganador")));
                enc.setJugador1(jd.buscarJugadorId(rs.getInt("id_jugador1")));
                enc.setJugador2(jd.buscarJugadorId(rs.getInt("id_jugador2")));
                enc.setEstadio( ed.buscarEstadioPorId(rs.getInt("id_estadio")));
                enc.setTorneo( td.buscarTorneoId(rs.getInt("id_torneo")));                
                
                enc.setActivo(true);
                listaDeEncuentros.add(enc);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR \nNo hay Encuentros "+ ex.getMessage());   
        }
        return listaDeEncuentros;
    }

    public List<Encuentro> listaEncuentrosXJugador(int id_jugador){
        
        ArrayList<Encuentro> listaDeEncuentrosXJugador = new ArrayList<>();
        
        String sql = "SELECT encuentros.id_encuentro, encuentros.fechaEnc "
                + "FROM encuentros, jugador "
                + "WHERE jugador.id_jugador = ? "
                + "AND jugador.id_jugador = encuentros.id_jugador1 "
                + "UNION "
                + "SELECT encuentros.id_encuentro, encuentros.fechaEnc "
                + "FROM encuentros, jugador " 
                + "WHERE jugador.id_jugador = ? " 
                + "AND jugador.id_jugador = encuentros.id_jugador2";
        
            try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_jugador);
            ps.setInt(2, id_jugador);
            ResultSet rs = ps.executeQuery();
                         
           while(rs.next()){
                Encuentro e = new Encuentro();
                e.setId_encuentro(rs.getInt("id_encuentro"));
                e.setFechaEnc(rs.getDate("fechaEnc").toLocalDate());
               
                
                listaDeEncuentrosXJugador.add(e);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR...Jugador no encontrado "+ex.getMessage());
         }
        return listaDeEncuentrosXJugador;  
    }
    
  public List<Encuentro> listaDeEncuentrosFuturos(){
        
     ArrayList<Encuentro> listaDeEncuentrosFuturos = new ArrayList<>();
        
        String sql = "SELECT * FROM encuentros WHERE fechaEnc >= CURDATE() AND activo = true";
         
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rst = ps.executeQuery();
            
            while(rst.next()){                
                Encuentro enc = new Encuentro(); 
                
                enc.setId_encuentro(rst.getInt("id_encuentro"));
                enc.setFechaEnc(rst.getDate("fechaEnc").toLocalDate());
                enc.setFinalizado(rst.getBoolean("finalizado"));
                enc.setGanador( jd.buscarJugadorId(rst.getInt("ganador")));
                enc.setJugador1(jd.buscarJugadorId(rst.getInt("id_jugador1")));
                enc.setJugador2(jd.buscarJugadorId(rst.getInt("id_jugador2")));
                enc.setEstadio(ed.buscarEstadioPorId(rst.getInt("id_estadio")));
                enc.setTorneo(td.buscarTorneoId(rst.getInt("id_torneo")));
            
                enc.setActivo(true);
                
                listaDeEncuentrosFuturos.add(enc);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR... No hay Encuentros "+ ex.getMessage());   
        }
        return listaDeEncuentrosFuturos;
    }  
   public ArrayList<Encuentro> todosLosEncuentros(){
        
     ArrayList<Encuentro> encuentros = new ArrayList<>();
        
        String sql = "SELECT * FROM encuentros";
         
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){                
                Encuentro e = new Encuentro(); 
                
                e.setId_encuentro(rs.getInt("id_encuentro"));                
                e.setFechaEnc(rs.getDate("fechaEnc").toLocalDate());
                e.setFinalizado(rs.getBoolean("finalizado"));      
                e.setGanador( jd.buscarJugadorId(rs.getInt("ganador")));
                e.setJugador1(jd.buscarJugadorId(rs.getInt("id_jugador1")));
                e.setJugador2(jd.buscarJugadorId(rs.getInt("id_jugador2")));
                e.setEstadio( ed.buscarEstadioPorId(rs.getInt("id_estadio")));
                e.setTorneo( td.buscarTorneoId(rs.getInt("id_torneo")));                
                e.setActivo(rs.getBoolean("activo"));
                encuentros.add(e);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR \nNo hay Encuentros "+ ex.getMessage());   
        }
        return encuentros;
    }
  public List<Encuentro> listaEncuentrosXTorneo(int idTorneo){
        
     ArrayList<Encuentro> encuentros = new ArrayList<>();
        
        String aql = "SELECT * FROM encuentros WHERE id_torneo = ?";
         
        try{
            PreparedStatement ps = con.prepareStatement(aql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idTorneo);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){                
                Encuentro enc = new Encuentro(); 
                
                enc.setId_encuentro(rs.getInt("id_encuentro"));                
                enc.setFechaEnc(rs.getDate("fechaEnc").toLocalDate());
                enc.setFinalizado(rs.getBoolean("finalizado"));          
                enc.setGanador( jd.buscarJugadorId(rs.getInt("ganador")));
                enc.setJugador1(jd.buscarJugadorId(rs.getInt("id_jugador1")));
                enc.setJugador2(jd.buscarJugadorId(rs.getInt("id_jugador2")));
                enc.setEstadio( ed.buscarEstadioPorId(rs.getInt("id_estadio")));
                enc.setTorneo( td.buscarTorneoId(rs.getInt("id_torneo")));                
                enc.setActivo(rs.getBoolean("activo"));
                encuentros.add(enc);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR \nNo hay Encuentros "+ ex.getMessage());   
        }
        return encuentros;
    }
}
