package tipoexamen;

public class Gato extends Mamiferos {
   private String raza;

    public Gato(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

   
    public String toString() {
        return " Gato{" + "raza=" + raza + '}';
    }


    public String queAnimalSoy() {
        return "Soy un animal";
    }

   
    public String habloAsi() {
        return "Miau Miau";
    }
   
   
}
