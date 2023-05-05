
package Cuenta;


public class Cuenta { //Constructor vacio
    int nCuenta;
    double saldo, interes;
    
    Cuenta(int nc, double s, double i){   //Si no hay un constructor en mi clase el de dentro se crea internamente
    this.nCuenta=nc;
    this.saldo=s;
    this.interes=i;
    }

    Cuenta() {       
    }
    
   void actualizarSaldo(){ //Si el enunciado  te dice que va a devolver sera de tipo int, si el enunciado no te dice que no devuelve nada sera de tipo void
    saldo=saldo+(saldo+interes)/365;
  }
   
   void Ingresar (double cantidad){
       saldo=saldo+cantidad;
   }
   
   void Retirar (double cantidad){
       if(cantidad<=saldo)
           saldo=saldo-cantidad;
       else
           System.out.println("No dispone de saldo para retirar esa cantidad");
   }

    @Override
    public String toString() {
        return "Cuenta{" + "nCuenta=" + nCuenta + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
}
    