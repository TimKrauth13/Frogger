package model;


import processing.core.PApplet;

public final class Lastwagen extends Auto{
				
	/**
	 * Konstruktor Lastwagen-Klasse
	 * @param getxAuto()
	 * @param getyAuto()
	 */
	public Lastwagen(float xAuto, float yAuto) {
		super(xAuto, yAuto);
	}
	
	
/**
 * Drawmethode für Lastwagen-Objekte
 * @param window
 * @param x
 * @param y
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
		 	
		/** //Abgas
		 	window.fill(180);
		 	window.circle(getxAuto() - 45, getyAuto() + 10, 5);
		 	window.circle(getxAuto() - 50, getyAuto() + 10, 8);
		 	window.circle(getxAuto() - 55, getyAuto() + 10, 11);
		 	*/
		 /** //Antenne
		 	window.fill(150);
		 	window.rect(getxAuto()-55, getyAuto()+3, 30, 2);
		*/
	}


		
}
