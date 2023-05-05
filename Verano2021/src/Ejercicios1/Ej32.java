/*.Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos
pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar
de int donde sea necesario para admitir números largos.
 Ejemplo: Por favor, introduzca un número entero positivo: 94026782
 Dígitos pares: 4 0 2 6 8 2
 Suma de los dígitos pares: 22
 Ejemplo: Por favor, introduzca un número entero positivo: 31779
 Dígitos pares:
 Suma de los dígitos pares: 0
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej32 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
         System.out.print("Introduce un número: ");
    long numUs = teclado.nextLong();
    System.out.print("Los dígitos pares son: ");
    
    // Lo pone al revés
    int div = 10;
    long numBasura = numUs;
    long reves = 0;
    int numDig = 0;
    while (numBasura > 0){
      reves = ((reves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Calcula los pares y la suma y los muestra
    long dig;
    long suma = 0;
    for (int i = 0; i < numDig ; i++){
      dig = reves%10;
      if (dig%2 == 0){
        System.out.print(dig+" ");
        suma += dig;
      }
      reves /= 10;
    }
    System.out.println("La suma de los dígitos pares es: "+suma);
    }
}
