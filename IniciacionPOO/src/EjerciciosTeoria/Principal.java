package EjerciciosTeoria;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
       
       Fecha f1=new Fecha();
       Fecha f2=new Fecha(25,1,2021);
       Fecha f3=new Fecha(10,4,1996);
       
       /* if(f1.bisiesto())
       System.out.println("El año es bisiesto");
       else
       System.out.println("El año no es bisiesto");
       
       if(f2.bisiesto())
       System.out.println("El año es bisiesto");
       else
       System.out.println("El año no es bisiesto");
       
        System.out.println("El mes de mayo tiene "+f1.diasMes(5)+ " dias");
        System.out.println("El mes de febrero tiene "+f2.diasMes(2)+ " dias");
       
        System.out.println(f2.toString());
        f2.valida();
        System.out.println(f2.toString());*/
       /*f1.corta();
       f2.corta();*/
       
       /*System.out.print("Los dias transcurridos desde ");
       f1.corta();
       System.out.println("desde");
       f2.corta();
       System.out.println("son "+f2.diasTranscurridos()+\n");*/
       
       /* System.out.println("Hoy es "+f2.diaSemana()); */
        
        System.out.print("Los dias transcurridos entre ");
        f2.corta();
        System.out.print(" y ");
        f3.corta();
        System.out.println(" son "+f3.diasEntre(f2));
        
        System.out.println("------------------------------------");
        
        System.out.print("Los dias transcurridos entre ");
        f2.corta();
        System.out.print(" y ");
        f3.corta();
        System.out.println(" son "+f2.diasEntre(f3));
        
        
    }
   
}