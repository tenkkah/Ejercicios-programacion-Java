/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej19 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int altura;
        
        char caracter;
        
        System.out.println("Introduce la altura de la piramide");
        altura=teclado.nextInt();
        
        System.out.println("Introduce el caracter con el que pintar la piramide");
        caracter=teclado.next().charAt(0);
        
        for (int i=1;i<=altura;i++){    //El que se coloca en la posicion
           // System.out.println("FILA "+i+": ");
            for(int k=1;k<=altura-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)       //El que pinta los astericos
                System.out.print(caracter+" ");
                System.out.println();
        
            }       
    }
}
