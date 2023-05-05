/*Realiza un programa en Java que lea dos números procedentes de teclado y muestre el menor de ellos.
Si los dos números son iguales, debe mostrar un mensaje indicándolo.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej13 {
 public static void main(String[] args) {
	
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo número:");
		num2 = scanner.nextInt();
		
		if(num1 < num2) System.out.println(num1 + " es menor");
		else if(num1 > num2) System.out.println(num2 + " es menor");
		else System.out.println("Son iguales");
		
		scanner.close();
 
	}
}
