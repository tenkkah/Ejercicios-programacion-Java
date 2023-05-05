/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        int num;
        System.out.println("Escribe un numero del 1 al 7 del dia de la semana ");
        num = teclado.nextInt();
        
        switch(num){
            case 1: dia = "Lunes";
                break;
            case 2: dia = "Martes";
                break;
            case 3: dia = "Miercoles";
                break;
            case 4: dia = "Jueves";
                break;
            case 5: dia = "Viernes";
                break;
            case 6: dia = "Sabado";
                break;
            case 7: dia = "Domingo";
                break;
            default: dia = "Debe introducir un numero del 1 al 7";       
        }
        System.out.println(dia);
    }
}
