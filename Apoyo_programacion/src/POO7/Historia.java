/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;

//Crea 4 celdas, todas abiertas pues en este momento no hay prisioneros. Instancia a un carcelero de nombre Jaime
public class Historia {
    public static void main(String[] args) {
    Celda c1 = new Celda("celda 1", true, 1122);
		Celda c2 = new Celda("celda 2", true, 1422);
		Celda c3 = new Celda("celda 3", true, 9824);
		Celda c4 = new Celda("celda 4", true, 5287);
		
		Celda[] celdas = new Celda [4];
		celdas[0] = c1;
		celdas[1] = c2;
		celdas[2] = c3;
		celdas[3] = c4;
		
		// Celda[] celdas = {c1,c2,c3,c4};
		
		Carcelero carcelero1 = new Carcelero("Jaime",celdas);
		
		Prisionero prisionero1 = new Prisionero("Bubba");
                System.out.println(carcelero1.toString());
		System.out.println(prisionero1.toString());

	}
}
