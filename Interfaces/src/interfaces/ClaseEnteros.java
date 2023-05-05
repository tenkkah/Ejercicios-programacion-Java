
package interfaces;


public class ClaseEnteros extends Numero { //LAS CLASES HEREDAN TODO LO QUE TIENE LA CLASE PADRE
   int num1, num2;
   
   ClaseEnteros(){ //Constructor
       super();
   }
   
   public void Escribir(){
       System.out.println(Suma()+" "+Resta());
       System.out.println(Producto()+" "+Division());
   }
}
