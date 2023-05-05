
package Hoja1.Ej1;


public class Programador extends Empleado{
    private int lineasDeCodigoPorHora; //ATRIBUTOS
    private String lenguajeDominante; //ATRIBUTOS

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String NIF, int edad, boolean casado, double salario){ 
        super(nombre, NIF, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public Programador(){
        super();
    
    }

    @Override //El super.toString significa que te estas refirirendo al tostring de la entidad padre
    public String toString() {
        return super.toString()+"Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante + '}';
    }
    
    
}
