/*Hacer un programa para jugar a adivinar un número entre 1 y 100. El ordenador deberá
generar aleatoriamente el número. El jugador introducirá un número y el juego le ira
dando pistas de si el número introducido está por encima o por debajo. El juego termina
cuando se adivina el número o se decide terminar de jugar tecleando un número
negativo.

 */
package Examen_1EV_Subgrupo2;

import java.util.Scanner;


public class Ej1 {
   public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in); 
  int nadivinar,num;
  nadivinar=(int)(Math.random()*100)+1;
     
  System.out.println("Introducir nº a adivinar(para acabar pulsar nº negativo)");   
  num=teclado.nextInt();
  while(num!=nadivinar && num>=0){
    if(num<nadivinar)
     System.out.println("El numero es mayor");
    else
     System.out.println("El numero es menor");
    System.out.println("Introducir nº a adivinar(para acabar pulsar nº negativo)");   
    num=teclado.nextInt();
  }
  if(num==nadivinar)
    System.out.println("Enhorabuena, has acertado el numero");
  else
    System.out.println("Lo siento has perdido. El numero era "+nadivinar);
     
    } 
}
