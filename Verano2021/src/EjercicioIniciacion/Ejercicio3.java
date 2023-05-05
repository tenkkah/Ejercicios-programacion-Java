/* Escribe un programa que solicite al usuario dos números y los almacene en
dos variables. En otra variable, almacená el resultado de la suma de esos dos
números y luego mostrá ese resultado en pantalla.
A continuación, el programa debe solicitar al usuario que ingrese un tercer
número, el cual se debe almacenar en una nueva variable. Por último, mostrá
en pantalla el resultado de la multiplicación de este nuevo número por el
resultado de la suma anterior.
 */
package EjercicioIniciacion;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
        
        int num1, num2, resultado, num3, auxiliar = 0;
        System.out.print("Ingresa un numero ");
            num1 = teclado.nextInt();
        System.out.print("Ingresa otro numero ");
            num2 = teclado.nextInt();
        resultado = num1 + num2;
        System.out.println("Suman "+resultado);
        
        System.out.println("Ingresa un tercer numero ");
        num3 = teclado.nextInt();
        auxiliar = resultado * num3;
        System.out.println("Multiplicación de la suma por el último número "+auxiliar);
    }
}
