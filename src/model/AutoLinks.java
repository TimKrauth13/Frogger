package model;

import processing.core.PApplet;

public class AutoLinks extends PApplet {
	
	/**
	 * Konstruktor für Auto Klasse
	 * @param window
	 * @param x
	 * @param y
	 */
	public void drawAutoLinks(PApplet window, float x, float y){ 
	
	//Räder
		window.fill(20);
		window.rect(x, y-9, 25, 13);
		window.rect(x+35, y-9, 25, 11);
		window.rect(x, y+36, 25, 13);
		window.rect(x+35, y+37, 25, 11);
	//Auto
	 	window.fill(220,0,0);
	 	window.rect(x, y, 60, 40);
	//Licht vorne
	 	window.fill(250,250,0);
		window.rect(x+55, y, 10, 15);
		window.rect(x+55, y+24, 10, 15);
		window.fill(220,0,0);
	 	window.rect(x+2, y, 60, 40);
	
	 //Fenster
	 	window.fill(0,200,255);
	 	window.rect(x+40, y,15, 40 );
	 	
	 //Dach
	 	window.fill(180,0,0);
	 	window.rect(x, y, 40, 40);
	 	
	 //Antenne
	 	window.fill(150);
	 	window.rect(x-15, y+3, 30, 2);
	}
}












