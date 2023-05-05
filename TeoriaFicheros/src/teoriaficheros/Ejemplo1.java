package teoriaficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       try{
        File f=new File("texto.txt");
        char letra;
        FileWriter fw=new FileWriter(f,true);
           System.out.println("Introduce un caracter, * para acabar");
           letra= teclado.next().charAt(0);
           while(letra!='*'){
               fw.write(letra);
               fw.write("/r/n");
               System.out.println("Introduce un caracter, * para acabar");
               letra=teclado.next().charAt(0);
           }
        fw.close();
        
        FileReader fr=new FileReader(f);
        int caracter=fr.read();
        while(caracter!=-1){
            System.out.println("Codigo Ascii "+caracter+" Caracter "+(char)caracter);
            caracter=fr.read();
        }
        
        fr.close();
        
       }catch(IOException ex){
           System.out.println(ex);
       }
        
    }
 
}
