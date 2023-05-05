/*Realiza un programa en Java al que le introduzcas 10 números por teclado. Cuente el número de números positivos
introducidos por teclado,cuente el número de números negativos introducidos por teclado y realice la suma de todos ellos.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej14 {
  public static void main(String[] args) {
	int cuenta=0;
	int suma=0;
	int positivos=0;
	int negativos=0;
	int A=0;
	
	Scanner reader = new Scanner(System.in);//Para pedir números por teclado
	
 
	do {
		System.out.println("Escribe un número: ");
		A=reader.nextInt();
		cuenta++; //cuenta=cuenta+1
		if(A>=0) positivos++; //positivos=positivos+1
		else negativos--;
		suma=suma+A;
 
	}while(cuenta <10);
	System.out.println("La suma es: "+suma);
	System.out.println("El número de positivos es: "+positivos);
	System.out.println("El número de negativos es: "+negativos);
        }
}