/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArrayList.Hoja3Ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Principal {
    public static void main(String[] args){
	   Scanner teclado=new Scanner(System.in);
	   String nombre;
	   int edad;
	   char sexo;
	   double altura;
	   Persona p;
	   ArrayList<Persona> lista=new ArrayList<Persona>();
	   p=new Persona();
	   System.out.println("Introducir Nombre");
	   nombre=teclado.nextLine();
	   System.out.println("Introducir edad");
	   edad=teclado.nextInt();
	   System.out.println("Introducir sexo");
	   sexo=(char)(teclado.next().charAt(0));
	   System.out.println("Introducir altura");
	   altura=teclado.nextDouble();
	   p.setNombre(nombre);
	   p.setEdad(edad);
	   p.setSexo(sexo);
	   p.setAlt(altura);
	   lista.add(p);
	   teclado.nextLine();
	   System.out.println("Introducir Nombre");
	   nombre=teclado.nextLine();
	   System.out.println("Introducir edad");
	   edad=teclado.nextInt();
	   System.out.println("Introducir sexo");
	   sexo=(char)(teclado.next().charAt(0));
	   p=new Persona(nombre,edad,sexo);
	   lista.add(p);
	   teclado.nextLine();
	   System.out.println("Introducir Nombre");
	   nombre=teclado.nextLine();
	   System.out.println("Introducir edad");
	   edad=teclado.nextInt();
	   System.out.println("Introducir sexo");
	   sexo=(char)(teclado.next().charAt(0));
	   System.out.println("Introducir altura");
	   altura=teclado.nextDouble();
	   p=new Persona(nombre,edad,sexo,altura);
		for(int i=0;i<lista.size();i++){  
			if(lista.get(i).esMayorDeEdad())
				System.out.println("La perona "+(i+1)+" Es mayor de edad");
			System.out.println(lista.get(i).Escribir());
		}
	   }
}
