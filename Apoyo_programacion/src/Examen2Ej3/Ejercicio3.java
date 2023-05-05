/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            File f = new File("parrafo.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String cadena = "";
            cadena = br.readLine();

            System.out.println("FICHERO ORIGINAL");
            System.out.println("--------------------");
            while (cadena != null) { //hace el ciclo hasta el br tiene datos     
                System.out.println(cadena);
                cadena = br.readLine();
            }
            
            System.out.println();
            System.out.println();
            System.out.println("FICHERO MODIFICADO");
            System.out.println("---------------------");
            
            
            br.close();
            fr.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }

    }

}
