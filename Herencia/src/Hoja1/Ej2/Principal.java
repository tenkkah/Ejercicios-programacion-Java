
package Hoja1.Ej2;


public class Principal {
    
    public static void main(String[] args) {
        Personas p1 = new Personas("Kelvin","Guerrero","x87654321v","soltero");
        profesores profe1 = new profesores("matematicas",1990,5,"Pedro","Gonzalez","123456789K","casado");
        estudiantes e1 = new estudiantes("1ºDAW","Miguel","Mite","x8981402v","soltero");
        Empleados emp1 = new Empleados(2010,10,"Pepe","Rodriguez","123456789L","casado");
        personalServicio ps1 = new personalServicio("Hall",1990,20,"Andres","sanchez","1222222K","casado");
        
        System.out.println("Persona 1");
        System.out.println(p1.toString());
        
        System.out.println("Estudiante 1");
        System.out.println(e1.toString());
        e1.setCurso("2ºDAW");
        System.out.println(e1.toString());
        
        System.out.println("Empleado 1");
        System.out.println(emp1.toString());
        emp1.MostrarSalario();
        emp1.setnDespacho(50);
        System.out.println(emp1.toString());
        
        System.out.println("Profesor");
        System.out.println(profe1.toString());
        profe1.setDepartamento("Informatica");
        System.out.println("El sueldo del profesor es "+profe1.Sueldo());
        System.out.println(profe1.toString());
        
        System.out.println("Personal de servicio");
        System.out.println(ps1.toString());
        ps1.setSeccion("Salon de actos");
        System.out.println("El sueldo del personal de servicio es "+ps1.Sueldo());
        System.out.println(ps1.toString());
        
    }
    
}
