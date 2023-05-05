/*8 Escribe un programa que solicite al usuario el ingreso de dos palabras, las
cuales se guardarán en dos variables distintas. A continuación, almacená en
una variable la concatenación de la primera palabra, más un espacio, más la
segunda palabra. Mostrá este resultado en pantalla.
 */
package EjercicioIniciacion;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.println("Escribe la primera palabra ");
        palabra1 = teclado.next();
        System.out.println("Escribe la segunda palabra ");
        palabra2 = teclado.next();
        System.out.println(palabra1 + palabra2);
    }
}
