/*Realiza el ejercicio 8 con <<for>>
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej9 {
   public static void main(String[] args) {
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		int A = 0;
 
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
 
		for(int i=0;i<10;i++) {
			System.out.println("Escribe un número: ");
			A = reader.nextInt();
			if (A >= 0)
				positivos++; // positivos=positivos+1
			else
				negativos--;
			suma = suma + A;
 
		} 
		System.out.println("La suma es: " + suma);
		System.out.println("El número de positivos es: " + positivos);
		System.out.println("El número de negativos es: " + negativos);
	}
 
}