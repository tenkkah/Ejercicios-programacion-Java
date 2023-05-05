/*Define un array de números enteros de 3 filas por 6 columnas con nombre num y 
  asigna como valor la suma de la fila y la columna. 
  Mostrar el contenido del array dispuesto en forma de tabla.
 */
package EjerciciosArrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] num=new int[3][6];
        
        for(int i=0;i<num.length;i++)
          for(int j=0;j<num[i].length;j++)
            num[i][j]=i+j;
        
        for(int i=0;i<num.length;i++){
          for(int j=0;j<num[i].length;j++)
            System.out.print("num("+i+","+j+")="
                             +num[i][j]+" ");
          System.out.println();
        }
    }
  
}

