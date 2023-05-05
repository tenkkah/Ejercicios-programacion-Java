/*Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla 
sin espacios. Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
 */
package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio1 {
    public static void main(String[] args) {
        
        try{
            File f = new File("prueba.txt");
            FileReader fr = new FileReader(f);
            
            int valor = fr.read();
            while(valor != -1){
                //Si el caracter es un espacio no lo escribe
               if(valor != 32){
                   System.out.print((char)valor);
               } 
                 valor = fr.read();
            }
            
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
}
