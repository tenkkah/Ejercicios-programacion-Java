/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá
la altura. Para la base se pintan dos asteriscos menos que la altura.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej33 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int altura;
        
        System.out.println("Introduce la altura");
        altura=teclado.nextInt();
        
       for (int i = 1; i < altura; i++){
      for (int j = 1; j <= altura; j++){
        if ((j == 1) || (j == altura)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i < altura; i++){
      if ((i == 1) || (i == altura)){
        System.out.print(" ");
      } else {
        System.out.print("*");
      }
    }
    }
}
