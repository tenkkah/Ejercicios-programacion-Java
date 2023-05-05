
package EjercicioArrayList.Hoja2Ej2;


public class Coche {
     private String Matricula,Marca,Modelo;
   private double Km;
   
   Coche(String Matricula,String Marca,String Modelo,double Km){
	   this.Matricula=Matricula;
	   this.Marca=Marca;
	   this.Modelo=Modelo;
	   this.Km=Km;
   }
   String getMatricula(){
	   return Matricula;
   }
   String getMarca(){
	   return Marca;
   }
      String getModelo(){
	   return Modelo;
   }
   double getKm(){
   	   return Km;
   }  
   void Escribir(){
	   System.out.println("Matricula "+getMatricula()+" Marca: "+getMarca()+" Modelo: "+getModelo()+" Km: "+getKm());
   }
}
