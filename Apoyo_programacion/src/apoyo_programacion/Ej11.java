/*Realiza un programa en Java que realice la correspondencia entre nota y valor. 
Suficiente –>5
Bien –>6
Notable bajo –>7
Notable alto –>8
Sobresaliente –>9
Matrícula de honor –>10
Suspenso –> valores menores de 5
Notaza –> valores superiores a 10
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej11 {
  public static void main(String[] args) {
		
		int nota=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		nota = scanner.nextInt();
		
		switch (nota) {
			case 5:
				System.out.println("Suficiente");
				break; // break evita que se ejecuten los siguientes casos
			case 6:
				System.out.println("Bien");
				break;
			case 7:
				System.out.println("Notable bajo");
				break;
			case 8:
				System.out.println("Notable alto");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula de honor");
				break;
			default:
				if(nota<5) System.out.println("Suspenso");
				else System.out.println("Notaza");
		
		}
	}
}