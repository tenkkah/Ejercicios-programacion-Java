
package tipoexamen;

public class TipoExamen {
 public static void main(String[] args) {
     OperacionesAnimales opA=new OperacionesAnimales();
     Perro p=new Perro("Marron","Toby",3);
     if(opA.addPerro(p))
      System.out.println("Perro añadido correctamente");
     else
       System.out.println("Perro ya existe en la lista, no se puede añadir");
     opA.addGato(new Gato("Siames","Garfiel",6));
     opA.addAvestruz(new Avestruz(60,"Maca",4));
     
     if(opA.addPerro(p))
      System.out.println("Perro añadido correctamente");
     else
       System.out.println("Perro ya existe en la lista, no se puede añadir");
     
     opA.MostrarInformacion();
     
      
    }
    
}
