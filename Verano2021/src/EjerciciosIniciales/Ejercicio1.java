/*Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese
 día
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        
        System.out.println("Introduce el dia de la semana");
        dia = teclado.next();
        
        switch(dia){
            case "Lunes":
            case "1":
            case "Miercoles":
            case "Viernes":System.out.println("Programacion");
                break;
            case "Martes":System.out.println("Marcas");
                break;
            case "Jueves":System.out.println("Base de datos");
                break;
            case "Sabado":
            case "Domingo":System.out.println("Fin de semana");
                break;
            default:System.out.println("Dia erroneo");
                break;
        }
        
        //CON DIA NUMERICO
        
        int diasem;
        do{
            System.out.println("Introduce el dia de la semana");
            diasem = teclado.nextInt();
        }while(diasem<1 || diasem>7);
        
        switch(diasem){
            case 1:
            case 3:
            case 5:System.out.println("Programacion");
                    break;    
            case 2:System.out.println("Marcas");
                    break; 
             case 4:System.out.println("Bases de datos");
                    break; 
            case 6:
            case 7:System.out.println("Fin de semana");
                    break;      
            
        }
    }
}
