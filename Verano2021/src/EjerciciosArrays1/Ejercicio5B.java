
package EjerciciosArrays1;

import java.util.Scanner;
public class Ejercicio5B {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);  
      int numero,cont=0,auxiliar;
      
      System.out.println("Introducir numero");
      numero=teclado.nextInt();
      auxiliar=numero;
      
      while(auxiliar>0){
          auxiliar=auxiliar/10;
          cont++;
      }
      int[] num=new int[cont];
      auxiliar=numero;
      cont=0;
      while(auxiliar>0){
        num[cont]=auxiliar%10;  
        auxiliar=auxiliar/10;
        cont++;
      }
      
      for(int i=0;i<num.length;i++)    
        System.out.print(num[i]+" ");
      
      System.out.println();
        
      cont=0;
      
      while(cont<num.length/2 && num[cont]==num[num.length-1-cont])
        cont++;
        
      if(cont==num.length/2)  
        System.out.println("El numero "+numero+" es capicua");
      else
        System.out.println("El numero "+numero+" no es capicua");  
    }
   
}

