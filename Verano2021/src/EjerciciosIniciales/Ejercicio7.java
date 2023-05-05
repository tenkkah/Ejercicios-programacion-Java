/*Realizar un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int a,b,c,D;
        double s1,s2;
        System.out.println("Calculo Ecuacion de 2ºGrado ax2 + bx + c = 0");
        System.out.println("Introduce el valor de a");
        a=teclado.nextInt();
        System.out.println("Introduce el valor de b");
        b=teclado.nextInt();
        System.out.println("Introduce el valor de c");
        c=teclado.nextInt();
        D=b*b-4*a*c; //Math.pow(b,2)
  
            if(D<0)
                 System.out.println("NO TIENE SOLUCION REAL");
            else if(D==0)
                 System.out.println("UNA UNICA SOLUCION X= "+(-b/(2*a)));
            else{
                s1=(-b+Math.sqrt(D))/(2*a);
                s2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("LA ECUACION TIENE 2 SOLUCIONES");
                System.out.print(" X1 = "+s1+" X2= "+s2);
        }
    }
}
