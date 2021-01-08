/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author USUARIO PC
 */
public class PDF {
    int codigopdf;
    Date fecha;
    String nombrepdf;
    byte[] archivopdf;
    String descripcion;
    String nombreHerramienta;

    public PDF() {
    }

    public PDF(int codigopdf, Date fecha, String nombrepdf, byte[] archivopdf, String descripcion, String nombreHerramienta) {
        this.codigopdf = codigopdf;
        this.fecha = fecha;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
        this.descripcion = descripcion;
        this.nombreHerramienta = nombreHerramienta;
    }

    public PDF(int codigopdf, String nombrepdf, byte[] archivopdf) {
        this.codigopdf = codigopdf;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
    }

    public int getCodigopdf() {
        return codigopdf;
    }

    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }
    
    
}
