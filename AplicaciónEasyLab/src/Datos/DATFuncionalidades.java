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
public class DATFuncionalidades {
    
    
    /* Se Presenta un pdf */
    public PDF Presentar_PDF() {
        Conexion conectar = new Conexion();
        PDF pdf = new PDF();
        String sql = "SELECT * FROM funcionalidades;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conectar.conectarBD().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PDF vo = new PDF();
                vo.setCodigopdf(rs.getInt(1));
                vo.setFecha(rs.getDate(2));
                vo.setNombrepdf(rs.getString(3));
                vo.setArchivopdf(rs.getBytes(4));
                vo.setDescripcion(rs.getString(5));
                vo.setNombreHerramienta(rs.getString(6));
                pdf = vo;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conectar.desconectarBD();
                System.out.println("Se Desconecto");
            } catch (Exception ex) {
            }
        }
        return pdf;
    }
    public void ejecutar_archivoPDF(PDF id) {
        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.conectarBD().prepareStatement("SELECT Funcionalidad_PDF FROM funcionalidades WHERE Id_Funcionalidad = ?;");
            ps.setInt(1, id.getCodigopdf());
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("Recursos\\Funcionalidades.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectarBD();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }
}
