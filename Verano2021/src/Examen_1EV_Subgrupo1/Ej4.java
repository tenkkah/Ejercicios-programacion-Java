/*Hacer un programa que lea un número decimal y lo muestre en pantalla en
hexadecimal (base 16). El cambio de base se realiza mediante divisiones sucesivas
por 16 en las que los restos determinan los dígitos hexadecimales según la
correspondencia:
 */
package Examen_1EV_Subgrupo1;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   String cadena="";
   int numero,auxiliar;
   
   System.out.println("Introducir numero");
   numero=teclado.nextInt();
   auxiliar=numero;
   
   while(auxiliar>16){
     cadena=hex[auxiliar%16]+cadena;
       System.out.println(cadena);
     auxiliar=auxiliar/16;
   }
   cadena=hex[auxiliar%16]+cadena;
   System.out.println(numero+" "+cadena);
   
   }
}
