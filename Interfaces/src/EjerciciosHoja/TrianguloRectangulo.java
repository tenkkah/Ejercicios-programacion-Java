package EjerciciosHoja;


public class TrianguloRectangulo extends Triangulo {
    private int cateto;

    public TrianguloRectangulo(int cateto) { //Tienes que recibir el parametro
        super(cateto,cateto); //Para enviarle a la clase triangulo que es de donde heredda para mandarle los atributos que hereda
        
    }
    

    @Override
    public void dibujarTxt() {
      for(int i=1;i<=getAltura();i++){
          for(int j=1;j<=i;j++)
            System.out.println("* ");
          System.out.println();
      }
    }

}
