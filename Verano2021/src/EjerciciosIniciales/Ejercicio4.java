/*Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
 (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horastrabajadas, horasextras = 0, salario;
        
        System.out.println("Introduce horas trabajadas ");
            horastrabajadas = teclado.nextInt();
        if(horastrabajadas < 40){
            horasextras = horastrabajadas - 40;
            horastrabajadas = 40;
        }
        if(horastrabajadas < 40){
            horasextras = horastrabajadas - 40;
            horastrabajadas = 40;
        salario =horastrabajadas * 12 +(horasextras*16);
        System.out.println("El salario a cobrar es "+salario);
    }
}
}