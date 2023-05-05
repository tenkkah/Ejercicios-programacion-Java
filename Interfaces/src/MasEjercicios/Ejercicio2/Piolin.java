package MasEjercicios.Ejercicio2;


public class Piolin extends Canario implements Hablador {
    private int npeliculas;

    public Piolin(int npeliculas, boolean canta, String sexo, int edad) {
        super(canta, sexo, edad);
        this.npeliculas = npeliculas;
    } 

    @Override
    public void hablar() {
      System.out.println("Hola, soy un "+getClass().getSimpleName()+" ");
        System.out.println("Sexo: "+getSexo()+" Edad: "+getEdad());
        System.out.println("Canta: "+this.isCanta() +" Peliculas: "+this.npeliculas);
    }
    
    
}
