/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
programa pedirá la combinación para abrirla. Si no se acierta, se mostrará el mensaje “Lo
siento, esa no es la combinación” y si se acierta se dirá “La caja fuerte se ha abierto”. Se
tendrán cuatro oportunidades para abrir la caja fuerte */
package Ejercicios1;

import java.util.Scanner;


public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int intentos=4;
        int numeroIntroducido;
        boolean acertado=false;
        do {
      System.out.println("Introduzca la clave de la caja fuerte:");
      numeroIntroducido=teclado.nextInt();
      
      if (numeroIntroducido == 2002) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }   
      intentos--;
        } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Ha agotado las 4 oportunidades.");
    }
   }
}
