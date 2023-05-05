/*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe
 pedir al usuario la anchura y la altura. Hay que comprobar que tanto la anchura como la altura
 sean mayores o iguales que 2, en caso contrario se debe mostrar un mensaje de error.
 Ejemplo: Introduzca la anchura del rectángulo (como mínimo 2): 6
 Introduzca la altura (como mínimo 2): 4
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej41 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        
         System.out.println("Introduce base del rectangulo(>2)");
         base=teclado.nextInt();
         System.out.println("Introduce altura del rectangulo(>2)");
         altura=teclado.nextInt();
         if(base>2 && altura>2){
             
         }
             
         else{
                 System.out.println("Eroor, alguno de los datos es menor que 2");
             }
         for(int i=1;i<=base;i++) //Este for pinta el techo del rectangulo
         System.out.print("* ");         
         System.out.println();
         for(int i=1;i<=altura-2;i++){
             System.out.print("* "); //Donde se pone print es para hacer la base del rectangulo con los astericos seguidos
             for(int j=1;j<=base-2;j++)
                 System.out.print("  "); //Se hace el salto de linea para hacer la altura
             System.out.println("*");
    }
         
         for(int i=1;i<=base;i++)
             System.out.print("* ");
         
         System.out.println();
  }
}
