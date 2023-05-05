/*Hacer un programa que pida un número, entre 0 y 10, y escriba un triángulo invertido
 con dichos números.
Ej: Si n=10, quedaría
0,1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
2,3,4,5,6,7,8,9
3,4,5,6,7,8,9
4,5,6,7,8,9
5,6,7,8,9
6,7,8,9
7,8,9
8,9
9
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
         do{
      System.out.println("Introducir altura entre 0 y 10");
      altura=teclado.nextInt();
    }while(altura<1 && altura>10);
    
    
    for(int i=altura;i>=1;i=i-2){
      for(int j=1;j<=i;j++)  
        System.out.print(i+" ");
      System.out.println();
    }
    
    
    }
   
    }

