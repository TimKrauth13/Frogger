package model;

import processing.core.PApplet;

/**
 * AutoRechts Klasse wird erstellt
 * @author Tim
 *
 */
public final class AutoRechts extends Auto{
	
	/**
	 * Konstruktor der AutoRechts Klasse
	 * @param xAuto
	 * @param yAuto
	 */
	public AutoRechts(float xAuto, float yAuto) {
		super(xAuto, yAuto);
	}

	
	/**
	 * draw-Methode für AutoRechts wird erstellt
	 * @param window
	 */
	public void drawAutoRechts(PApplet window){ 
		 
	//Räder
			window.fill(20);
			window.rect(getxAuto(), getyAuto()-9, 25, 13);
			window.rect(getxAuto()+35, getyAuto()-9, 25, 11);
			window.rect(getxAuto(), getyAuto()+36, 25, 13);
			window.rect(getxAuto()+35, getyAuto()+37, 25, 11);
		//Auto
		 	window.fill(100,200,200);
		 	window.rect(getxAuto(), getyAuto(), 60, 40);
		//Licht vorne
		 	window.fill(250,250,0);
			window.rect(getxAuto()-3, getyAuto(), 10, 15);
			window.rect(getxAuto()-3, getyAuto()+24, 10, 15);
			window.fill(100,160,160);
		 	window.rect(getxAuto(), getyAuto(), 60, 40);
		
		 //Fenster
		 	window.fill(0,200,255);
		 	window.rect(getxAuto()+5, getyAuto(),15, 40 );
		 	
		 //Dach
		 	window.fill(100,160,160);
		 	window.rect(getxAuto()+20, getyAuto(), 40, 40);
		}
}
