/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author USUARIO PC
 */
public class PDF {
    int codigopdf;
    String nombrepdf;
    byte[] archivopdf;

    public PDF() {
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
    
    
}
