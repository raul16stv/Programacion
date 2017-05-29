package Calculadora;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Calculadora extends Applet{
	public static final int NUM_TECLAS = 9;
	Image imagen;
	Graphics noseve;
	Image imagenes[];
	Casilla casillas[];
	int valoractivo;
	int valores[]={1,2,3,4,5,6,7,8,9};
	int resultado;
    public void init() {
    	imagen = createImage(700, 500);
    	noseve = imagen.getGraphics();
    	imagenes = new Image[NUM_TECLAS];
    	casillas= new Casilla[NUM_TECLAS];
    	for(int i=0; i<NUM_TECLAS; i++){
    			imagenes[i] = getImage(getCodeBase(), "imagenes/"+(i+1)+".jpeg");
    			casillas[i] = new Casilla(imagenes[i], i, valores[i],i*Casilla.DIMENSION,i+Casilla.DIMENSION);
    	}
    }
    public void paint(Graphics g){
    for(int i=0; i<NUM_TECLAS; i++){
    	casillas[i].dibujar(noseve, this);
    	noseve.drawString("El resultado es: "+valoractivo,250,250);
    	repaint();
    }
    	g.drawImage(imagen, 0, 0, this);
    	
    }
    
    public void update(Graphics g){
    	paint(g);
    }
    
    public boolean mouseDown(Event ev, int x, int y){
		for(int i=0; i<NUM_TECLAS; i++)
			if(casillas[i].contains(x, y))
				valoractivo+= casillas[i].valor;
				repaint();
				System.out.println(valoractivo);
	
	
    	return true;
    }

	
	    
	}


    
 
    
   
    
    
    
    
    
    
    
    
    



