/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArrayList.Hoja3Ej1;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
		 Scanner teclado=new Scanner(System.in);
		 int lon;
		 Password p;
		 ArrayList<Password> lista=new ArrayList<Password>();
		 System.out.println("Introducir longitud contraseña, 0 para acabar");
		 lon=teclado.nextInt();
		 while(lon!=0){
			 p=new Password(lon);  
			 lista.add(p);
			 System.out.println("Introducir longitud contraseña, 0 para acabar");
			 lon=teclado.nextInt();
		   }
		 boolean[] b=new boolean[lista.size()];
		 
		 for(int i=0;i<lista.size();i++)
			 b[i]=lista.get(i).esFuerte();
		 String c;
		 for(int i=0;i<lista.size();i++){
			 c="NO FUERTE";
			 if (b[i]) 
		       c="FUERTE";
		    System.out.println("Password: "+lista.get(i).getPw()+" "+c);
	     }
	}
}
