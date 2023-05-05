/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArrayList.Hoja1Ej3;


public class Triangulo {
     private int b,h;
    Triangulo(int b,int h){
    	this.b=b;
    	this.h=h;
    }
   double Area(){
    	double a;
    	a=(double)b*h/2;
    	return a;
    }
    double Perimetro(){
    	double p;
    	double x=Math.sqrt(Math.pow((b/2.0),2)+Math.pow(h, 2));
    	p=2*x+b;
    	return p;
    }
    int getBase(){
    	return b;
    }
    int getAltura(){
    	return h;
    }
}
