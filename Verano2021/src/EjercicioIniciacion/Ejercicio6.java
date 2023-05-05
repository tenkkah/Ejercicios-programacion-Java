/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioIniciacion;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, resultado;
        System.out.println("Primer número:");
        num1 = teclado.nextDouble();
        System.out.println("Segundo número:");
        num2 = teclado.nextDouble();
        System.out.println("Tercer número:");
        num3 = teclado.nextDouble();
        resultado = (num1+num2+num3)/3;
        System.out.println("El promedio de los 3 es "+resultado);
    }
}
