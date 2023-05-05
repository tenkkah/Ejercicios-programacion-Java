/*Escribe un programa en Java que pida un nombre de usuario y una contraseña por teclado. Si se introduce “pepe” como usuario y “1234”  como contraseña, 
indicar “Has entrado al sistema”, sino "Entrada fallida". El programa vuelve a preguntar por las credenciales si el usuario ha fallado, hasta que acierta. */
package apoyo_programacion;

import java.util.Scanner;


public class Practica2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre, contra;
        
        do{
        System.out.println("Introduce el nombre del usuario");
        nombre = teclado.nextLine();
        System.out.println("Introduce la clave de acceso");
        contra = teclado.nextLine();
        }while(!nombre.equals("Pepe") || !contra.equals("1234"));
        
            System.out.println("Has entrado al sistema");
        
        
    }
}
