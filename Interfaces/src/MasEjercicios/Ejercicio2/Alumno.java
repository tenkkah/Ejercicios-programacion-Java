
package MasEjercicios.Ejercicio2;


public class Alumno extends Persona implements Hablador {
    private String carrera;
    private int curso;
    
    Alumno(String nombre, int edad, String carrera, int curso){
        super(nombre, edad); //Para enviar los atributos de la clase Padre a la clase Hija
        this.carrera=carrera;
        this.curso=curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" ");
        System.out.println("Nombre: "+getNombre()+" Edad: "+getEdad());
        System.out.println("Carrera: "+this.carrera +" Curso: "+this.curso);
    }
}
