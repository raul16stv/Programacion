package Calculadora;

import java.awt.*;
import java.applet.*;
public class Casilla extends Rectangle{
	public static final int DIMENSION = 60;
	Image imagen;
	int posicion;
	int valor;

    public Casilla(Image img, int pos, int val, int posx, int posy) {
    	super(posx, posy, DIMENSION, DIMENSION);
    	imagen = img;
    	posicion = pos;
    	valor=val;
    }
 
    public void dibujar(Graphics ggg, Applet ap){
    	ggg.drawImage(imagen, x, y, ap);
    }   
}