
package EjerciciosHoja;


public abstract class Triangulo implements Figura { //Implements para heredar de Figura en vez de Rectangulo
    private int base,altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() { //Para que se herede al TrianguloRectangulo y asi se pueda escribir el triangulo
        return altura;
    }
    
    
    @Override
    public String NombreFigura() {
        return getClass().getSimpleName();
    }

    @Override
    public int Area() {
       return base*altura/2;
    }

    @Override
    public int Perimetro() {
        int cateto=(int)(Math.sqrt(Math.pow(altura,2)+Math.pow((base/2),2))); //El pow sirve para elevar los exponenentes.
        return base+2*cateto;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    @Override
    public abstract void dibujarTxt(); //Como te dice que no se puede representar la figura es la clase abstracta.
    
}
