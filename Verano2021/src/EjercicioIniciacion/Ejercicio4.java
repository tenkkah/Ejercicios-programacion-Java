
package EjercicioIniciacion;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kilometros;
        double litros, resultado;
        System.out.print("Kilómetros recorridos: ");
            kilometros = teclado.nextInt();
        System.out.print("Litros de combustible gastados: ");
            litros = teclado.nextDouble();
        resultado = kilometros / litros;
        System.out.println("El consumo por kilómetro es de "+resultado);
    }
}
