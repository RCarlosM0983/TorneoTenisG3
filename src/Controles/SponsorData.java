package Controles;

import Modelos.Sponsor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SponsorData {
    private Connection con;

    public SponsorData(Conexion conexion) {
        this.con = conexion.getConexion();
    }

    public void guardarSponsor(Sponsor sponsor) {

            String sql = "INSERT INTO sponsor ( id_sponsor, marca, indumentaria, activo) VALUES ( ? , ? , ? , ? )";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setInt(1, sponsor.getIdSponsor());
                ps.setString(2, sponsor.getMarca());
                ps.setString(3, sponsor.getIndumentaria());
                ps.setBoolean(4, sponsor.isActivo());

                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();

                if(rs.next()){
                sponsor.setIdSponsor(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Guardado de Sponsor satisfactorio");
            }
                ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar Sponsor "+ ex);
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
                }
        }
        catch(SQLException ex){
         System.out.println("Sponsor no encontrado: " + ex);
        }
        return spon;
} 

    public void modificarSponsor (Sponsor s) {
        String sql = "UPDATE sponsor SET marca = ? , activo = ? Where id_sponsor = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,s.getMarca());
            ps.setBoolean(2, s.isActivo());
            ps.setInt(3, s.getIdSponsor());

            ps.executeUpdate();
            ps.close();
                System.out.println("Sponsor modificado con exito.");
        }
        catch (SQLException ex){
                System.out.println("Error al actualizar sponsor: "+ex);
        }

 }

    public Sponsor bajaSponsor (int id){
         Sponsor spon = new Sponsor();
         String sql = "UPDATE sponsor SET activo = ? WHERE id_sponsor = ? ";
         try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

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
            String sql="DELETE FROM sponsor WHERE id_sponsor = ? ";
            PreparedStatement ps;

            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);

                ps.executeUpdate();
                ps.close();

                System.out.println("Sponsor borrado definitivamente");
            } catch (SQLException ex) {
                 System.out.println("Error al borrar "+ex);
            }
    }
/*
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
    */
    public List<Sponsor> obtenerSponsores(){

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

        String sql = "SELECT * FROM sponsor WHERE activo=true";

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
       
           public boolean sponsorExiste(int id){
        boolean ret = false;
        String sql = "SELECT * FROM sponsor WHERE id_sponsor =?";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ret = true;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar el sponsor en la base de datos");
        }
        return ret;
    }
}


