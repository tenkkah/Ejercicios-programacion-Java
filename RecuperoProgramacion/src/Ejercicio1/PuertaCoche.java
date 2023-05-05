
package Ejercicio1;


public class PuertaCoche extends ComponentedeCoche implements Alarma, PuertaBloqueable {
    private boolean estaBloqueada;

    public PuertaCoche(boolean estaBloqueada, String descripcion, int peso, double coste) {
        super(descripcion, peso, coste);
        this.estaBloqueada = estaBloqueada;
    }

    @Override
    public void activarAlarma() {
        System.out.println("Activar Alarma");
    }

    @Override
    public void desactivarAlarma() {
        System.out.println("Desactivar Alarma");
    }

    @Override
    public void alarmaActivada() {
       boolean resp = false;
        if(estaBloqueada)
            resp = true;
    }

    @Override
    public void Bloquea() {
        System.out.println("Puerta bloqueada");
    }

    @Override
    public void Desbloquea() {
        System.out.println("Puerta desbloqueada");
    }

    @Override
    public void Abrir() {
        System.out.println("Perta abierta");
    }

    @Override
    public void Cerrar() {
        System.out.println("Puerta cerrada");
    }

   
    
    
}
