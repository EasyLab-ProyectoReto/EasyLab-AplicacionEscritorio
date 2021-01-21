/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO PC
 */
public class Conexion {
    public Connection con;
   public String driver = "com.mysql.jdbc.Driver";
    
   //mismo nombre de la clase
    public Conexion() {
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://mysql-juanyasa.alwaysdata.net/juanyasa_proyectoreto", "juanyasa", "dragonperla4");
           if (con !=null) {
               //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectarse con la BD");
        }
    }
    public Connection conectarBD(){
        return con;
    }
     public void CerrarConexion() throws SQLException{
       con.close();
    }
    /*public void desconectarBD(){
        con = null;
        if (con==null) {
            System.out.println("Conexión Cerrada...");
          //JOptionPane.showMessageDialog(null, "Conexion cerrada...");

        }
    }*/
    /*static String bd = "easylabproyecto";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection connection = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (Exception ex) {
        }
    }*/
}
