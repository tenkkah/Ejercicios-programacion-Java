
package EjerciciosHoja;


public class Rectangulo implements Figura{ //Implements cuando hereda de la interfaz
    private int altura, base;

    public Rectangulo(int altura, int base) { //Constructor
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
    @Override //Los override se insertan al poner implements, implementa todos los metodos de la interfaz
    public String NombreFigura() {
        //return "Rectangulo";
       return getClass().getSimpleName(); //Nos devuelve el get class el nombre completo de todos los paquetes, como solo queremos el nombre de la clase pues se pone el getSimpleName
    }

    @Override
    public int Area() {
       return base*altura;
    }

    @Override
    public int Perimetro() {
       return 2*(base+altura); 
    }

    @Override
    public void dibujarTxt() {
       for(int i=1;i<=altura;i++){
           for(int j=1;j<=base;j++)
               System.out.print(" * ");
           System.out.println();
       }
    }
    
}
