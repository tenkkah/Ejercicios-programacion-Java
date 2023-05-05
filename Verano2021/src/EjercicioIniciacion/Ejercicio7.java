/*Escribe un programa que solicite al usuario un número y le reste el 15%,
almacenando todo en una única variable. A continuación, mostrar el resultado
final en pantalla.*/
package EjercicioIniciacion;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1,resultado;
        System.out.println("Ingresá un número: ");
        num1 = teclado.nextDouble();
        resultado = num1 * 0.85;
        System.out.println("Descontando el 15% queda: "+resultado);
    }
}
