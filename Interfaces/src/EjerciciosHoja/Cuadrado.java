package EjerciciosHoja;


public class Cuadrado extends Rectangulo { //Extends cuando hereda de la clase que ya ha heredado
    private int lado;
    
    Cuadrado(int lado){ //Escrito a mano
        super(lado,lado);
    }
    
    /*@Override
    public String NombreFigura() { //Copiar de la clase rectangulo
    return "Cuadrado";
    }*/
    
}
