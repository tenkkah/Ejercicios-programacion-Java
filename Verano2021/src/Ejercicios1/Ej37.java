/*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impareshay dentro de
un número. Usar long en lugar de int ya que elprimero admite números más largos.
Ejemplo:Introduzca un número entero positivo: 406783El 406783 contiene 4 dígitos pares y
2 dígitos impares.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej37 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        System.out.print("Introduce un número: ");
    int numUs = teclado.nextInt();
    // Cuenta los números y calcula el reves
    int numBasura = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    int cifra = 0;
    // Separa las cifras y escribe los palitos
    for (int i = 0; i < numDig; i++){
      cifra = numReves%10;
      numReves /= 10;
      for (int j = 0; j < cifra; j++){
        System.out.print("|");
      }
      if (i < numDig-1){
        System.out.print("-");
      }
    }
    }
}
