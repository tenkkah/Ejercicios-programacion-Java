/*Escribe un programa en Java que pida un nombre de usuario y una contraseña por teclado. Si se introduce “pepe” como usuario y “1234”  como contraseña, 
indicar “Has entrado al sistema”, sino "Entrada fallida". El programa vuelve a preguntar por las credenciales si el usuario ha fallado, hasta que acierta.
Como mucho tiene un máximo de 3 intentos.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int intento, contra = 1234, veces = 0;
       String usuario = "Aitor";
       
       do{
           System.out.println("Introduce el usuario");
           usuario = teclado.nextLine();
           System.out.println("Introduce la contrasena");
           intento = teclado.nextInt();
           
           if(intento == contra){
               System.out.println("Acceso permitido");
               veces = 3;
           } else {
               System.out.println("Contra incorrecta");
               veces = veces + 1;
               if(veces == 3){
                   System.out.println("Acceso restringido");
                   System.out.println("Acceso bloqueado");
               }
           }  
       }while(veces < 3);
    }
}