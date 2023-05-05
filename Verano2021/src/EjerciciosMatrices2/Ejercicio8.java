/*Se dispone de tres matrices. Una contiene los nombres de pila de un grupo de N personas. La segunda
 matriz contiene los primeros apellidos y la tercera los segundos apellidos. Crear una nueva matriz que
 contenga, para cada persona, el nombre y después los apellidos.*/
package EjerciciosMatrices2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String[] nombre=new String[4];
       String[] apellido1=new String[4]; 
       String[] apellido2=new String[4];
       String[][] lista=new String[4][3];
       
       for(int i=0;i<nombre.length;i++){
         System.out.println("Introduce nombre de la persona "+(i+1)); 
         nombre[i]=teclado.nextLine();
         System.out.println("Introduce apellido 1 de la persona "+(i+1)); 
         apellido1[i]=teclado.nextLine();
         System.out.println("Introduce apellido 2 de la persona "+(i+1)); 
         apellido2[i]=teclado.nextLine();
       }
       
       for(int i=0;i<lista.length;i++){
         int j=0;
         lista[i][j]=nombre[i];
         lista[i][j+1]=apellido1[i];
         lista[i][j+2]=apellido2[i];
           
       }
       
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.printf("%10s ",lista[i][j]);  
            }
            System.out.println();
        }
       
       
       
    }
  
}

