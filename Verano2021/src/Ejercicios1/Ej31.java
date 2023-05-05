/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá
la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de
la altura más uno.
 Ejemplo: Introduzca la altura de la L: 5
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej31 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int altura;
        
        System.out.println("Introduce la altura");
        altura=teclado.nextInt();
                
     for (int i = 0; i < altura-1; i++){
      System.out.println("*");
    }
    for (int i = 0; i < ((altura/2)+1); i++){
      System.out.print("* ");
    }
    }
}

