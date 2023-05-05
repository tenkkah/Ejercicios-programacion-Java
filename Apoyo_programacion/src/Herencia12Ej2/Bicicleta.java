/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia12Ej2;

import java.util.Scanner;


public class Bicicleta {
    Scanner teclado = new Scanner(System.in);
    //atributos
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    
    //constructor

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    
    //Metodos
    public void acelerar(){
        System.out.println("La velocidad actual de mi bicicleta "+velocidadActual+" Km/h");
        velocidadActual = (velocidadActual*2);
        System.out.println("La velocidad de la bici si aceleras de "+velocidadActual+" Km/h");
    }
    
    public void frenar(){
        int freno = velocidadActual/4;
        System.out.println("La velocidad de mi bici al momento d efrenar sera de "+freno+" Km/h");
    }
    
    public void Cambiarplato(int plato){
        System.out.println("El plato actual de mi bicicleta es "+platoActual+" Km/h");
        System.out.println("A que numero de plato desea cambiar??");
        platoActual = teclado.nextInt();
        System.out.println("El plato actual de mi bicicleta es "+platoActual+"");
    }
    
    public void Cambiarpinon(int pinon){
        System.out.println("El pinon actual de mi bicicleta es "+pinonActual+"");
        pinonActual = teclado.nextInt();
        System.out.println("El pinon actual de mi bicicleta es "+pinonActual+"");
    }
    
    //Meotodos 2 
   public void acelerar2(){
        System.out.println("La velocidad actual de tu bicicleta "+velocidadActual+" Km/h");
        velocidadActual = (velocidadActual*2);
        System.out.println("La velocidad de la bici si aceleras de "+velocidadActual+" Km/h");
    }
   public void frenar2(){
        int freno = velocidadActual/4;
        System.out.println("La velocidad de tu bici al momento de frenar sera de "+freno+" Km/h");
    }
    
    public void Cambiarplato2(int plato2){
        System.out.println("El plato actual de tu bicicleta es "+platoActual+" Km/h");
        System.out.println("A que numero de plato desea cambiar??");
        platoActual = teclado.nextInt();
        System.out.println("El plato actual de mi bicicleta es "+platoActual+"");
    }
    
    public void Cambiarpinon2(int pinon2){
        System.out.println("El pinon actual de tu bicicleta es "+pinonActual+"");
        pinonActual = teclado.nextInt();
        System.out.println("El pinon actual de tu bicicleta es "+pinonActual+"");
    }
}
