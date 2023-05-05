
package Hoja1.Ej1;


public class Empleado {
    private String nombre, NIF;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String NIF, int edad, boolean casado, double salario) { //Constructor con parametros
        this.nombre = nombre;
        this.NIF = NIF;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public Empleado(){ //Constructor sin parametros.
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void Clasificacion(){
        if(edad<22)
            System.out.println("Principiante");
        else if(edad<36)
            System.out.println("Intermedio");
        else System.out.println("Senior");
    }
    
    public void SubirSalario(int porcentaje){
        salario=salario+salario*porcentaje/100;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", NIF=" + NIF + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    public String Escribir() {
        return "Empleado{" + "nombre=" + nombre + ", NIF=" + NIF + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    
}
