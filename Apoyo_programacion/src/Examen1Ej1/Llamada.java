/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Ej1;

/**
 *
 * @author Aitor
 */
public class Llamada {
    private String nOrigen;
    private String nDestino;
    private int duracion;

    public Llamada(String nOrigen, String nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
    }

    public String getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(String nOrigen) {
        this.nOrigen = nOrigen;
    }

    public String getnDestino() {
        return nDestino;
    }

    public void setnDestino(String nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
