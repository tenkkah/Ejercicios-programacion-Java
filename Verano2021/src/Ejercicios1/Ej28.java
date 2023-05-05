/*.Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej28 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        //Si el factorial se inicializa con 0 cualquier numero que multiplique sera 0
        int numero,factorial=1; 
        
        System.out.println("Introducir numero del factorial a calcular");
        numero=teclado.nextInt();
        for(int i=1;i<=numero;i++)
            factorial=factorial*i;
        
        System.out.println("El factorial de "+numero+" es "+factorial);
    }
    
}

