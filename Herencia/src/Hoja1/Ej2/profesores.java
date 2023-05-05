
package Hoja1.Ej2;


public class profesores extends Empleados {
    
     private String departamento;

    public profesores(String departamento,int anioIngreso, int nDespacho, String nombre, String apellido, String nif, String estadoCivil) {
        super(anioIngreso, nDespacho, nombre, apellido, nif, estadoCivil);
        this.departamento = departamento;
    }


    public void setDepartamento(String departamento) { //cambio dpto
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    /*    public void calcularSalario(int salario) {
    if (getAnioIngreso() < 2000) {
    salario = salario * 8 / 100 + salario;
    }
    setSalario(salario);
    }*/
    public double Sueldo(){
        double salario=getSalario();
        if(getAnioIngreso() < 2000){
            salario = salario * 8 / 100 + salario;
        }
        setSalario(salario);
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+ " profesores{" + "departamento=" + departamento + '}';
    }
    
}
