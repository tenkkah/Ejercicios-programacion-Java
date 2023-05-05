
package EjFicheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
  public static void main(String[] args) {
    try{
      File f1=new File("f1.txt"); 
      File f2=new File("f2.txt");  
      File f3=new File("f3.txt");  
        
      FileReader fr1=new FileReader(f1);  
      FileReader fr2=new FileReader(f2); 
      FileWriter fw3=new FileWriter(f3);
      
      int c1,c2;
      c1=fr1.read();
      c2=fr2.read();
      
      while(c1!=-1 && c2!=-1){
        if(c1<c2) {
          fw3.write(c1);
          c1=fr1.read();
        } else if(c1>c2){
           fw3.write(c2);
           c2=fr2.read(); 
        }else{
           fw3.write(c1);
           fw3.write("\r\n");
           fw3.write(c2);
           c1=fr1.read();
           c2=fr2.read();
           
        }
      }
      
      while(c1!=-1){
       fw3.write(c1);
       c1=fr1.read();  
      }
      
      while(c2!=-1){
       fw3.write(c2);
       c2=fr2.read();  
      }
      
      fw3.close();
      fr2.close();
      fr1.close();
      
    }catch(IOException ex){
        System.out.println(ex);
    }
  }
   
}

