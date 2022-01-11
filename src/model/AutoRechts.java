package model;

import processing.core.PApplet;

public class AutoRechts extends PApplet {
	
	private float xAutoRechts = 390;
	private float yAutoRechts = 570;
	
	
	/**
	 * Konstruktor AutoRechts
	 * @param xAutoRechts
	 * @param yAutoRechts
	 */
	public AutoRechts(float xAutoRechts, float yAutoRechts) {
		this.xAutoRechts = xAutoRechts;
		this.yAutoRechts = yAutoRechts;
	}

	/**
	 * Getter und Setter der AutoRechts-Klasse
	 * @return
	 */
	public float getXAutoRechts() {
		return xAutoRechts;
	}

	public void setXAutoRechts(float xAutoRechts) {
		this.xAutoRechts = xAutoRechts;
	}

	public float getYAutoRechts() {
		return yAutoRechts;
	}

	/**
	 * Drawmethode für AutoRechts
	 * @param window
	 */
	public void drawAutoRechts(PApplet window){ 
		 
	//Räder
			window.fill(20);
			window.rect(xAutoRechts, yAutoRechts-9, 25, 13);
			window.rect(xAutoRechts+35, yAutoRechts-9, 25, 11);
			window.rect(xAutoRechts, yAutoRechts+36, 25, 13);
			window.rect(xAutoRechts+35, yAutoRechts+37, 25, 11);
		//Auto
		 	window.fill(100,200,200);
		 	window.rect(xAutoRechts, yAutoRechts, 60, 40);
		//Licht vorne
		 	window.fill(250,250,0);
			window.rect(xAutoRechts-3, yAutoRechts, 10, 15);
			window.rect(xAutoRechts-3, yAutoRechts+24, 10, 15);
			window.fill(100,160,160);
		 	window.rect(xAutoRechts, yAutoRechts, 60, 40);
		
		 //Fenster
		 	window.fill(0,200,255);
		 	window.rect(xAutoRechts+5, yAutoRechts,15, 40 );
		 	
		 //Dach
		 	window.fill(100,160,160);
		 	window.rect(xAutoRechts+20, yAutoRechts, 40, 40);
		 	
		 //Antenne
		 	window.fill(150);
		 	window.rect(xAutoRechts+45, yAutoRechts+36, 30, 2);
		}
}
