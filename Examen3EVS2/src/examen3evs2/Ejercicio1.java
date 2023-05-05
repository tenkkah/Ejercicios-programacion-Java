
package examen3evs2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio1 {
    public static void main(String[] args) {

        try {
            //FICHERO INICIAL
            File f=new File("asegurados.dat");
            FileInputStream fis=new FileInputStream(f);
            DataInputStream dis=new DataInputStream(fis); //Escribir
            //FICHERO PARA COPIAR
            File f2=new File("asegurados2.dat");
            FileOutputStream fos=new FileOutputStream(f2);
            DataOutputStream dos=new DataOutputStream(fos); //Leer
            //VARIABLES PARA GUARDAR DATOS DEL FICHERO
            String poliza;
            int npartes;
            double precio;
            int totalbajas=0;
            
            System.out.println("--- ASEGURADOS.DAT SIN ACTUALIZAR ---");
            
            try{
                
                while (true){ //Leer el fichero de binario a nuestro lenguaje
                    poliza=dis.readUTF();
                    npartes=dis.readInt();
                    precio=dis.readDouble();
                    
                    
                    System.out.println("POLIZA: "+poliza+" PARTES: "+npartes+" PRECIO: "+precio);
                    
                    
                    if (npartes<5){
                        precio=precio*0.95;
                    }else
                         if (npartes<=7){
                         }else
                            if (npartes<=10){
                                precio=precio*1.10;
                                 }else
                                    if (npartes>10){
                                        totalbajas++;
                                    }
                    
                    if  (npartes<=10){
                        dos.writeUTF(poliza);
                        dos.writeInt(npartes);
                        dos.writeDouble(precio);
                    }
                    
                }
                
            }catch (EOFException ex){
            }
            
            System.out.println("--- ASEGURADOS.DAT ACTUALIZADO ---");
            
            //fuera del bucle
            dos.close();
            fos.close();
            
            dis.close();
            fis.close();
            
            f.delete();
            f2.renameTo(f);
            
            FileInputStream fis2=new FileInputStream(f);
            DataInputStream dis2=new DataInputStream(fis2);
            
            
            try{
                while(true){
                    
                    System.out.println("POLIZA: "+dis2.readUTF()+" PARTES: "+dis2.readInt()+" PRECIO: "+dis2.readDouble());
                    
                }
                
            }catch (EOFException ex){
            }
            
           dis2.close();
           fis2.close();
            
            
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
                 
        