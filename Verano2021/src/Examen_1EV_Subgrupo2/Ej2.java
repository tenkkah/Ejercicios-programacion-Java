/*Hacer un programa que generé tres números aleatorios comprendidos entre 0 y 1000
y, a continuación, verificar si se ha obtenido dos números pares seguidos de un número
impar. Si no fuera el caso, repetir hasta tener la combinación par, par, impar.
 Mostrar, a continuación, el número de ensayos realizados para obtener dicha combinación.
 */
package Examen_1EV_Subgrupo2;


public class Ej2 {
   public static void main(String[] args) {
   int n1,n2,n3,cont=1;
   
   /*   n1=(int)(Math.random()*1001);
   n2=(int)(Math.random()*1001);
   n3=(int)(Math.random()*1001);
   
   while(n1%2!=0 || n2%2!=0 || n3%2==0){
   System.out.println(n1+" "+n2+" "+n3);
   cont++;
   n1=(int)(Math.random()*1001);
   n2=(int)(Math.random()*1001);
   n3=(int)(Math.random()*1001);
   }
   System.out.println("Se han necesitado "+cont+" intentos");
   System.out.println(n1+" "+n2+" "+n3);*/
   int cont1=0;
   do{
      n1=(int)(Math.random()*1001);
      n2=(int)(Math.random()*1001);
      n3=(int)(Math.random()*1001);
      cont1++;
      System.out.println(n1+" "+n2+" "+n3);
   }while(n1%2!=0 || n2%2!=0 || n3%2==0);
    System.out.println("Se han necesitado "+cont1+" intentos");
   
   
   
   
 } 
}
