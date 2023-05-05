/*Realiza un programam que calcule las horas transcurridas entre dos horas de dos dias de la semana.
No se tendránen cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un numero (del 1 al 7) o como una cadena  (de "lunes" a "domingo"). 
Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
Ejemplo: Introduzca la primera hora.
Día:lunes
Hora:18h
Por favor, introduzca la segunda hora
Día:Martes
Hora:20h
Entre las 18:00 del lunes y las 20:00 del martes hay 26 hora/s.
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej30 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String dia1, dia2;
        int d1=0,d2=0,h1,h2,totalhoras;
        
        do{
            System.out.println("Introduce primer dia");
            dia1=teclado.next();
            System.out.println("Introduce hora del primer dia");
            h1=teclado.nextInt();
            switch(dia1){
                case "Lunes:":
                        case"1":d1=1;
                            break;
                case "Martes:":
                        case"2":d1=2;
                            break;           
                case "Miercoles:":
                        case"3":d1=3;
                            break;            
                case "Jueves:":
                        case"4":d1=4;
                            break;            
                case "Viernes:":
                        case"5":d1=5;
                            break;            
                case "Sabado:":
                        case"6":d1=6;
                            break;            
                case "Domingo:":
                        case"7":d1=7;
                            break;                                                          
            }
            System.out.println("Introduce segundo dia");
            dia2=teclado.next();
            System.out.println("Introduce hora del segundo dia");
            h2=teclado.nextInt();
            switch(dia2){
                case "Lunes:":
                        case"1":d2=1;
                            break;
                case "Martes:":
                        case"2":d2=2;
                            break;           
                case "Miercoles:":
                        case"3":d2=3;
                            break;            
                case "Jueves:":
                        case"4":d2=4;
                            break;            
                case "Viernes:":
                        case"5":d2=5;
                            break;            
                case "Sabado:":
                        case"6":d2=6;
                            break;            
                case "Domingo:":
                        case"7":d2=7;
                            break;                                                          
            }
        }while(d1>d2);
         System.out.println(d1+" "+h1+" "+d2+" "+h2);
         
         totalhoras=(d2-d1)*24+(24-h1)+h2;
         
         
         System.out.println("Entre las "+h1+":00h del dia "+dia1+" y"
                 + " las "+h2+":00 del dia "+dia2+" han pasado "+totalhoras);
       
    }  
}