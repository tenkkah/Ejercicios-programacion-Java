
package Hoja1.Ej2;


public class Empleados extends Personas {
    
    private double salario=1000;
    private int anioIngreso, nDespacho;

    public Empleados(int anioIngreso, int nDespacho, String nombre, String apellido, String nif, String estadoCivil) {
        super(nombre, apellido, nif, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.nDespacho = nDespacho;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getnDespacho() { //devolvemos el numero de despacho
        return nDespacho;
    }

    public void setnDespacho(int nDespacho) { //cambiamos el numero despacho
        this.nDespacho = nDespacho;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
    
    public void MostrarSalario(){
        System.out.println(getNombre()+ " "+getApellido()+ " "+salario);
    }

    @Override
    public String toString() {
        return super.toString()+" Empleados{" + "salario=" + salario + ", anioIngreso=" + anioIngreso + ", nDespacho=" 
                + nDespacho + '}';
    }
       
    
    
}


