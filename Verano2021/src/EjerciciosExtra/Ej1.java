/*La secuencia de Collatz de un número entero se construye de la siguiente forma:
 si el número es par, se lo divide por dos;
 si es impar, se le multiplica tres y se le suma uno;
 la sucesión termina al llegar a uno.
 La conjetura de Collatz afirma que, al partir desde cualquier número, la secuencia siempre
 llegará a 1. A pesar de ser una afirmación a simple vista muy simple, no se ha podido
 demostrar si es cierta o no. Usando computadores, se ha verificado que la sucesión
 efectivamente llega a 1 partiendo desde cualquier número natural menor que 258
.
a) Hacer un programa que muestre la secuencia de Collatz de un número entero, que se
 pedirá por teclado.
 Ej:n: 18
 18 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 n: 19
 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
b) Hacer un programa que grafique los largos de las secuencias de Collatz de los números
enteros positivos menores que el ingresado por el usuario:
n: 16
1 *
2 **
3 ********
4 ***
5 ******
6 *********
7 *****************
8 ****
9 ********************
10 *******
11 ***************
12 **********
13 **********
14 ******************
15 ******************
16 *****
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[]args){
   
    Scanner teclado = new Scanner(System.in);
    /*  int numero;
    System.out.print("Ingresa un numero: ");
    numero = teclado.nextInt();
    
    while(numero != 1){
    if(numero % 2 == 0){
    System.out.print(numero + ",");
    numero = numero / 2;
    }//fin if
    else{
    System.out.print(numero + ",");
    numero = (numero * 3) + 1;
    }//fin else
    if(numero == 1){
    System.out.println("1");
    }//fin if
    }//fin while
    } */  
    
    int n,j;
        
        System.out.println("Introduce numero de filas");
        n=teclado.nextInt();
        
        for(int i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(j+" * ");
            
            System.out.println();
        }
    }
}
