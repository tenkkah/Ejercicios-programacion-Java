/*Realiza un programa en Java que lea un número por teclado y muestre a qué día de la semana corresponde.
Si el número leído es 1 visualizará Lunes, si es 2 visualizará Martes, si es 3 visualizará Miércoles, y así sucesivamente …
Para cualquier otro valor visualizará No válido.
Realiza el programa con <<if>>
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej6 {
   public static void main(String[] args) {
 
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int N = 0;
 
		System.out.println("Introduce un Número: ");
		N = reader.nextInt();
 
		if (N == 1)
			System.out.println("Hoy es Lunes");
		else if (N == 2)
			System.out.println("Hoy es Martes");
		else if (N == 3)
			System.out.println("Hoy es Miércoles");
		else if (N == 4)
			System.out.println("Hoy es Jueves");
		else if (N == 5)
			System.out.println("Hoy es Viernes");
		else if (N == 6)
			System.out.println("Hoy es Sábado");
		else if (N == 7)
			System.out.println("Hoy es Domingo");
		else
			System.out.println("Número no válido");
	}
}
