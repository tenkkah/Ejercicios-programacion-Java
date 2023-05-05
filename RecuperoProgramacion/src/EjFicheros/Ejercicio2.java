package EjFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
 public static void main(String[] args) {
   try{
     File f=new File("parrafo.txt");  
     File f1=new File("parrafosinvocales.txt");   
     FileReader fr=new FileReader(f);
     FileWriter fw=new FileWriter(f1);
     int caracter= fr.read();
     while(caracter!=-1){
       if(caracter!='a'&&caracter!='e'&&caracter!='i'
               &&caracter!='o'&&caracter!='u') 
         fw.write(caracter);
       caracter= fr.read(); 
     }
     fw.close();
     fr.close();
     
     fr=new FileReader(f1);
     BufferedReader br=new BufferedReader(fr);
     String frase=br.readLine();
     while(frase!=null){
       System.out.println(frase);
       frase=br.readLine();
     }
     
     br.close();
     fr.close();
     
  } catch(IOException ex){
       System.out.println(ex);
   } 
     
     
    }
}
