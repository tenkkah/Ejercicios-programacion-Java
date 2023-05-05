
package repasobbddyficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class RepasoFicheroBinario {
  public static void main(String[] args) {
    File f=new File("almacen.dat");
    File f1=new File("articulos.dat");
    int tam=ValorMax(f);
    int[] alm=new int[tam];
    CargarArray(f,alm);
    System.out.println("FICHERO ANTES DE ACTUALIZARSE");
    MostrarFichero(f1);
    ActualizarFichero(f1,alm);  
    System.out.println("FICHERO DESPUES DE ACTUALIZARSE");
    MostrarFichero(f1);
    System.out.println("INFORME FINAL");
    InformeFinal(f1); 
  }
  
  static int ValorMax(File f){
     int cod=0,uni; 
    try{
      FileInputStream fis=new FileInputStream(f);
      DataInputStream dis=new DataInputStream(fis);
      try{
        while(true){
          cod=dis.readInt();
          uni=dis.readInt();
        }
      }catch(EOFException ex){}
      dis.close();
      fis.close();
   }catch(IOException ex){
      System.out.println(ex);
   }
     return cod;
  }
  
  static void CargarArray(File f, int[] al){
    int cod,uni; 
    try{
      FileInputStream fis=new FileInputStream(f);
      DataInputStream dis=new DataInputStream(fis);
      try{
        while(true){
          cod=dis.readInt();
          uni=dis.readInt();
          al[cod-1]=uni;
        }
      }catch(EOFException ex){}
      dis.close();
      fis.close();
   }catch(IOException ex){
      System.out.println(ex);
   }
  }
  
  static void ActualizarFichero(File f1,int[] alm){
    Scanner teclado=new Scanner(System.in);
    int cod,uni,i=0; 
    String nom;
    double precio;
    try{
      File f=new File("auxiliar.dat");
      FileOutputStream fos=new FileOutputStream(f);
      DataOutputStream dos=new DataOutputStream(fos);
      FileInputStream fis=new FileInputStream(f1);
      DataInputStream dis=new DataInputStream(fis);
      try{
        cod=dis.readInt();
        nom=dis.readUTF();
        uni=dis.readInt();
        precio=dis.readDouble();  
        while(true){
         if(cod-1>i){
           if(alm[i]>0){
               /*System.out.println("Introducir nombre articulo");
               nom=teclado.next();
               System.out.println("Introducir precio articulo");
               precio=teclado.nextDouble();*/
            dos.writeInt(i+1);
            dos.writeUTF("articulo"+(i+1));
            dos.writeInt(alm[i]);
            dos.writeDouble(150.25);
          } 
           i++;
          }else if(cod-1<i){
            dos.writeInt(cod);
            dos.writeUTF(nom);
            dos.writeInt(uni);
            dos.writeDouble(precio); 
            cod=dis.readInt();
            nom=dis.readUTF();
            uni=dis.readInt();
            precio=dis.readDouble();
         }else{
            uni=uni+alm[i];
            if(uni>=0){
              dos.writeInt(cod);
              dos.writeUTF(nom);
              dos.writeInt(uni);
              dos.writeDouble(precio);
            }
            i++;
            cod=dis.readInt();
            nom=dis.readUTF();
            uni=dis.readInt();
            precio=dis.readDouble();
         }
       }
      }catch(EOFException ex){}
      
      for(int j=i;j<alm.length;j++){
         if(alm[j]>0){
             /*System.out.println("Introducir nombre articulo");
             nom=teclado.next();
             System.out.println("Introducir precio articulo");
             precio=teclado.nextDouble();*/
            dos.writeInt(j+1);
            dos.writeUTF("articulo"+(j+1));
            dos.writeInt(alm[j]);
            dos.writeDouble(150.25); 
       }
      }
      dis.close();
      fis.close();
      dos.close();
      fos.close();
      f1.delete();
      f.renameTo(f1);
   }catch(IOException ex){
      System.out.println(ex);
   }  
  }
  static void MostrarFichero(File f){
    int cod,uni; 
    String nom;
    double precio;
    try{
      FileInputStream fis=new FileInputStream(f);
      DataInputStream dis=new DataInputStream(fis);
      try{
        while(true){
          cod=dis.readInt();
          nom=dis.readUTF();
          uni=dis.readInt();
          precio=dis.readDouble();
          System.out.println(cod+" "+nom+" "+uni+" "+precio);
        }
     }catch(EOFException ex){}
      dis.close();
      fis.close();
    }catch(IOException ex){
      System.out.println(ex);
   }    
  }
  
  static void InformeFinal(File f){
    int cod,uni; 
    String nom;
    double precio;
    try{
      FileInputStream fis=new FileInputStream(f);
      DataInputStream dis=new DataInputStream(fis);
      try{
        while(true){
          cod=dis.readInt();
          nom=dis.readUTF();
          uni=dis.readInt();
          precio=dis.readDouble();
          System.out.println("Hay "+uni+" unidades del producto "+cod+" lo que equivale a "+precio*uni+" euros");
        }
     }catch(EOFException ex){}
      dis.close();
      fis.close();
    }catch(IOException ex){
      System.out.println(ex);
   }    
  }
}
