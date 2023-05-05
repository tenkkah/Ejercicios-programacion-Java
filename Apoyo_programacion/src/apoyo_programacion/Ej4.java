/*Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma. Realizar el programa con <<do-while>>
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int contador=0;
        int suma=0;
	int numero = 0;
		do {
                    System.out.println("Introduce el número: ");
                    numero = teclado.nextInt();
                    contador=contador+1;
                    suma=suma+numero;
		}while(contador<10);
		System.out.println("La suma es: "+suma);
    }
}
