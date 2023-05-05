/*Escribe un programa que lea un número n e imprima una 
pirámide de números con n filas como en la siguiente figura:
1
121
12321
1234231
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej23 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n,j;
        
        System.out.println("Introduce numero de filas");
        n=teclado.nextInt();
        
        for(int i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            
            System.out.println();
        }
    }
}


