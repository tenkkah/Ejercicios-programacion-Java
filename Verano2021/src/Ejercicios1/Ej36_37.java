/*Realiza un conversor del sistema decimal al sistema de “palotes”. El 0 se representa con un – y
 la separación entre números también con un –
 Ejemplo: Introduzca un número entero positivo: 47021
 El 47021 en el sistema de palotes es
 | | | | - | | | | | | | - - | | - |
37.Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
 número. Usar long en lugar de int ya que el primero admite números más largos.
 Ejemplo: Introduzca un número entero positivo: 406783
 El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej36_37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        long numero,invertido=0,auxiliar;
        int contpares=0,contimpares=0;
        System.out.println("Introducir numero");
        numero=teclado.nextLong();
        auxiliar=numero; 
        
        //Se le va a dar la vuelta al numero
        while(auxiliar>0){ 
            invertido=invertido*10+auxiliar%10;
            auxiliar=auxiliar/10;
        }
        System.out.println("El numero "+numero+" en sistema decimal de palotes es");
        
        
        while(invertido>0){
            auxiliar=invertido%10; //Coger los restos 
            if(auxiliar==0)
                System.out.print(" - ");
            else
                for(int i=1;i<=auxiliar;i++)
                    System.out.print("|");
                 System.out.print(" - ");
                 if(auxiliar%2==0) 
                     contpares++;
                 else
                     contimpares++;
                 invertido=invertido/10; 
        }
        System.out.println("\nEl numero "+numero+" tiene "+contpares+" digitos pares y "+contimpares+" digitos impares");
        }
    
    }
 

