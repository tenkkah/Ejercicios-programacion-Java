/*.Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero, auxiliar, invertido=0;
        
        System.out.println("Introduzca un número entero");
         numero = teclado.nextInt();
         auxiliar=numero;
        
            while(auxiliar>0){
             invertido=invertido*10+auxiliar%10; //El numero dado la vuelta
             auxiliar=auxiliar/10;    
        }
            System.out.println("El numero introducido dado la vuelta es "+invertido);
    }
}
