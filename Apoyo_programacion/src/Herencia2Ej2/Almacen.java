/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia2Ej2;


public class Almacen {
    private Bebida[][] estanteria;
    
    //Constructores

    public Almacen(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

    public Almacen() {
        estanteria = new Bebida[5][5];
    }
    
     //Metodos
     
    
    // Agrega una bebida, primera posicion que encuentre
   
    public void agregarBebida(Bebida b) {
 
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = b; //inserto la bebida
                    encontrado = true; //Salgo
                }
            }
        }
 
        //Indico si se ha añadiddo la bebida o no
        if (encontrado) {
            System.out.println("Bebida añadida");
        } else {
            System.out.println("No se ha podido añadir la bebida");
        }
 
    }
 
    
     //Elimina la bebida con el id que le pasen, sino esta se indica
   
    public void eliminarBebida(int id) {
 
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null; //Elimino la bebida
                        encontrado = true; //Salgo
                    }
                }
            }
        }
 
        //Indico si se ha eliminado
        if (encontrado) {
            System.out.println("Bebida eliminada");
        } else {
            System.out.println("No existe la bebida");
        }
 
    }
 
    
     //Recorro las estantenrias y muestro las bebidas
    
    public void mostrarBebidas() {
 
         
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {//controlo nulos
                    System.out.println("fila " + i + ", columna: " + j + " Bebida: " + estanteria[i][j].toString());
                }
            }
        }
 
    }
 
   //Calculo el precio de todas las bebidas
    public double calcularPrecioBebidas() {
 
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {//controlo nulos
                    precioTotal += estanteria[i][j].getPrecio();//acumulo el precio
                }
            }
        }
 
        return precioTotal;
 
    }
 
   
     // Calculo el precio de todas las bebidas dde una marca
    public double calcularPrecioBebidas(String marca) {
 
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {//controlo nulos
 
                    if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal += estanteria[i][j].getPrecio(); //acumulo el precio
                    }
 
                }
            }
 
        }
 
        return precioTotal;
    }
 
    
    // Calculo el precio de todas las bebidas de una determinada columna
     
    public double calcularPrecioBebidas(int columna) {
 
        double precioTotal = 0;
        if (columna >= 0 && columna < estanteria[0].length) {
 
            for (int i = 0; i < estanteria.length; i++) {
 
                if (estanteria[i][columna] != null) { //controlo nulos
                    precioTotal += estanteria[i][columna].getPrecio(); //acumulo el precio
                }
            }
 
        } else {
            System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
        }
 
        return precioTotal;
 
    }
 
}
