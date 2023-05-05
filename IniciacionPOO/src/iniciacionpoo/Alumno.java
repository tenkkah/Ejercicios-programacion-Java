
package iniciacionpoo;

public class Alumno {
   
    //ATRIBUTOS
    
    int Nmat;
    String Nombre;
    String curso;
    double[] nota=new double[3];
    
    //CONSTRUCTORES
    Alumno(int Nmat, String Nombre){
        this.Nmat=Nmat;
        this.Nombre=Nombre;
        this.nota=nota;
    }
    
    Alumno(int Nmat){
        this.Nmat=Nmat;
    }
    
    Alumno(){}
        
    //METODOS
    
    void Matricularse(String curso){
        System.out.println("El alumno "+this.Nmat+" se ha matriculado en "+curso); 
        this.curso=curso;
    }
    
    void PonerNota(double n1, double n2, double n3){
        this.nota[0]=n1;
        this.nota[1]=n2;
        this.nota[2]=n3;
    }
    double CalcularMedia(){
        double media=0;
        for(int i=0;i<nota.length;i++)
            media=media+nota[i];
        media=media/nota.length;
        return media;
    }
   
  /* public String toString(){
      return "Matricula " +Nmat+ " Nombre " +Nombre+ " Curso " +curso+ " Nota "+nota;*/
    
      @Override
      public String toString(){
        return "Alumno{" + "Nmat=" + Nmat + ", Nombre=" + Nombre + ", curso=" +curso+ ", notas=" +nota[0]+" "+nota[1]+" "+nota[2]+" Media "+CalcularMedia()+ '}';     
   }
   
}
