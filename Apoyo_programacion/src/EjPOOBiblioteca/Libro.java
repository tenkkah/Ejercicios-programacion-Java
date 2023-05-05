/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjPOOBiblioteca;


public class Libro extends Publicacion{
    private String ISBN;

    public Libro(String ISBN) {
        this.ISBN = ISBN;
    }

    public Libro(String ISBN, int id, String nombre, int ejemplares, int prestados) {
        super(id, nombre, ejemplares, prestados);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + '}';
    }
    
    
}
