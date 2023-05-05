/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si
se obtiene la misma tabla al cambiar las filas por columnas.
 */
package EjerciciosArraysMultidimensionales;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] num= new int[4][4];
        boolean simetria;
        System.out.println("Ingrese los numeros");
        for(int i = 0; i < num.length; i++){ //Primera dimension
            for(int j = 0; j < num.length; j++){ //Dimension dos
                System.out.println("["+i+"]"+"["+j+"]"+"=");
                num[i][j]=teclado.nextInt();
            }
        }
        System.out.println("Imprimiendo la tabla");
        for(int i = 0;i < num.length; i++){
            System.out.println();
            for(int j = 0; j < num.length; j++){
                System.out.print(num[i][j] +" ");
            }
        }
        System.out.println("Comprobando la simetria");
        simetria = true;
        int control = num.length - 1;
        int i = 0;
            while(i < control && simetria == true){
                int j = 0;
                while(j < control && simetria == true){
                    if(num[i][j] != num[i][j]){
                        simetria = false;
                    }
                     j++;   
                }
                i++;
            }
            if(simetria){
                System.out.println("La tabla resuelta simetrica");
            }else{
                System.out.println("La tabla no es simetrica");
            }
    }
}
