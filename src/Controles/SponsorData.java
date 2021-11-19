package Controles;

import Modelos.Sponsor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SponsorData {
    private Connection con;

    
    public SponsorData(Conexion conn){
      
      con = conn.conectar();
    
    }

    public void guardarSponsor(Sponsor s) {

            String sql = "INSERT INTO sponsor (marca, indumentaria, activo) VALUES (?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

               
                ps.setString(1, s.getMarca());
                ps.setString(2, s.getIndumentaria());
                ps.setBoolean(3, s.isActivo());

                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                s.setIdSponsor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Sponsor guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar Sponsor ");
        }
     }

    public Sponsor buscarSponsor (int ID){
         Sponsor spon = new Sponsor();
         String sql = "SELECT * FROM sponsor Where id_sponsor = ? ";

        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
                if(rs.next()) {                   
                   spon.setIdSponsor(rs.getInt("id_sponsor"));
                   spon.setMarca(rs.getString("marca"));
                   spon.setActivo(rs.getBoolean("activo"));
                   spon.setIndumentaria(rs.getString("indumentaria"));
                }
        }
        catch(SQLException ex){
         System.out.println("Sponsor no encontrado: " + ex);
        }
        return spon;
} 

    public void modificadarSponsor (Sponsor s) {
        String sql = "UPDATE sponsor SET marca = ? , indumentaria = ?, activo = ? WHERE id_sponsor = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,s.getMarca());
            ps.setString(2, s.getIndumentaria());
            ps.setBoolean(3, s.isActivo());
            ps.setInt(4, s.getIdSponsor());

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

    public Sponsor bajaSponsor (int id){
          Sponsor spon = new Sponsor();
         String sql = "UPDATE sponsor SET activo = ? WHERE id_sponsor = ? ";

         try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setBoolean(1, false);
            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
         System.out.println("Sponsor no encontrado: " + ex);
        }
        return spon;
}  

    public Sponsor altaSponsor (int id){
         Sponsor spon = new Sponsor();
         String sql = "UPDATE sponsor SET activo = ? WHERE id_sponsor = ? ";

         try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setBoolean(1, true);
            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
         System.out.println("Sponsor no encontrado: " + ex);
        }
        return spon;
}

    public void borrarSponsor(int id){
           String sql = " DELETE FROM sponsor WHERE id_sponsor = ? ";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Sponsor Eliminado");
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar sponsor");
        }
    }

    public List<Sponsor> buscarTodosSponsor(){

        List<Sponsor> resultados = new ArrayList<>();

        String sql = "SELECT * FROM sponsor";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
                 Sponsor sponsor = new Sponsor();
                 sponsor.setIdSponsor(rs.getInt("id_sponsor"));
                 sponsor.setMarca(rs.getString("marca"));
                 sponsor.setActivo(rs.getBoolean("activo"));
                 resultados.add(sponsor);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return resultados; 
    }
    
     public List<Sponsor> obtenerSponsoresActivos(){

        List<Sponsor> resultados = new ArrayList<>();

        String sql = "SELECT * FROM sponsor WHERE activo = 1";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
                 Sponsor sponsor = new Sponsor();
                 sponsor.setIdSponsor(rs.getInt("id_sponsor"));
                 sponsor.setMarca(rs.getString("marca"));
                 sponsor.setActivo(rs.getBoolean("activo"));
                 sponsor.setIndumentaria(rs.getString("indumentaria"));
                 resultados.add(sponsor);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return resultados; 
    }
}


