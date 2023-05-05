/*Hacer un programa que calcule el dígito verificador de un ISBN.
 Para calcular el dígito verificador, se deben realizar los siguientes pasos:
1. Pedir por teclado el número, que deberá tener entre 6 y 9 dígitos.
2. Invertir el número. (e.g: de 201012341 a 143210102).
3. Se multiplican los dígitos por la secuencia 2, 3, 4, 5, 6, 7, si es que se acaban los
números, se debe comenzar de nuevo. Por ejemplo, con 143210102:
1×2+4×3+3×4+2×5+1×6+0×7+1×2+0×3+2×4=52
4. Al resultado obtenido, es decir, 52, debemos sacarle el módulo 11, es decir:
52 % 11 = 8
5. Con el resultado obtenido en el paso anterior, debemos restarlo de 11:
11 − 8 = 3
6. Finalmente, el dígito verificador será el obtenido en la resta: 201012341-3.
 */
package Examen_1EV_Subgrupo2;

import java.util.Scanner;

public class Ej3 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int n,cont,suma=0,auxiliar,dig;
      
      do{
       System.out.println("Introducir nº de entre 6 y 9 digitos");
       n=teclado.nextInt();
      }while(n<100000 || n>999999999);
      
      auxiliar=n;
      
      cont=2;
      
      while(auxiliar>0){
        suma=suma+auxiliar%10*cont;
        auxiliar=auxiliar/10;
        cont++;
        if(cont==8)
          cont=2;
      }
      dig=suma%11;
      dig=11-dig;
      System.out.println("El ISBN con el digito verificador queda "
              + n+"-"+dig);
      
    } 
}
