package model;

import processing.core.PApplet;

/**
 * Frogger Klasse wird erstellt
 * @author Tim
 *
 */
public final class Frogger{

	public float xFrogger = 356;
	public float yFrogger = 900;
	public float speedFrogger = 79;
	
	
	/**
	 * Konstruktor für Frogger-Klasse
	 * @param xFrogger
	 * @param yFrogger
	 * @param speedFrogger
	 */
	 public Frogger(float xFrogger, float yFrogger, float speedFrogger) {
		this.xFrogger = xFrogger;
		this.yFrogger = yFrogger;
		this.speedFrogger = speedFrogger;
	}

/**
 * Getter und Setter für Frogger-Klasse
 * @return
 */
	public float getXFrogger() {
		return xFrogger;
	}
	
	public void setXFrogger(float xFrogger) {
		this.xFrogger = xFrogger;
	}

	public float getYFrogger() {
		return yFrogger;
	}

	public void setYFrogger(float yFrogger) {
		this.yFrogger = yFrogger;
	}

	public float getSpeedFrogger() {
		return speedFrogger;
	}

	public void setSpeedFrogger(float speedFrogger) {
		this.speedFrogger = speedFrogger;
	}

/**
 * drawFrogger-Methode wird erstellt
 * @param window
 */
	public void drawFrogger(PApplet window){  
		 
		 window.noStroke();
		 
		 //Vorderbeine
		 	window.fill(0,200,0);
		 	window.circle(xFrogger-15, yFrogger-15, 20);
		 	window.circle(xFrogger+15, yFrogger-15, 20);
		 	
		 //Hinterbeine
		 	window.circle(xFrogger-12, yFrogger+20, 20);
		 	window.circle(xFrogger+12, yFrogger+20, 20);
		 	
		 //Körper
		 	window.circle(xFrogger, yFrogger, 50);
		 	
		 //Zunge	
			window.fill(200,0,0);
			window.circle(xFrogger, yFrogger-23, 15);
		 	
		 //Körper
			window.fill(0,255,0);
		 	window.circle(xFrogger, yFrogger, 50);
		 	
		 //Nase
		 	window.fill(0,170,0);
			window.circle(xFrogger-3, yFrogger-20, 2);
		 	window.circle(xFrogger+3, yFrogger-20, 2);
		 	
		 //Punkte
			window.fill(0,220,0);
		 	window.circle(xFrogger-10, yFrogger+8, 5);
		 	window.circle(xFrogger+10, yFrogger+8, 5);
		 	
		 	window.circle(xFrogger-5, yFrogger+13, 5);
		 	window.circle(xFrogger+5, yFrogger+13, 5);
		 	
		 	window.circle(xFrogger-15, yFrogger+13, 5);
		 	window.circle(xFrogger+15, yFrogger+13, 5);
		 	
		 //Augen
		 	window.circle(xFrogger-15, yFrogger-8, 20);
		 	window.circle(xFrogger+15, yFrogger-8, 20);
		 	
		 	window.fill(255);
		 	window.circle(xFrogger-15, yFrogger-10, 20);
		 	window.circle(xFrogger+15, yFrogger-10, 20);
		 
		 	window.fill(0);
		 	window.circle(xFrogger-15, yFrogger-15, 10);
		 	window.circle(xFrogger+15, yFrogger-15, 10);
	 }

}









