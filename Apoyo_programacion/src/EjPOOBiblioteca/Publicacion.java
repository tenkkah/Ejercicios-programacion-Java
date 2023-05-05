/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjPOOBiblioteca;


public class Publicacion {
     private static int idActual = 1;
   private int id;
   private String nombre;
   private int ejemplares;
   private int prestados;
   
   //constructor por defecto

    public Publicacion() {
    }
   
    //constructor con parametros

    public Publicacion(int id, String nombre, int ejemplares, int prestados) {
        this.id = idActual++;
        this.nombre = nombre;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public static int getIdActual() {
        return idActual;
    }

    public static void setIdActual(int idActual) {
        Publicacion.idActual = idActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean prestado = true;
        if(prestados < ejemplares){
            prestados++;
        }else{
            prestado = false;
        }
        return prestado;
    }
    
    public boolean devolucion(){
        boolean devuelto = true;
        if(prestados == 0){
            devuelto = false;
        }else{
            prestados --;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", nombre=" + nombre + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
}
