/*Realiza el ejercicio 6 con <<switch-case>>
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej7 {
    public static void main(String[] args) {
		Scanner leo = new Scanner(System.in);
		int N;
		System.out.println("Qué día de la semana quieres:");
		N = leo.nextInt();
		switch (N) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Juernes");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número no válido, saliendo...");
			return;// Al no ser un número válido, salimos directamente del programa
		}
	}
}

