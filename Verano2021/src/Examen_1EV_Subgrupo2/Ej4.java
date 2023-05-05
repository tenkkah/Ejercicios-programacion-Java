/*Por simplicidad, un cromosoma se va a considerar como una cadena de 0 y 1, de largo 20.
Hacer un programa para determinar el porcentaje de parentesco entre muestras.
 Los pasos a seguir son:
 Se obtiene una muestra del ADN de una persona (20 caracteres)
 Se busca en la lista de cromosomas, aquel cromosoma que es más parecido a la
muestra. El más parecido se define como el cromosoma que tiene más genes
(caracteres) iguales a la muestra.
 Finalmente, se mostrará el porcentaje de coincidencia.
La secuencia del cromosoma plantilla es 00101010101101110111 y la secuencia de la
persona se introducirá el usuario por teclado
Ej: Plantilla: 00000101010101010101
 Persona: 01010101000011001100
 Hay 12 coincidencias lo que equivale a un 60%
 */
package Examen_1EV_Subgrupo2;


public class Ej4 {
    public static void main(String[] args) {
    int[] plantilla={0,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,1}; 
    int[] cromosoma=new int[20];
    int cont=0;
    for(int i=0;i<cromosoma.length;i++){
      cromosoma[i]=(int)(Math.random()*2);
      System.out.print(cromosoma[i]+" ");
    }
    System.out.println();
    for(int i=0;i<plantilla.length;i++){
      System.out.print(plantilla[i]+" ");
    }
    for(int i=0;i<cromosoma.length;i++)
      if(plantilla[i]==cromosoma[i])
        cont++;
    
    System.out.println("\nHay "+cont+" coincidencias lo que "
            + "equivale a "+(cont*100/20)+"%");
    
    }
}
