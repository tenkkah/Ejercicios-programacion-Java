
package EjCanciones;


public class Cancion {
    private String titulo;
    private String autor;
    private double duracion;

    public Cancion(String titulo, String autor, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public Cancion() {
    }

    public String dameTitulo() {
        return titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public double dameDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    public String mostrarInformacion() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }
    
}


