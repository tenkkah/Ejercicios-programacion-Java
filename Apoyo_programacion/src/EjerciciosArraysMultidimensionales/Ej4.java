/*Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
 */
package EjerciciosArraysMultidimensionales;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] array= new int[3][3];
        
        System.out.println("Ingrese los numeros del array");
        for(int i = 0;i<array.length;i++){
            for(int j = 0; j<array.length;j++){
                System.out.println("["+i+"]"+"["+j+"]"+"=");
                array[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Imprimiendo la tabla original");
        for(int i = 0; i < array.length; i++){
            System.out.println();
        for(int j = 0;j<array.length;j++){
            System.out.print(array[i][j]+" ");
        }
        }
        
        //Solo se transpone los elementos por debajo de la diagonal principal
        //Caso contratio la matriz queda igual
        //Esta se hace inicializando "i" en 1
        
        System.out.println("TABLA INVERTIDA");
        int aux;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length;j++){
                aux = array[i][j];
                array[j][i] = aux;
            }
        }
        System.out.println("MOSTRANDO LA TABLA TRANSPUESTA");
        for(int i = 0;i<array.length;i++){
            System.out.println();
            for(int j = 0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }
 
}
