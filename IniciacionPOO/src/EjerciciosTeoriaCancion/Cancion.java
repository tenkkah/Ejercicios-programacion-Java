
package EjerciciosTeoriaCancion;

public class Cancion {
    String titulo;
    String autor;
    
    
    //Constructores que inicaliza las variables de clase.
    Cancion() {
        this.titulo="";
        this.autor=""; //Cadenas vacias, el this indica que hace referencia a los atributos de las clases.
    }
    
    Cancion(String titulo, String autor){
        this.titulo=titulo; //Como se llaman igual hay que poner por obligacion el this.
        this.autor=autor;
    }
    
    String dameTitulo(){
        return this.titulo=""; //El return es porque hay que devolver el titulo de la cancion.
    }
    
    String dameAutor(){
        return this.autor=""; //Como hay que devolver algo de tipo string sera un string 
    }
    
    void ponTitulo(String titulo){
        this.titulo=titulo;
        
    }
    void ponAutor(String autor){
        this.autor=autor;
    }
    
    void Escribir(){
        System.out.println("Autor: "+this.autor+" Titulo: "+this.titulo);
        //System.out.println("Autor "+dameAutor()+" Titulo "+dameTitulo());
    }
}
