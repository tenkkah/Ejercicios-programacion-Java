/*Se tiene la clase Coche, cuyos atributos son Matricula, Marca, Modelo y
 Kilómetros, todos ellos privados.
 Crear un ArrayList con 5 objetos de la clase Coche y mediante un menú
 mostrar por pantalla lo siguiente:

– Todos los coches introducidos.
– Todos los coches de una marca determinada.
– Todos los coches con menos de un número determinado de Kilómetros.
– El coche con mayor número de Kilómetros.
– Todos los coches ordenados por número de kilómetros de menor a mayor.
 */
package EjercicioArrayList.Hoja2Ej2;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
     public static void main(String[] args){
	   Scanner teclado=new Scanner(System.in);
	   String mat,mod,mar;
	   double km;
	   int op;
	   Coche c;
	   ArrayList<Coche> lista=new ArrayList<Coche>();
	   for(int i=1;i<=5;i++){
		   System.out.println("Introducir Matricula");
		   mat=teclado.next();
		   System.out.println("Introducir Marca");
		   mar=teclado.next();
		   System.out.println("Introducir Modelo");
		   mod=teclado.next();
		   System.out.println("Introducir Kilometros");
		   km=teclado.nextDouble();
	       c=new Coche(mat,mar,mod,km);
	       lista.add(c);
	   }
	   System.out.println("1.Mostrar todos los coches\n2.Mostrar todos los coches de una marca");
	   System.out.println("3.Mostrar los coches con menos de un nº de Km\n4.Mostrar el coches con más Km");
	   System.out.println("5.Mostrar todos los coches ordenados por Km\n6.Salir");
	   op=teclado.nextInt();
	   while(op!=6){
		   switch(op){
		   case 1: MostrarTodos(lista);
			       break;
		   case 2: System.out.println("Introducir Marca");
		           mar=teclado.next();
		           for(int i=0;i<lista.size();i++)
				       if(lista.get(i).getMarca().compareTo(mar)==0)
				    	   lista.get(i).Escribir(); 
			       break;
		   case 3: System.out.println("Introducir Kilometros");
		           km=teclado.nextDouble();
		           for(int i=0;i<lista.size();i++)
				       if(lista.get(i).getKm()<km)
				    	   lista.get(i).Escribir(); 
		           break;
		   case 4: double mayor=lista.get(0).getKm();
		           int pos=0;
		           for(int i=1;i<lista.size();i++)
				       if(mayor<lista.get(i).getKm()){
				    	   mayor=lista.get(i).getKm();
				    	   pos=i;
				       }
				   lista.get(pos).Escribir(); 
			       break;
		   case 5: for(int i=0;i<lista.size()-1;i++)
			         for(int j=0;j<lista.size()-1-i;j++)
			        	 if(lista.get(j).getKm()>lista.get(j+1).getKm()){
			        		 c=lista.get(j);
			        		 lista.set(j,lista.get(j+1));
			        		 lista.set(j+1,c);
			        	 }
			        MostrarTodos(lista);
			        break;
		   default:System.out.println("Opcion Incorrecta");
		           break;
			   
		   }
		   System.out.println("1.Mostrar todos los coches\n2.Mostrar todos los coches de una marca");
		   System.out.println("3.Mostrar el coche con menos de un nº de Km\n4.Mostrar el coches con más Km");
		   System.out.println("5.Mostrar todos los coches ordenados por Km\n6.Salir");
		   op=teclado.nextInt();  
	   }
   }
   static void MostrarTodos(ArrayList<Coche> l){
	   for(int i=0;i<l.size();i++)
	         l.get(i).Escribir();
   }
}
