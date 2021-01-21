/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexion.Conexion;
import Entidades.formulario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CeciliaSanchezMacas
 */
public class DATFormulario {
 Conexion conectar = new Conexion();
 ResultSet rs;
 PreparedStatement ps = null;
 
     public boolean InsertariRespuestaBD(formulario objFormulario) {
         System.out.println(objFormulario);
        String sql = "INSERT INTO formulario (Nombre_Pregunta, Respuesta) "
                + "VALUES (?,?)";
        try {
            ps = conectar.conectarBD().prepareStatement(sql);
            ps.setString(1, objFormulario.getPregunta());
            ps.setString(2, String.valueOf(objFormulario.getRespuesta()));
            ps.execute();
            System.out.println("creado");
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            
        }
    }
     
}

