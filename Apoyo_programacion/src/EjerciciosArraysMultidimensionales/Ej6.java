/*Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de
cada columna.
 */
package EjerciciosArraysMultidimensionales;

import java.util.Scanner;


public class Ej6 {
     public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
         int[][] num = new int[3][3];
         System.out.println("Introduce los numeros");
        for(int i = 0;i < num.length;i++){
            for(int j = 0; j < num.length; j++){
                num[i][j]=teclado.nextInt();
            }
           
        }
        
         System.out.println("Imprimiendo la tabla");
         for(int i = 0;i<num.length;i++){
             System.out.println();
             for(int j = 0;j<num.length;j++){
                 System.out.print(num[i][j]+" ");
             }
         }
         System.out.println();
         System.out.println("Suma de fila");
         int suma = 0;
         for(int i = 0;i<num.length;i++){
             for(int j = 0;j<num.length;j++){
                 suma = suma + num[i][j];
             }
             System.out.println("Fila "+i+"="+suma);
             suma = 0;
         }
         System.out.println("Suma Columna");
         for(int i = 0;i<num.length;i++){
             for(int j = 0;j<num.length;j++){
                 suma = suma + num[i][j];
             }
             System.out.println("Columna" +i+"="+suma);
             suma = 0;
         }
    }
}
