/*Haz una clase llamada Password que siga las siguientes condiciones:
Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
Los constructores serán los siguientes:
Un constructor por defecto.
Un constructor con la longitud que se le pase y generara una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2
mayúsculas, más de 1 minúscula y más de 5 números.
generarPassword(): genera la contraseña del objeto con la longitud que tenga.
Método get para contraseña y longitud.
Método set para longitud.
Ahora, crea una clase clase Principal que tenga un ArrayList de Passwords hasta que se introduzca una
password de longitud 0.
Crear un array de booleanos donde se almacene si el password del arraylist de Password es o no fuerte.
Al final, se mostrara la contraseña y si es o no fuerte. 
 */
package EjercicioArrayList.Hoja3Ej1;


public class Password {
    private String pw;
    private int lon=8;
    Password(){
    	pw=generarContrasena(lon);
    }
    Password(int l){
    	lon=l;
    	pw=generarContrasena(lon);
    }
    String getPw(){
    	return pw;
    }
    int getLon(){
    	return lon;
    }
    void setLon(int l){
    	lon=l;
    }
    String generarContrasena(int l){
    	String p="";
    	for(int i=1;i<=l;i++){
    		int c=(int)(Math.random()*3+1);
    		if(c==1)
    			p=p+(char)(Math.random()*10+48);  
    		else if(c==2)
    			p=p+(char)(Math.random()*26+65);
    		else p=p+(char)(Math.random()*26+97);
    	}
    	
    	return p;
    }
    boolean esFuerte(){
    	boolean c=false;
    	int cmy=0,cmn=0,cnu=0;
    	for(int i=0;i<pw.length();i++)
    		if(pw.charAt(i)>='a' && pw.charAt(i)<='z')
    		  cmn++;
    		else if(pw.charAt(i)>='A' && pw.charAt(i)<='Z')
    	    		  cmy++;
    		     else cnu++;
    		 if(cmn>1 && cmy>2 && cnu>5 ) 
    			 c=true;
    	return c;
    }
}
