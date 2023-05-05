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
public class Profesor extends Empleado{
   private String departamento; 

    public Profesor(String departamento, int anioIngreso, int despacho, String nombre, String apellidos, String NIF, String estadocivil) {
        super(anioIngreso, despacho, nombre, apellidos, NIF, estadocivil);
        this.departamento = departamento;
    }

    public void CambioDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "departamento=" + departamento + '}';
    }
   
   public double Sueldo(){
       double salario=getSalariobase();
       if(getAnioIngreso()<2000)
         salario=salario*1.08;
       setSalariobase(salario);
       return salario;
   }
}
