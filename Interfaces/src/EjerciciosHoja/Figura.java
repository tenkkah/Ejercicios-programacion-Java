package EjerciciosHoja;

public interface Figura {
    
    public String NombreFigura(); //En una interfaz todos los metodos son abstractos, si no fuese interfaz se tendria que poner public abstract
    public int Area();
    public int Perimetro();
    public void dibujarTxt();
}
