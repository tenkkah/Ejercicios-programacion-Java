/*Realiza un programa en Java que pida 10 números por teclado, haga la suma de esos 10 números pasados por teclado, 
cuente los números positivos y cuente los números negativos. Usa <<do-while>>
 */
package apoyo_programacion;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
		int cuenta = 0;
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		int A = 0;
 
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
 
		do {
			System.out.println("Escribe un número: ");
			A = reader.nextInt();
			cuenta++; // cuenta=cuenta+1
			if (A >= 0)
				positivos++; // positivos=positivos+1
			else
				negativos--;
			suma = suma + A;
 
		} while (cuenta < 10);
		System.out.println("La suma es: " + suma);
		System.out.println("El número de positivos es: " + positivos);
		System.out.println("El número de negativos es: " + negativos);
	}
}
