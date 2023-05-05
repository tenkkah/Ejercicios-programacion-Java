
package POO2;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Productos antes de aplicarse el IVA");
        Productos pr = new Productos();
        Productos pr2 = new Productos(1, "Este producto es una manzana", 2.34);
        Productos pr3 = new Productos(2, "Este producto es una pera", 3.45);
        
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());
        System.out.println("------------------------------------------------------");  
        
         System.out.println("Productos despues de aplicarse el IVA");
          
        pr2.getDescripcion();
        pr3.getPrecio();
        
        pr2.PrecioVenta();
        pr3.PrecioVenta();
        
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());
        
    }
}
