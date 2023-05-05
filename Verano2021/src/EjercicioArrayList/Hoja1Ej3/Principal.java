/*Hacer una clase para trabajar con triángulos isósceles (2 lados iguales). Dicha clase tendrá como atributos la base y
 la altura que serán privados. También tendrá como mínimo un constructor y dos métodos para calcular el área y el
 perímetro de un triángulo, y todos aquellos métodos que sean necesarios para el buen funcionamiento del programa.
 Crear una clase Principal que cree un ArrayList de triángulos que realice las siguientes operaciones:
a) Añadir un triángulo.
b) Calcular e imprimir el triángulo con el área más grande.
c) Calcular e imprimir el triángulo con el perímetro más pequeño.
d) Imprimir la altura, la base, el área y el perímetro de un triángulo en concreto.
e) Imprimir la altura, la base, el área y el perímetro de todos los triangulo.
 */
package EjercicioArrayList.Hoja1Ej3;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
      Scanner teclado=new Scanner(System.in);
      int b,h,opc;
      Triangulo t;
      ArrayList<Triangulo> lista=new ArrayList<Triangulo>();
      System.out.println("1.Añadir triangulo\n2.Triangulo con area mas grande\n3.Triangulo con perimetro mas pequeño");
      System.out.println("4.Informacion de un triangulo\n5.Informacion de todos los triangulos\n6.Salir\n");
      System.out.println("Escoger una opcion ");
      opc=teclado.nextInt();
      while(opc!=6){
    	switch(opc){
    	   case 1: System.out.println("Introducir Base ");
	               b=teclado.nextInt();
	               System.out.println("Introducir Altura ");
	               h=teclado.nextInt();
	               t=new Triangulo(b,h);
	               lista.add(t);
                   break;
    	   case 2: if(lista.size()==0)
    		          System.out.println("No es realizar esta operacion pues no hay ningun triangulo");
    	           else{
    	        	   double max=lista.get(0).Area();
    	               int mayor=0;
    	               for(int i=0;i<lista.size();i++){
    	        	     if(lista.get(i).Area()>max){
    	        		     max=lista.get(i).Area();
    	        		     mayor=i;
    	        	     }
    	              }
    	              System.out.println("El triangulo con el mayor area es el "+(mayor+1)+"\n Sus datos son\n   Base "+ lista.get(mayor).getBase()+"\n   Altura "+lista.get(mayor).getAltura());
	                 System.out.println("   Area "+lista.get(mayor).Area()+"\n   Perimetro "+lista.get(mayor).Perimetro());
    	           }
	                 break;
    	   case 3: if(lista.size()==0)
		               System.out.println("No es realizar esta operacion pues no hay ningun triangulo");
                   else{
    		         double min=lista.get(0).Perimetro();
                     int menor=0;
                     for(int i=0;i<lista.size();i++){
        	           if(lista.get(i).Perimetro()<min){
        		           min=lista.get(i).Perimetro();
        		           menor=i;
        	            }
                     }
                     System.out.println("El triangulo con el menor perimetro es el "+(menor+1)+"\n Sus datos son\n   Base "+ lista.get(menor).getBase()+"\n   Altura "+lista.get(menor).getAltura());
                     System.out.println("   Area "+lista.get(menor).Area()+"\n   Perimetro "+lista.get(menor).Perimetro());
                   }
                   break;
    	   case 4: int n;
    		       do{
    		          System.out.println("Introducir triangulo a mostrar ");
                      n=teclado.nextInt();
    	           }while(n<0 || n>lista.size());
    	           System.out.println("TRIANGULO "+n+"\n   Base "+ lista.get(n-1).getBase()+"\n   Altura "+lista.get(n-1).getAltura());
                   System.out.println("   Area "+lista.get(n-1).Area()+"\n   Perimetro "+lista.get(n-1).Perimetro());
    		       break;
    	   case 5: for(int i=0;i<lista.size();i++){
    		         System.out.println("TRIANGULO "+(i+1)+"\n   Base "+ lista.get(i).getBase()+"\n   Altura "+lista.get(i).getAltura());
	                 System.out.println("   Area "+lista.get(i).Area()+"\n   Perimetro "+lista.get(i).Perimetro());
                    }
    	         break;
    	   default: System.out.println("OPCION INCORRECTA");
                    break;
     }
      System.out.println("1.Añadir triangulo\n2.Triangulo con area mas grande\n3.Triangulo con perimetro mas pequeño");
      System.out.println("4.Informacion de un triangulo\n5.Informacion de todos los triangulos\n6.Salir\n");
      System.out.println("Escoger una opcion ");
      opc=teclado.nextInt();
    }
  }
}
