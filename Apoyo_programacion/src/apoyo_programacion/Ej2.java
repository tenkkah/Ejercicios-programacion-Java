/*Programa que lea dos números pasados por teclado y muestre el mayor en pantalla. 
Si son iguales deberá mostrar un mensaje indicándolo.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int num1, num2;
         System.out.println("Introduce un numero");
            num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
            num2 = teclado.nextInt();
        if(num1 > num2){
            System.out.println("El numero mas mayor es " + num1);           
        }else if(num1 == num2){
            System.out.println("Los dos numeros son iguales");
        }else{
            System.out.println("El numero 2 es mas mayor");
        }
         
    }
    
}
