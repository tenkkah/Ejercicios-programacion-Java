
package teoriaficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio1Teoria {
    public static void main(String[] args) {
        try{
            int[] contador=new int[5];
            File f=new File("texto.txt");
            FileReader fr=new FileReader(f);
            int caracter=fr.read();
            while(caracter!=-1){
                switch((char)caracter){
                    case 'a':contador[0]++;
                        break;
                    case 'e':contador[1]++;
                        break;
                    case 'i':contador[2]++;
                        break;
                    case 'o':contador[3]++;
                        break;
                    case 'u':contador[4]++;
                        break;
                        
                }
                caracter=fr.read();
            }
            
            fr.close();
            
            for(int i=0;i<contador.length;i++){
                System.out.println(contador[i]);
            }
            
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
