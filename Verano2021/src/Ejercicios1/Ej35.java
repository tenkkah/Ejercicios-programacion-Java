/*.Escribe un programa que diga si un número introducido por teclado es o no capicúa. El
 programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, en caso
 contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya que el
 primero admite números más largos.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        long numero,auxiliar, invertido=0;
        
        System.out.println("Introduce un numero");
        numero=teclado.nextLong();
        auxiliar=numero;
        while(auxiliar>0){
            invertido=invertido*10+auxiliar%10;
            auxiliar=auxiliar/10;
        }
        if(numero==invertido)
            System.out.println("El numero "+numero+" es capicua");
        else
            System.out.println("El numero "+numero+" no es capicua");
    }
}

