
package examen3evs1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;


public class Ejercicio {
    public static void main(String[] args) {
        try{
            File f =new File("futbol.bin");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            try{
                String op,cod;
                int g,p,e;
                
                
                while(true){
                    op=dis.readUTF();
                    cod=dis.readUTF();
                    g=dis.readInt();
                    p=dis.readInt();
                    e=dis.readInt();
                    System.out.println(op+" "+cod+" "+g+" "+p+" "+e);
                }
            }catch(EOFException ex){}
               
            dis.close();
            fis.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
