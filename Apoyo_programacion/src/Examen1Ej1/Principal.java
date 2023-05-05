/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Ej1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) {
        try{
         File f=new File("llamadas.txt");
         FileReader fr=new FileReader(f);
         BufferedReader br=new BufferedReader(fr);
         String llamada;
         String[] valores;
         Centralita c=new Centralita();
         Llamada ll;
         Local l;
         Provincial p;
                  
         llamada=br.readLine();
         int coste=0;
         while(llamada!=null){
           valores=llamada.split(",");
           if(valores[3].equals("0")){
             l=new Local(valores[0],valores[1],Integer.parseInt(valores[2]));  
             coste=(int) l.Coste();
             System.out.println(l.toString());
             System.out.println("Coste "+l.Coste());
           }else{
             p=new Provincial(valores[0],valores[1],Integer.parseInt(valores[2]),valores[3]);
             coste=p.Coste();
             System.out.println(p.toString());
             System.out.println("Coste "+p.Coste());
           }
           c.RegistrarLlamada(coste);
           llamada=br.readLine();  
         }
          
         br.close();
         fr.close();
         
         System.out.println(c.toString());
         System.out.println(c.getLlamadastotales()+" "+c.getCosteTotal());
           
       } catch(IOException e){
           System.out.println(e);
       }
    }
    
}
