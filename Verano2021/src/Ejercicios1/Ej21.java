/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package Ejercicios1;

public class Ej21 {
    public static void main(String[] args) {
        
    int i, numero;
        System.out.println("Los numeros primos comprendidos entre 2 y 100 son: ");
    for (numero=2; numero<=100;numero++) {
      i=2;
      while(i<numero && numero%i!=0)
        i++;
      if(i==numero)
        System.out.print(numero+" ");
      }  
    }  
  }
