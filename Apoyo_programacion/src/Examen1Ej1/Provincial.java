/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Ej1;


public class Provincial extends Llamada{
    
    
    private String franja;
    private final double precio1 = 0.20;
    private final double precio2 = 0.25;
    private final double precio3 = 0.30;

    public Provincial(String nOrigen, String nDestino, int duracion,String franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
    }
    
    
    public int Coste(){
        double coste;
        if(franja.equals("1")){
            coste = getDuracion()*precio1;
        }else if(franja.equals("2")){
            coste = getDuracion()*precio2;
        }else{
            coste = getDuracion()*precio3;      
        }
        return (int) coste;
    }

    @Override
    public String toString() {
        return "Provincial{" + "franja=" + franja + ", precio1=" + precio1 + ", precio2=" + precio2 + ", precio3=" + precio3 + '}';
    }
    
    
}
