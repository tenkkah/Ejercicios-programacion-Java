/*Haz una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer) y altura. No se accederá directamente a
ellos.
Por defecto, todos los atributos menos el DNI serán valores según su tipo (0 números, cadena vacía para
String, etc.). Sexo será hombre por defecto.
Se implementaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
Los métodos que se implementaran son:
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H.
ecribir(): devuelve toda la información del objeto.
generaLetra(): Genera a partir de este su DNI su letra correspondiente. Este método será invocado cuando se
construya el objeto.
Métodos set de cada atributo, excepto de DNI.
Métodos get de cada atributo que se pueda visualizar.
Hacer una clase principal que haga lo siguiente:
Pedir por teclado los datos correspondientes a cada persona.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el
segundo objeto obtendrá todos los anteriores menos la altura y el último por defecto, para este último utiliza
los métodos set para darle a los atributos un valor. Se guardaran todos los objetos en un arraylist.
Indicar para cada objeto si es mayor de edad y por último, mostrar la información de cada objeto.
 */
package EjercicioArrayList.Hoja3Ej2;


public class Persona {
     String nombre="",dni;
   int edad=0;
   char sexo='H';
   double alt=0.0;
   Persona(){
	   nombre="";
	   alt=0.0;
	   edad=0;
	   dni=generarDni();
   }
   Persona(String nombre,int edad,char sexo){
	   this.nombre=nombre;
	   this.edad=edad;
	   this.sexo=sexo;
	   dni=generarDni();
   }
   Persona(String nombre,int edad,char sexo,double alt){
	   this.nombre=nombre;
	   this.edad=edad;
	   this.sexo=sexo;
	   this.dni=generarDni();
   }
   private String generarDni(){
	   char letras[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
               'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
               'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	   int numDNI=((int)(Math.random()*99900000+100000));
       int res=numDNI%23;
       return Integer.toString(numDNI)+generarLetra(res);
   }
   char generarLetra(int r){
	   char letras[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
               'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
               'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	   return letras[r];
   }
   String getNombre(){
	   return nombre;
   }
   String getDni(){
	   return dni;
   }
   int getEdad(){
	   return edad;
   }
   char getSexo(){
	   return sexo;
   }
   double getAlt(){
	   return alt;
   }
   
   void setNombre(String n){
	   nombre=n;
   }
   void setEdad(int e){
	   edad=e;
   }
   void setSexo(char s){
	   sexo=s;
   }
   void setAlt(double a){
	   alt=a;
   }
   boolean esMayorDeEdad(){
	   boolean r=false;
	   if (edad>=18)
		   r=true;
	   return r;
   }
   void comprobarSexo(char sexo){
	   if(sexo!='H' && sexo!='M')
           this.sexo='H';
        else
           this.sexo=sexo;
   }
   String Escribir(){
	   
	   String s="";
       if(this.sexo=='H'){
           s="hombre";
       }else{
           s="mujer";
       }
       
       String f="Informacion de la persona\n" +
               "Nombre: "+nombre+"\n" +
               "Sexo: "+s+"\n" +
               "Edad: "+edad+" años\n" +
               "DNI: "+dni+"\n" +
               "Altura: "+alt+" metros\n";
       return f;
   }
}
