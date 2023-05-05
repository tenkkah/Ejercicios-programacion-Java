/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosHerenciaEj2;

/**
 *
 * @author Aitor
 */
public class PersonalServicios extends Empleado{
    private String seccion;

  public PersonalServicios(String seccion, int anioIngreso, int despacho, String nombre, String apellidos, String NIF, String estadocivil) {
        super(anioIngreso, despacho, nombre, apellidos, NIF, estadocivil);
        this.seccion = seccion;
    }

    public void TrasladoSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+" PersonalServicios{" + "seccion=" + seccion + '}';
    }

    public double Sueldo(){
        double salario=getSalariobase();
        if(getEstadocivil().equalsIgnoreCase("casado"))
          salario=salario*1.05; 
        setSalariobase(salario);
        return salario;
    }
}
