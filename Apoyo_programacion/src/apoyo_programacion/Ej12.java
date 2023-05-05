/*Realiza el ejercicio 11 con <<else if>>
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej12 {
    public static void main(String[] args) {
		
		float nota;//No hace falta asignar valor a una variable que vamos a
					//leer antes de utilizarla
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		nota = scanner.nextFloat();
		
		while(nota<0||nota>10) {
			System.out.println("La nota no es válida, introduce otra:");
			nota=scanner.nextFloat();
		}
		
		if(nota<5)
			System.out.println("Suspenso");
		else if(nota>=5 && nota<6)
			System.out.println("Aprobado");
		else if(nota>=6 && nota<7)
			System.out.println("Bien");
		else if(nota>=7 && nota<8)
			System.out.println("Notable bajo");
		else if(nota>=8 && nota<9)
			System.out.println("Notable alto");
		else if(nota>=9 && nota<10)
			System.out.println("Sobresaliente");
		else System.out.println("Matrícula de honor");
	}
}
