/*Hacer un programa que cree un array de 10 posiciones de números aleatorios entre 1 y 100. Posteriormente
 se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición.
 Math.random() → Devuelve un numero entre 0.0 y 1.0
 Math.floor(Math.random()*6) → Devuelve un numero entre 0 y 5
 */
package EjerciciosArrays1;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros=new int[10];
        int posicion;
        for(int i=0;i<numeros.length;i++)
          numeros[i]=(int)(Math.random()*100)+1;
        
        do{
         System.out.println("Introducir posicion entre 1 y 10");
         posicion=teclado.nextInt();
        }while(posicion<1 || posicion>10);
        
        
        for(int i=0;i<numeros.length;i++)
            System.out.print(numeros[i]+" ");
        
        System.out.println("\nEl valor de la posicion "+posicion
                          +" es "+numeros[posicion-1]);
    }
}
