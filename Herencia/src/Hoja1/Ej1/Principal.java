
package Hoja1.Ej1;

public class Principal {
    public static void main(String[] args) {
        Empleado e=new Empleado("empleado 1","111111D",43,true,1245.76);
        Programador p=new Programador(2000,"Java","programador 1","222222F",27,false,1800);
        
        System.out.println("Empleado "+e.toString());
        System.out.println("Programador "+p.toString());
        System.out.println("---------------------------------");
        
        e.Clasificacion();
        e.SubirSalario(10);
        System.out.println("Empleado "+e.Escribir());
        System.out.println("---------------------------------");
        
        p.Clasificacion();
        p.SubirSalario(15);
        /*System.out.println("Programador "+p.Escribir());*/ //Hemos llamado a la clase padre con el p. refiriendose al hijo.
        System.out.println("Programador "+p.toString());
    }
}

