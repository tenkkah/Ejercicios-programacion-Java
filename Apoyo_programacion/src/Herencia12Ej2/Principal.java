/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia12Ej2;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int velocidad, plato=0, pinon=0;
     
        Bicicleta mibicicleta = new Bicicleta(10,2,1);
        Bicicleta mibicicleta2 = new Bicicleta(20,4,2);
        
        mibicicleta.acelerar();
        mibicicleta.frenar();
        mibicicleta.Cambiarplato(plato);
        mibicicleta.Cambiarpinon(pinon);
        
        
    }
  
}
