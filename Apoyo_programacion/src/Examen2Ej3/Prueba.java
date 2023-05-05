/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Ej3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Prueba {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            
            int[] contador = new int[5]; //El 5 por las 5 vocales
            
            File f = new File("parrafo.txt");
            FileReader fr = new FileReader(f);
            
            int caracter = fr.read();
            while(caracter != -1){
                switch((char)caracter) {
                    case 'a': contador[0]++;
                        break;
                    case 'e': contador[1]++;
                        break;
                    case 'i': contador[2]++;
                        break;
                    case 'o': contador[3]++;
                        break;
                    case 'u': contador[4]++;
                        break;
                }
                caracter = fr.read();
            }
            
            fr.close();
            

            char[] letra = {'a','e','i','o','u'};
            for (int i=0; i<contador.length; i++) {
                System.out.println("La "+letra[i]+" se repite "+contador[i]+" veces");
            }
            
                                   
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}


