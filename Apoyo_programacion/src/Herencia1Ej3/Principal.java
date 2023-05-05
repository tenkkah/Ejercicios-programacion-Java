/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1Ej3;


public class Principal {
     public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = MasterCtr.crearArrayElectrodomesticos();

        double precios[] = MasterCtr.calcularPrecios(electrodomesticos);

        System.out.println("El precio total es --> " + (precios[0] + precios[1] + precios[2]));
        System.out.println("Donde el precio de los Electrodomesticos es: " + precios[0]);
        System.out.println("Donde el precio de las Lavadoras es: " + precios[2]);
        System.out.println("Donde el precio de los Televisores es: " + precios[1]);


    }
}
