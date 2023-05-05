/*Realiza un programa en Java que lea dos números pasados por teclado en un proceso repetitivo. 
Este proceso terminará cuando los números leídos sean iguales.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
		do {
                    System.out.println("Introduce el número 1:");
                    numero1 = teclado.nextInt();
                    System.out.println("Introduce el número 2:");
                    numero2 = teclado.nextInt();
                    }while(numero1!=numero2);
		System.out.println("Has terminado, los números son iguales");
	}
}