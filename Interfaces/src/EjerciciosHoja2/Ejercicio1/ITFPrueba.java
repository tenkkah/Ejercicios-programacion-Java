/*
PRINCIPAL
Crear una clase ITFPrueba que:
? Declare una variable ITFPositivo de tipo ITFImpresion
? Declara una variable ITFNegativo de tipo ITFImpresion
Para probar el polimorfismo hacer lo siguiente:
? Crear un ArrayList parametrizado para ITFImpresion y añadir a la lista ambas instancias
? Recorrer el ArrayList llamando al método imprimir
 */
package EjerciciosHoja2.Ejercicio1;

import java.util.ArrayList;


public class ITFPrueba {
    public static void main(String[] args) {
        ITFImpresion itfp=new ITFPositivo();
        ITFImpresion itfn=new ITFNegativo();
        ArrayList<ITFImpresion> lista=new ArrayList<ITFImpresion>();
        lista.add(itfp);
        lista.add(itfn);
        
        for(int i=0;i<lista.size();i++)
            if(lista.get(i) instanceof ITFPositivo)    
        ((ITFPositivo)lista.get(i)).Escribir();
        else
                lista.get(i).Imprimir();   
    }
    
}