
package Ejercicio1;


public class Principal {
    public static void main(String[] args) {
        
        PuertaCoche pc1 = new PuertaCoche(true,"Puerta1",12,150);
        PuertaCoche pc2 = new PuertaCoche(false,"Puerta2",20,250);
        PuertaCoche pc3 = new PuertaCoche(true,"Puerta3",10,100);
        
        System.out.println("Coche 1");
        pc1.Desbloquea();
        pc1.desactivarAlarma();
        pc1.Abrir();
        System.out.println("Coche 2");
        pc2.Bloquea();
        pc2.activarAlarma();
        pc3.alarmaActivada();
        
        System.out.println("Coche 1 "+pc1.toString());
        System.out.println("Coche 2 "+pc2.toString());
        System.out.println("Coche 3 "+pc3.toString());
    }
}
