/*Realizar un programa con <<for>> que muestre los caracteres ASCII de 0 a 255
 */
package apoyo_programacion;


public class Ej10 {
     public static void main(String[] args)
       {
           for(int i =0; i<256; i++)
           {
               System.out.println( i + ". " + (char)i);
           }
       }
}