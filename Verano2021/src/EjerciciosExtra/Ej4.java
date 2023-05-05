/*Hacer un programa que lea un número entero N y calcule el resultado de la siguiente
 serie : 1+1/2+1/3+1/4+1/5+...+1/N.
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        float resultado = 0;
        
        while(true){
            
       
                
        System.out.println("Ingresa un numero entero positivo");
        n = teclado.nextInt();
        
        if (n > 0){
            for(int i = 1; i<=n; i++){
                resultado = resultado + (1/(float)i);
                
            }
                System.out.println("El resultado es "+resultado);
        }
        
        else{
                System.out.println("El numero ingresado no es correcto. Intentelo nuevamente");
        }
         }
    }
}
