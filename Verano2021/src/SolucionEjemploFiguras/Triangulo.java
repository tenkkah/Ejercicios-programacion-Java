/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionEjemploFiguras;

/**
 *
 * @author Aitor
 */
public abstract class Triangulo implements Figura {
    private int base,altura;
    
    Triangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    public int getAltura() {
        return altura;
    }
     
    
    @Override
    public String NombreFigura() {
       return getClass().getSimpleName();
    }

    @Override
    public int Area() {
       return base*altura/2;
    }

    @Override
    public int Perimetro() {
       int cateto=(int)(Math.sqrt(Math.pow(altura,2)+Math.pow((base/2),2)));
       return base+2*cateto;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

       
    @Override
    public abstract void dibujarTxt();
}
