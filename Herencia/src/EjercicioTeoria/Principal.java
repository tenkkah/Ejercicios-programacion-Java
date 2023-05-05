
package EjercicioTeoria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        Piso p;
        Local l;
        
        for(int i=1;i<=3;i++){
            if(i%2==0){
            p=new Piso(4,"direccionpiso1"+i,80+3*i,Math.random()*8000+120000,true);
             l=new Local(1,"direccionlocal"+i,45+3*i,Math.random()*8000+120000,false);
            
           } else{
                p=new Piso(2,"direccionpiso"+i,80+3*i,Math.random()*8000+120000,false); //Se pueden pedir por teclado los datos
                l=new Local(5,"direccionlocal"+i,45+3*i,Math.random()*8000+120000,true);
            }
                   lista.add(p); //Es para añadir al objeto piso
                   lista.add(l); //Es para añadir al objeto local
        }  
        for(int i=0;i<lista.size();i++)
            if(lista.get(i) instanceof Piso)
            System.out.println(((Piso)lista.get(i)).toString(10));
        else
            System.out.println(((Local)lista.get(i)).toString(15)); 
    }
}
