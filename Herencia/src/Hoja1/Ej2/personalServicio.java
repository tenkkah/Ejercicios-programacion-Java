
package Hoja1.Ej2;


public class personalServicio extends Empleados {
    
     private String seccion;

    public personalServicio(String seccion, int anioIngreso, int nDespacho, String nombre, String apellido, String nif, String estadoCivil) {
        super(anioIngreso, nDespacho, nombre, apellido, nif, estadoCivil);
        this.seccion = seccion;
    }
 
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) { //cambio de seccion per.sevicio
        this.seccion = seccion;
    }

    /*    public void calcularSalario(int salario) {
    if (getEstadoCivil().equalsIgnoreCase("casado")) {
    salario = salario * 5 / 100 + salario;
    }
    
    }*/
    
    public double Sueldo(){
        double salario=getSalario();
        if(getEstadoCivil().equalsIgnoreCase("casado"))
            salario = salario*1.05;
        setSalario(salario);
        return salario;
        
    }

    @Override
    public String toString() {
        return super.toString() +" personalServicio{" + "seccion=" + seccion + '}';
    }
    
    
}

