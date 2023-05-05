/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
package EjerciciosArraysMultidimensionales;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in) ;
        int a[][], b[][], suma[][];
        a = new int[3][3];
        b = new int[3][3];
        
        //Leemos los datos
        System.out.println("Matriz A");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("A["+i+"]["+j+"]");
                a[i][j]= teclado.nextInt();
            }
        }
         System.out.println("Matriz B");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("B["+i+"]["+j+"]");
                b[i][j]= teclado.nextInt();
                }
            }
        //hacemos la suma de las dos matrices
        suma = new int[3][3];
        for( int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        
        //mostramos el resultado
        System.out.println("Matriz de la suma");
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
