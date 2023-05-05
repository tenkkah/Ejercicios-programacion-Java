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
public class Estudiante extends Persona{
    private String curso;  

    public Estudiante(String curso, String nombre, String apellidos, String NIF, String estadocivil) {
        super(nombre, apellidos, NIF, estadocivil);
        this.curso = curso;
    }

    public void MatricularCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+" Estudiante{" + "curso=" + curso + '}';
    }
}
