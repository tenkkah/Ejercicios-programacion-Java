
package Hoja1.Ej2;


public class estudiantes extends Personas {
    
     private String curso;

    public estudiantes(String curso, String nombre, String apellido, String nif, String estadoCivil) {
        super(nombre, apellido, nif, estadoCivil);
        this.curso = curso;
    }


    public void setCurso(String curso) { //Matricular nuevo curso
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return super.toString()+"estudiantes{" + "curso=" + curso + '}';
    }
    
    

}
