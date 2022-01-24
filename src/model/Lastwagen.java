package model;


import processing.core.PApplet;

/**
 * Lastwagen Klasse wird erstellt
 * @author Tim
 *
 */
public final class Lastwagen extends Auto{
				
	/**
	 * Konstruktor der Lastwagen Klasse
	 * @param xAuto
	 * @param yAuto
	 */
	public Lastwagen(float xAuto, float yAuto) {
		super(xAuto, yAuto);
	}
	
	/**
	 * drawLastwagen-Methode wird erstellt
	 * @param window
	 */
		public void drawLastwagen(PApplet window){ 
		 
		//Räder
			window.fill(20);
			window.rect(getxAuto()+35, getyAuto()-9, 25, 11);
			window.rect(getxAuto()+35, getyAuto()+37, 25, 11);
			window.rect(getxAuto()-35, getyAuto()-9, 25, 13);
			window.rect(getxAuto()-35, getyAuto()+37, 25, 11);
		//Lastwagen
		 	window.fill(0,100,200);
		 	window.rect(getxAuto()-40, getyAuto(), 100, 40);
		//Licht vorne
		 	window.fill(250,250,0);
			window.rect(getxAuto()+55, getyAuto(), 10, 15);
			window.rect(getxAuto()+55, getyAuto()+24, 10, 15);
			window.fill(0,100,200);
		 	window.rect(getxAuto()+2, getyAuto(), 60, 40);
		 //Fenster
		 	window.fill(0,200,255);
		 	window.rect(getxAuto()+40, getyAuto(), 15, 40 );
		 //Dach
		 	window.fill(0,100,200);
		 	window.rect(getxAuto()-40, getyAuto(), 80, 40);
	}
}
