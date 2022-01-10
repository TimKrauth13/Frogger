package model;

import processing.core.PApplet;

/**
 * Frogger Klasse wird erstellt
 * @author Tim
 *
 */
public class Frogger extends PApplet {
	
	
	private int angle;

	/**
	 * drawFrogger-Funktion
	 * @param window
	 * @param x
	 * @param y
	 */
	 public void drawFrogger(PApplet window, float x, float y){  
		 
		 window.noStroke();
		 
		 //Vorderbeine
		 	window.fill(0,200,0);
		 	window.circle(x-15, y-15, 20);
		 	window.circle(x+15, y-15, 20);
		 	
		 //Hinterbeine
		 	window.circle(x-12, y+20, 20);
		 	window.circle(x+12, y+20, 20);
		 	
		 
		 //Körper
		 	window.circle(x, y, 50);
		 	
		 //Zunge	
			window.fill(200,0,0);
			window.circle(x, y-23, 15);
		 	
		 //Körper
			window.fill(0,255,0);
		 	window.circle(x, y, 50);
		 	
		 //Nase
		 	window.fill(0,170,0);
			window.circle(x-3, y-20, 2);
		 	window.circle(x+3, y-20, 2);
		 	
		 //Punkte
			window.fill(0,220,0);
		 	window.circle(x-10, y+8, 5);
		 	window.circle(x+10, y+8, 5);
		 	
		 	window.circle(x-5, y+13, 5);
		 	window.circle(x+5, y+13, 5);
		 	
		 	window.circle(x-15, y+13, 5);
		 	window.circle(x+15, y+13, 5);
		 	
		 	
		 	
		 //Augen
		 	window.circle(x-15, y-8, 20);
		 	window.circle(x+15, y-8, 20);
		 	
		 	window.fill(255);
		 	window.circle(x-15, y-10, 20);
		 	window.circle(x+15, y-10, 20);
		 
		 	window.fill(0);
		 	window.circle(x-15, y-15, 10);
		 	window.circle(x+15, y-15, 10);
	 }

}









