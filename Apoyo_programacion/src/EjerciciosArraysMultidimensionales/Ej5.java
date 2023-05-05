/*
Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la
diagonal principal sean 1 y el resto 0
 */
package EjerciciosArraysMultidimensionales;

import java.util.Arrays;


public class Ej5 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        
        
        //Relleno la diagonal principal con 1
        //SOlo tengo que recorrer las castillas en las que el numero de fila es  igual que el numero de columna
        for(int i = 0;i<matriz.length;i++){
            matriz[i][i]=1;
        }
        
        //Muestro las filas de la matriz
        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
