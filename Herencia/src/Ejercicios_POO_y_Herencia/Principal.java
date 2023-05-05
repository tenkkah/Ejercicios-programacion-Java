
package Ejercicios_POO_y_Herencia;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Monedero> lista=new ArrayList<Monedero>();
        Monedero m;
        
        Inicializar(lista,5);
        MostrarMonederos(lista);
        
        int operacion=Menu(teclado); 
        
        while(operacion!=7){
            switch(operacion){
                case 1:AñadirMonedero(teclado,lista);
                    break;
                case 2:IngresarDinero(teclado,lista);
                    break;
                case 3:SacarDinero(teclado,lista);
                    break;
                case 4:PrestarDinero(teclado,lista);
                    break;
                case 5:MostrarSaldo(teclado,lista);
                    break;
                case 6:MostrarMonederos(lista);
                    break;
                    default:System.out.println("Operacion incorrecta");
                    break;
            
            }
            operacion=Menu(teclado); //Se vuelve a copiar para que no quede en un bucle infinito
        }
        
    }    
          
    public static void Inicializar(ArrayList<Monedero> lista,int num){
        Monedero m;
        for(int i=1;i<=5;i++) {
            m=new Monedero(100*i,Math.random()*1000);
            lista.add(m);
        }
        
    }
    public static void MostrarMonederos(ArrayList<Monedero>lista){
         for(int i=0;i<lista.size();i++)
            System.out.println(lista.get(i).toString());     
    }
    
    public static int Menu(Scanner t){ //Scanner teclado es igual a t
        int opc; // El opc es igual a opciones 
        System.out.println("\n---------------------------\n");
        System.out.println("1.AÑADIR MONEDERO");
        System.out.println("2.INGRESAR DINERO");
        System.out.println("3.SACAR DINERO");
        System.out.println("4.PRESTAR DINERO");
        System.out.println("5.MOSTRAR SALDO");
        System.out.println("6.MOSTRAR TODOS LOS MONEDEROS");
        System.out.println("7.SALIR");
        System.out.println("INTRODUCE OPCION: ");
        opc=t.nextInt();
        return opc;
    }
    public static void AñadirMonedero(Scanner t, ArrayList<Monedero> lista){
        int id;//Son variables distintas cuando se llaman al metodo
        double dinero;
        System.out.println("Introducir el id del nuevo monedero");
        id=t.nextInt();
        if(Buscar(id,lista)==-1){
         System.out.println("Introducir el dinero del nuevo monedero");
            dinero=t.nextDouble();
            lista.add(new Monedero(id,dinero));       
        }else
            System.out.println("No se puede añadir pues el id ya existe");
    }
    
    public static int Buscar(int id,ArrayList<Monedero>lista){
        int i=0, pos=-1;
        while(i<lista.size() && lista.get(i).getId()!=id)
            i++;
        if(i<lista.size())
            pos=i;
        return pos; 
    }
    
    public static void MostrarSaldo(Scanner t, ArrayList<Monedero> lista){
         int id;//Son variables distintas cuando se llaman al metodo
        double dinero;
        System.out.println("Introducir el id del monedero a mostrar5");
        id=t.nextInt();
        int pos=Buscar(id,lista);
        if(pos!=-1){
            System.out.println(lista.get(pos).toString());     
        }else
            System.out.println("No se puede mostrar pues el id ya existe"); 
    }
    
    public static void IngresarDinero(Scanner t, ArrayList<Monedero> lista){
        int id;//Son variables distintas cuando se llaman al metodo
        double dinero=0;
        System.out.println("Introducir el id del monedero que va a ingresar");
        id=t.nextInt();
        int pos=Buscar(id,lista);
        if(pos!=-1){
         System.out.println("Introducir cantidad a ingresar");
            lista.get(pos).Ingresar(dinero);
            System.out.println("Ahora tiene "+lista.get(pos));
        }else
            System.out.println("No se puede ingresar pues el id ya existe");
    }    
    
     public static void SacarDinero(Scanner t, ArrayList<Monedero> lista){
        int id;//Son variables distintas cuando se llaman al metodo
        double dinero=0;
        System.out.println("Introducir el id del monedero que va a ingresar");
        id=t.nextInt();
        int pos=Buscar(id,lista);
        if(pos!=-1){
         System.out.println("Introducir cantidad a sacar");
         dinero=t.nextDouble();
            if(lista.get(pos).Sacar(dinero));
            System.out.println("La extraccion se ha realizado");
            System.out.println("Le queda "+lista.get(pos).getSaldo()+ "euros");
        }else
            System.out.println("No se puede sacar pues el id ya existe");
    }    
    
     public static void PrestarDinero(Scanner t, ArrayList<Monedero> lista){
         int id, pos1, pos2;
         double dinero;
            System.out.println("Introducir el id del monedero que va a prestar");
         id=t.nextInt();
         pos1=Buscar(id,lista);
         if(pos1!=-1){
             System.out.println("Introducir el id del monedero que va a prestar");
         id=t.nextInt();
         pos2=Buscar(id,lista);
         if(pos2!=-1){
             System.out.println("Introducir cantidad a prestar");
             dinero=t.nextDouble();
             //lista.get(pos1).Prestar(lista.get(pos2), dinero);
             Monedero.Prestar(lista.get(pos1), lista.get(pos2), dinero);
                }else
                 System.out.println("No se le puede prestar pues");
            }else
             System.out.println("No puede prestar pues el id no existe");
         }
}
