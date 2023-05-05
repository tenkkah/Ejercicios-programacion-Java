/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.Una empresa informática necesita llevar un registro de todos sus empleados que se encuentran en la oficina central,
 para eso quiere un programa que debe incluir lo siguiente:
 a) Empleado. Atributos: - nombre: tipo cadena
 - NIF: tipo cadena
 - edad : entero
 - casado: boolean
 - salario: real
 Métodos: - Constructor con y sin parámetros de entrada
 - Método que permita mostrar la clasificación según la edad de acuerdo al siguiente algoritmo:
 Si edad es menor o igual a 21, Principiante
 Si edad es >=22 y <=35, Intermedio
 Si edad es >35, Senior.
 - Imprimir los datos del empleado por pantalla (utilizar salto de línea \n para separar los atributos).
 - Un método que permita aumentar el salario en un porcentaje que será pasado como parámetro al
 método.
 b) Programador (Especialización de Empleado). Clase que hereda de Empleado todos los atributos y métodos.
 Atributos: - lineasDeCodigoPorHora : tipo entero
 - lenguajeDominante: tipo cadena
 Metodos: - Constructor con y sin parámetros de entrada.
 */
package EjerciciosHerencia1;


public class Principal {
     public static void main(String[] args) {
    Empleado e=new Empleado("empleado 1","111111D",43,true,1245.76);
    Programador p=new Programador(2000,"Java","programador 1","222222F",27,false,1800);
    
    System.out.println("Empleado "+e.toString());
    System.out.println("Programador "+p.toString());
    System.out.println("---------------------------");
    
    e.Clasificacion();
    e.SubirSalario(10);
    System.out.println("Empleado "+e.Escribir());
    System.out.println("---------------------------");
    
    p.Clasificacion();
    p.SubirSalario(15);
    //System.out.println("Programador "+p.Escribir());
    System.out.println("Programador "+p.toString());
    
    
    
    }   
}
