/*Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo
y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se 
incluye en el cómputo.
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int num, cont=0,contimp=0,suma=0,mayor=-1;
        
        System.out.println("Introduce numero");
        num=teclado.nextInt();
        
        while(num>=0){
            cont++;
            
            if(num%2!=0){ //Si el num es distinto de 0 se le suma el numero
                contimp++;
                suma=suma+num;
            }else{
                if(mayor==0) //Pero si el mayor es 0 mayor es igual al numero
                    mayor=num;
                else if(num>mayor)
                    mayor=num;
            }
            System.out.println("Introduce numero");
            num=teclado.nextInt();
        }
        System.out.println("Se han introducido "+cont+" numeros");
        if(mayor==-1)
        System.out.println("No has introducido ningun numero par");
        else
        System.out.println("El mayor numero par introducido es el "+mayor);
        if(contimp==0)
            System.out.println("No se han introducido numeros pares asi que no hay media");
        else
            System.out.println("La media de los impares es "+(suma/contimp));
            }
}
