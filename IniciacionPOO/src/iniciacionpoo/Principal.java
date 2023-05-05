
package iniciacionpoo;

public class Principal {
    public static void main(String[] args) {
      //  Scanner teclado=new Scanner(System.in);  
      
        Alumno al=new Alumno();
        Alumno al1=new Alumno(10);
        Alumno al2=new Alumno(20,"alumno2");
        al=new Alumno(30,"Alumno3");
        
        System.out.println(al.Nmat+" "+al.Nombre+" "+al.nota);
        System.out.println(al1.Nmat+" "+al1.Nombre+" "+al1.curso);
        System.out.println(al2.Nmat+" "+al2.Nombre+" "+al2.curso);
        
        al1.Matricularse("Java");
        al2.Matricularse("Base de Datos");
        
        al1.Nombre="Alumno1";
        
        System.out.println(al1.Nmat+" "+al1.Nombre+" "+al1.curso);
        System.out.println(al2.Nmat+" "+al2.Nombre+" "+al2.curso);
        
        /*   System.out.println("----------------------------------");
        System.out.println(al1.toString());
        System.out.println(al2.toString());*/
        
        al1.PonerNota(5, 7, 9);
        al2.PonerNota(8, 4, 7);
        
        System.out.println("----------------------------------");
        
        double media=al1.CalcularMedia();
        System.out.println("La media de "+al1.Nombre+" es "+media);
        
        System.out.println("La media de "+al2.Nombre+" es "+al2.CalcularMedia());
       
        System.out.println(al1.toString());
        System.out.println(al2.toString());
        
    }
 
}
