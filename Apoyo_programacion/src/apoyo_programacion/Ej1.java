//Realiza un programa en Java que lea dos números pasados por teclado y muestre la suma por pantalla.
package apoyo_programacion;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2;
        int suma;
        System.out.println("Introduce un numero");
            num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
            num2 = teclado.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros introducidos es " + suma);
    }
}
