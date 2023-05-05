/*.Escribe un programa que permita partir un número introducido por teclado en dos partes. Las
 posiciones se cuentan de izquierda a derecha. No se permite el uso de funciones de manejo de
 String. El número introducido tiene que tener dos dígitos como mínimo y la posición por la que
 se parte el número está entre 2 y la longitud del número.
 Ejemplo: Introduzca un número entero positivo: 406783
 Introduzca la posición a partir de la cual quiere partir el número: 5
 Los números partidos son el 4067 y el 83. */
package Ejercicios1;

import java.util.Scanner;
public class Ej39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero, auxiliar, posicion;
        
        do{
        System.out.println("Introduzca un numero entero positivo (minimo de dos digitos)");
        numero=teclado.nextInt();
        }while(numero<10);
        
        System.out.println("Introduzca la posicion a partir de la cual quiere partir el número");
        posicion=teclado.nextInt();
    }
}
