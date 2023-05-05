/*5.Realiza un programa que pida primero un número y a continuación un dígito.
26.El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que
ocupa ese dígito en el número introducido.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej25 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
               
        int numero,digito,auxiliar,invertido = 0;
        
        System.out.println("Introduzca un número entero");
         numero = teclado.nextInt();
         auxiliar=numero;
         
         do{
        System.out.println("Introduzca un dígito");
         digito = teclado.nextInt();
         }while(digito<0 || digito>9);
         
         while(auxiliar>0){
             invertido=invertido*10+auxiliar%10; //El numero dado la vuelta
             auxiliar=auxiliar/10;
         }
         
         int i=1;
         while(invertido>0){
             if(invertido%10==digito)
                 System.out.println("El digito "+digito+" se encuentra en la posicion "+i);
                 invertido=invertido/10;
                 i++;
         }
    }
 
}

