/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosHerencia1;

/**
 *
 * @author Aitor
 */
public class Programador {
     private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String NIF, int edad, boolean casado, double salario) {
        
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() {
       super();
    }

    @Override
    public String toString() {
        return super.toString()+" Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante + '}';
    }

    void Clasificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void SubirSalario(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
