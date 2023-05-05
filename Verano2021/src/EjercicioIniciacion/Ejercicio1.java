/*
 Escribe un programa que solicite al usuario que ingrese su nombre. El nombre
se debe almacenar en una variable llamada nombre. A continuación se debe
mostrar en pantalla el texto “Ahora estás en la matrix, [usuario]”, donde
“[usuario]” se reemplazará por el nombre que el usuario haya ingresado.
 */
    package EjercicioIniciacion;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args){
    Scanner teclado=new Scanner(System.in); //Definicion del objeto con el que voy a leer del teclado 
    String nombre;  
    System.out.println("Introduce tu nombre");
    nombre=teclado.nextLine();
    System.out.println("Ahora estás en la matrix "+nombre);
  } 
}
