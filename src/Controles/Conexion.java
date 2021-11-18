package Controles;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    private Connection conexion;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/torneotenis";
    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        // Reseteamos a null la conexion a la bd
        conexion=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            conexion= (Connection) DriverManager.getConnection(url, user, pass);
            
        }
       
        catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Error al conectar los drivers");
        }
        return conexion;
    }


    public Connection getConexion() {
        return conexion;
    }

      
}
