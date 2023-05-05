/*.Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int numero;
        System.out.println("Introduzca un número");        
            numero=teclado.nextInt();
             System.out.println("NUMERO  CUADRADO   CUBO\n");
            for (int i=numero;i<=numero+5;i++) 
                /* System.out.println(i+"  "+(i*i)+"  "+(i*i*i));*/
               System.out.printf("%3d %6d %9d\n",i,(i*i),(i*i*i));
    }
}
