/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexion.Conexion;
import Entidades.PDF;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO PC
 */
public class DATPracticas {
    
    public ArrayList<PDF> Listar_PDFs() {
        Conexion conectar = new Conexion();
        ArrayList<PDF> list = new ArrayList<PDF>();
        String sql = "SELECT * FROM practicas;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conectar.conectarBD().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PDF pra = new PDF();
                pra.setCodigopdf(rs.getInt(1));
                pra.setFecha(rs.getDate(2));
                pra.setNombrepdf(rs.getString(3));
                pra.setArchivopdf(rs.getBytes(4));
                pra.setDescripcion(rs.getString(5));
                pra.setNombreHerramienta(rs.getString(6));
                list.add(pra);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                 conectar.CerrarConexion();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    public void ejecutar_archivoPDF(int id) {
        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.conectarBD().prepareStatement("SELECT Practica_PDF FROM practicas WHERE Id_Practica = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
                System.err.println("mira: "+b);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("Recursos\\Practica.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.CerrarConexion();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }
}
