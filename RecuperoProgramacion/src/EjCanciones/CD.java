
package EjCanciones;

import java.util.ArrayList;


public class CD {
    private String titulo;
    private ArrayList <Cancion> lista = new ArrayList<Cancion>();

     public CD() {}

    public CD(String titulo, ArrayList<Cancion> lista) {
        this.titulo = titulo;
        for(int i=0;i<lista.size();i++)
          this.lista.add(lista.get(i));
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }
    
    public int numeroCanciones(){
        return lista.size();
    }

    public String dameCancion(int posicion){
       return lista.get(posicion-1).dameTitulo();
    }
    
    /*public Cancion dameCancion(int posicion){
         return lista.get(posicion-1);
    }*/
    
    public void grabaCancion(int posicion, Cancion c){
        lista.set(posicion-1, c);
    }
  
    public void agrega(Cancion c){
        lista.add(c);
    }
    
    public void elimina(int posicion){
        lista.remove(posicion-1);
    }
    
    public void mostrar(String nombre){
      boolean noexiste=true;
      for(int i=0;i<lista.size();i++)
         if(lista.get(i).dameAutor().equals(nombre)){ 
              noexiste=false;
              System.out.println(lista.get(i).mostrarInformacion());
         }
      if(noexiste)
       System.out.println("No hay canciones de ese autor");
    }
    
    public void mostarCD(){
       for(int i=0;i<lista.size();i++)
        System.out.println(lista.get(i).mostrarInformacion());   
    }
}