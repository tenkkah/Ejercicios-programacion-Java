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
public class Rectangulo implements Figura{
    private int altura,base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
    @Override
    public String NombreFigura() {
       //return "Rectangulo"
       return getClass().getSimpleName();
    }

    @Override
    public int Area() {
       return base*altura;
    }

    @Override
    public int Perimetro() {
      return 2*(base+altura);  
    }

    @Override
    public void dibujarTxt() {
       for(int i=1;i<=altura;i++){
         for(int j=1;j<=base;j++)
          System.out.print("* ");
         System.out.println();
       } 
    }
}