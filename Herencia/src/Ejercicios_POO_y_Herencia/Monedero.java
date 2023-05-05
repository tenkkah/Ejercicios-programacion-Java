
package Ejercicios_POO_y_Herencia;

public class Monedero {
  private int id;
  private double saldo;

    public Monedero(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Monedero(int id) {
        this.id = id;
        this.saldo=100;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Monedero{" + "id=" + id + ", saldo=" + saldo + '}';
    }
  
    public void Ingresar(double cantidad) {  //Parametro de cantidad
        this.saldo=this.saldo+cantidad; //El metodo se escribe a mano, el metodo. No pones un return en los void.          
}

    public boolean Sacar(double cantidad){ //Escribir a mano el metodo
        boolean aceptado=false;
        if(cantidad<=this.saldo){
            this.saldo=this.saldo-cantidad;
            aceptado=true;
        }else System.out.println("No tiene suficiente saldo");
        return aceptado;
    }
    
    public void Prestar(Monedero m,double cantidad){ //Al m se le va a prestar dinero.
        if(Sacar(cantidad)) //A una persona le sacara el dinero para poder prestarlo y la hara
            m.Ingresar(cantidad); //A la otra persona le llegara el dinero y lo ingresara   
    }
  
    public static void Prestar(Monedero m1, Monedero m2, double cantidad){ //Nombre de los objetos m1, m2, cantidad. Monedero es llamando a la clase.
        if(m1.Sacar(cantidad))
            m2.Ingresar(cantidad);
    }
  
    
  
}
