/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1Ej1;


public class Alumno extends Persona{
    protected String grupo;
    protected char horario;
    
    //constructor

    public Alumno() {
    }

    public Alumno(String grupo, String apellidos, int anoNacimiento) {
        super();
        this.grupo = grupo;
        this.horario = horario;
    }
    
    public void ponGrupo(String grupo, char horario){
        if(grupo == null || grupo.length() == 0){
            System.out.println("Grupo no valido");
        }else if(horario != 'M' && horario != 'T'){
            System.out.println("Horario no valido");
        }
        this.grupo = grupo;
        this.horario = horario;
    }
    
    public void imprimeGrupo(){
        System.out.println("Grupo " + grupo + horario);
    }
}
