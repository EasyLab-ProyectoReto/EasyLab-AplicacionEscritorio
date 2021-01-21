/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author CeciliaSanchezMacas
 */
public class formulario {
   String pregunta;
   int respuesta;

    public formulario() {
    }

    public formulario(String pregunta, int respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "formulario{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }    
}
