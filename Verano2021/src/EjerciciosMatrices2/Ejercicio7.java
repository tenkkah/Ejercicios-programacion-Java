/*Hacer un programa que transponga una matriz de 4x4.*/

package EjerciciosMatrices2;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        int auxiliar;
        for(int i=0;i<matriz.length;i++)
         for (int j = 0; j < matriz[i].length; j++) 
            matriz[i][j]=(int)(Math.random()*10);    
        
        Mostrar(matriz);
        
        for(int i=0;i<matriz.length;i++)
          for (int j = i; j < matriz[i].length; j++){
              auxiliar=matriz[i][j];
              matriz[i][j]= matriz[j][i];
              matriz[j][i]=auxiliar;
          }
        
        Mostrar(matriz);
        
    }
   static void Mostrar(int[][] tabla){
      System.out.println("------------------------");  
     for(int i=0;i<tabla.length;i++){
        for (int j = 0; j < tabla[i].length; j++) 
             System.out.print(tabla[i][j]+" "); 
         System.out.println();
     }               
   }
}
