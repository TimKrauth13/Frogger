package model;

import processing.core.PApplet;
/**
 * Klasse Baum wird erstellt
 * @author Tim
 *
 */

public class Baum extends PApplet {

	/**
	 * Konstruktor für Baum Klasse
	 * @param window
	 * @param x
	 * @param y
	 */
	public void drawBaum(PApplet window, float x, float y){ 
		
	//Baumstamm
		 
		
	 	window.fill(140,111,10);
	 	window.circle(x, y+30, 60);
	 	window.rect(x, y, 150, 60);
	 	
	 	
	 	window.fill(160,131,30);
	 	window.circle(x+150, y+30, 60);
	 	
	 	window.fill(140,111,10);
	 	window.circle(x+150, y+30, 50);
	 	
	 	window.fill(160,131,30);
	 	window.circle(x+150, y+30, 40);
	 	
	 	window.fill(140,111,10);
	 	window.circle(x+150, y+30, 30);
	 	
	 	window.fill(160,131,30);
	 	window.circle(x+150, y+30, 20);
	 	
	 	window.fill(140,111,10);
	 	window.circle(x+148, y+35, 5);
	}
}
