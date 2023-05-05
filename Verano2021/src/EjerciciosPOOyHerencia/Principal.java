/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPOOyHerencia;

/**
 *
 * @author Aitor
 */
public class Principal {
    public static void main(String[] args) {
        
        Cuenta c1=new Cuenta();
        Cuenta c2=new Cuenta(1111,500,0.03);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c1.nCuenta=3333;
        c1.Retirar(100); //Intentar retirar pero no dispone de saldo 
        c1.Ingresar(300);
        System.out.println(c1.toString());
        
        c2.actualizarSaldo();
        System.out.println(c2.toString());
        c2.Retirar(100);
        System.out.println(c2.toString());
    }
}
