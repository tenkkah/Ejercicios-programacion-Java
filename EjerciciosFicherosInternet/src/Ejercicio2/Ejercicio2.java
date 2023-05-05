/*(Crea una aplicación donde pidamos la ruta de un fichero por teclado y un texto que queramos a escribir en el fichero. Deberás mostrar por pantalla el mismo texto pero variando entre 
mayúsculas y minúsculas, es decir, si escribo “Bienvenido” deberá devolver “bIENVENIDO”. 
Si se escribe cualquier otro carácter, se quedara tal y como se escribió.
Deberás crear un método para escribir en el fichero el texto introducido y otro para mostrar el contenido en mayúsculas.
 */
package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            File f = new File("prueba2");
            FileWriter fw = new FileWriter(f);
            
            String texto;
            
            System.out.println("Introduce el texto a escribir en el fichero");
            texto = teclado.nextLine();
            //Escribimos el texto en el fichero
            fw.write(texto);
            
            
            FileReader fr = new FileReader(f);
                int valor = fr.read();
                
                while(valor != -1){
                    char caracter = (char)valor;
                    if(caracter >= 97 && caracter <= 90){
                        caracter -=32;
                    }else if(caracter >=65 && caracter <=90){
                        caracter +=32;
                    }
                    System.out.println(caracter);
                    valor = fr.read();
                }
            
           
            
            
            
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
