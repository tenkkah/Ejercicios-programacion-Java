/*Escribir una clase principal que realice las sieuientes acciones:
a)Crear 3 artculos uno die cadiaipo.
b)Introducirlos en un arraylist.
c)Mostrar el valor diel IIA para cadia uno die los artculos ass como su preciototal
 */
package Ejercicio2_POO_y_Herencia;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Articulo t4=new Tipo4("articulo4",100);
        Articulo t7=new Tipo7("articulo7",300);
        Articulo t16=new Tipo16("articulo16",500);
        
        ArrayList<Articulo> lista=new ArrayList<Articulo>();
        
        lista.add(t4);
        lista.add(t7);
        lista.add(t16);
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNombre()
                    +" "+lista.get(i).getPrecio());
            if(lista.get(i) instanceof Tipo4) //El instanceof es un operador que dice si el objeto que pone delante es un objeto de la clase que viene a continuacion
                System.out.println("Parte Iva "+
                 ((Tipo4)lista.get(i)).getParteIVA());
            else if(lista.get(i) instanceof Tipo7) //Si el lista get i es una clase de tipo7 lo hace y sino pasaria al siguiente
                System.out.println("Parte Iva "+
                 ((Tipo7)lista.get(i)).getParteIVA());
            else if(lista.get(i) instanceof Tipo16)
                System.out.println("Parte Iva "+
                 ((Tipo16)lista.get(i)).getParteIVA());
              
        }
    }
}
