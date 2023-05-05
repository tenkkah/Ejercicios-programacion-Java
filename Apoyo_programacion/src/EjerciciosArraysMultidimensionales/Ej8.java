/*Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0
salvo los de los bordes que deben ser 1. Mostrarla.
 */
package EjerciciosArraysMultidimensionales;



public class Ej8 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[8][6];
        
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0;j<matriz.length;j++){
                if(i==0 || i ==4){ //Delimita las columnas y la i controla los 1 de las columnas
                    matriz[i][j] = 1;
                }else if(j == 0 || j==4){ //Controla los 1 de las filas
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("La matriz es ");
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz.length;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
