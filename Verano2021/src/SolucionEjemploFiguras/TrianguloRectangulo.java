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
public class TrianguloRectangulo extends Triangulo {
    private int cateto;
    
    TrianguloRectangulo(int cateto){
        super(cateto,cateto);
    }

    @Override
    public void dibujarTxt() {
        for(int i=1;i<=getAltura();i++){
          for(int j=1;j<=i;j++)
            System.out.print("* ");
          System.out.println();  
        }
    }
}
