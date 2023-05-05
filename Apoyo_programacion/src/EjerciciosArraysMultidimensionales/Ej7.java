/*Utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera con datos por
teclado y trasponerla en la segunda.
 */
package EjerciciosArraysMultidimensionales;

import java.util.Scanner;


public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int matriz1[][], matriz2[][];
        
        matriz1 = new int[5][9];
        matriz2 = new int[9][5];
        
        System.out.println("Digite la matriz 2");
        for(int i = 0;i<5;i++){
            for(int j =0;j<9;j++){
                System.out.print("Matriz["+i+"]["+j+"]");
                matriz1[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("La matriz original es ");
        for(int i = 0;i<5;i++){
            for(int j = 0; j<9; j++){
                System.out.print(matriz1[i][j]+"");
            }
            System.out.println("");
        }
    }
}
