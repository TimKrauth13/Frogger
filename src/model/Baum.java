package model;

import processing.core.PApplet;

/**
 * Baum Klasse wird erstellt
 * @author Tim
 *
 */
public final class Baum extends PApplet {

	public float xBaum = 200;
	public float yBaum = 79;
	public int richtung = 0;
	
	
/**
 * Konstruktor für Baum Klasse	
 * @param xBaum
 * @param yBaum
 * @param richtung
 */
	public Baum(float xBaum, float yBaum, int richtung) {
		this.xBaum = xBaum;
		this.yBaum = yBaum;
		this.richtung = richtung;
	}



/**
 * Getter und Setter für Baum Klasse
 * @return
 */
	public float getXBaum() {
		return xBaum;
	}

	public void setXBaum(float xBaum) {
		this.xBaum = xBaum;
	}

	public float getYBaum() {
		return yBaum;
	}

	public void setYBaum(float yBaum) {
		this.yBaum = yBaum;
	}

	public int getRichtung() {
		return richtung;
	}

	public void setRichtung(int richtung) {
		this.richtung = richtung;
	}



/**
 * drawBaum-Methode der Baum Klasse wird erstellt 
 * @param window
 */
	public void drawBaum(PApplet window){ 
		
	//Baumstamm
		 
		
	 	window.fill(140,111,10);
	 	window.circle(xBaum, yBaum+30, 60);
	 	window.rect(xBaum, yBaum, 150, 60);
	 	
	 	
	 	window.fill(160,131,30);
	 	window.circle(xBaum+150, yBaum+30, 60);
	 	
	 	window.fill(140,111,10);
	 	window.circle(xBaum+150, yBaum+30, 50);
	 	
	 	window.fill(160,131,30);
	 	window.circle(xBaum+150, yBaum+30, 40);
	 	
	 	window.fill(140,111,10);
	 	window.circle(xBaum+150, yBaum+30, 30);
	 	
	 	window.fill(160,131,30);
	 	window.circle(xBaum+150, yBaum+30, 20);
	 	
	 	window.fill(140,111,10);
	 	window.circle(xBaum+148, yBaum+35, 5);
	}
}
