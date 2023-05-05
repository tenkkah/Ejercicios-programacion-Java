/*. Hacer un programa en Java para jugar contra el ordenador a adivinar un número, generado
aleatoriamente, entre 1 y 200.
 El usuario debe introducir un número por teclado y el programa le dirá mediante los símbolos
 '<' o '>', si el número introducido es menor o mayor que el generado por el ordenador.
 Finalmente, se mostrara un mensaje informando de cuantos intentos se han necesitado para
 adivinar el número y si no se adivina se mostrará un mensaje diciendo que ha perdido.
 El número máximo de intentos se pedirá por teclado.
 Explicación: Para generar el número aleatorio poner:
 int numAleatorio = (int) (Math.random()*200+1);
 */
package EjerciciosSuplementarios;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		boolean acertado = false;
		int intentos = 5;
		short num, x;		
		x  = (short) (100*Math.random()+1);	
		// Declarar punto de entrada	
		do {
			System.out.println("Te quedan "+intentos+" intentos");
			System.out.print("Introduce el numero a adivinar: ");
			
			num = teclado.nextShort();
			
			intentos--;
			
			if(num == x) {
				acertado = true;
			} else if(x > num ){
				System.out.println("El numero a adivinar es mayor.");
			} else {
				System.out.println("El numero a adivinar es menor.");
			}
		} while(intentos > 0 && !acertado);
		
		if(acertado)
			System.out.println("Enhorabuena! Has acertado!");
		else
			System.out.println("Lo siento, no has acertado. El número era: " + x);

	}
}
