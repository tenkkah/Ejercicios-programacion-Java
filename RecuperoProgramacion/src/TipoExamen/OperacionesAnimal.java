package tipoexamen;

import java.util.ArrayList;

public class OperacionesAnimal {
   private ArrayList<Animal> lista=new ArrayList<Animal>();

   public boolean addPerro(Perro p){
      boolean insertado=true; 
      int i=0;
      while(i<lista.size()){
        if(lista.get(i) instanceof Perro)
          if(lista.get(i).getNombre().equals(p.getNombre()))
            insertado=false; 
        i++;
      }
      if(insertado)
        lista.add(p);
      return insertado; 
   }   
   
   public boolean addGato(Gato g){
      boolean insertado=true; 
      int i=0;
      while(i<lista.size()){
        if(lista.get(i) instanceof Gato)
          if(lista.get(i).getNombre().equals(g.getNombre()))
            insertado=false; 
        i++;
      }
      if(insertado)
        lista.add(g);
      return insertado; 
   }   
   
   public boolean addAvestruz(Avestruz av){
      boolean insertado=true; 
      int i=0;
      while(i<lista.size()){
        if(lista.get(i) instanceof Avestruz)
          if(lista.get(i).getNombre().equals(av.getNombre()))
            insertado=false; 
        i++;
      }
      if(insertado)
        lista.add(av);
      return insertado; 
   } 
   
   public boolean borrarAvestruz(Avestruz av){
      boolean borrado=false; 
      int i=0;
      while(i<lista.size()){
        if(lista.get(i) instanceof Avestruz)
          if(lista.get(i).getNombre().equals(av.getNombre()))
            borrado=true; 
        i++;
      }
      if(borrado)
        lista.remove(av);
      
      return borrado; 
   } 
   public boolean borrarPerro(Perro p){
      boolean borrado=false; 
      int i=0;
      while(i<lista.size()){
        if(lista.get(i) instanceof Perro)
          if(lista.get(i).getNombre().equals(p.getNombre()))
            borrado=true; 
        i++;
      }
      if(borrado)
        lista.remove(p);
      
      return borrado; 
   } 
   
   public boolean borrarGato(int posicion){
      boolean borrado=false; 
      if(lista.get(posicion) instanceof Gato)
         borrado=true; 
      if(borrado)
        lista.remove(posicion);
      
      return borrado; 
   }
   
   public void MostrarInformacion(){
      for(int i=0;i<lista.size();i++) {
        System.out.println(lista.get(i).toString());
        System.out.println(lista.get(i).habloAsi());
        System.out.println(lista.get(i).queAnimalSoy());
      }
   }
   
}
