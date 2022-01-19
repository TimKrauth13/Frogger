package model;


import processing.core.PApplet;

public class Lastwagen{
		
	private float xLastwagen = 200;
	private float yLastwagen = 490;
	
		
	/**
	 * Konstruktor Lastwagen-Klasse
	 * @param xLastwagen
	 * @param yLastwagen
	 */
	public Lastwagen(float xLastwagen, float yLastwagen) {
		this.xLastwagen = xLastwagen;
		this.yLastwagen = yLastwagen;
	}
	
	/**
	 * Getter und Setter für Lastwagen-Klasse
	 * @return
	 */
	
		public float getXLastwagen() {
		return xLastwagen;
	}

	public void setXLastwagen(float xLastwagen) {
		this.xLastwagen = xLastwagen;
	}

	public float getYLastwagen() {
		return yLastwagen;
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
			window.rect(xLastwagen+35, yLastwagen-9, 25, 11);
			window.rect(xLastwagen+35, yLastwagen+37, 25, 11);
			window.rect(xLastwagen-35, yLastwagen-9, 25, 13);
			window.rect(xLastwagen-35, yLastwagen+37, 25, 11);
		//Lastwagen
		 	window.fill(0,100,200);
		 	window.rect(xLastwagen-40, yLastwagen, 100, 40);
		//Licht vorne
		 	window.fill(250,250,0);
			window.rect(xLastwagen+55, yLastwagen, 10, 15);
			window.rect(xLastwagen+55, yLastwagen+24, 10, 15);
			window.fill(0,100,200);
		 	window.rect(xLastwagen+2, yLastwagen, 60, 40);
		 //Fenster
		 	window.fill(0,200,255);
		 	window.rect(xLastwagen+40, yLastwagen, 15, 40 );
		 //Dach
		 	window.fill(0,100,200);
		 	window.rect(xLastwagen-40, yLastwagen, 80, 40);
		 	
		/** //Abgas
		 	window.fill(180);
		 	window.circle(xLastwagen - 45, yLastwagen + 10, 5);
		 	window.circle(xLastwagen - 50, yLastwagen + 10, 8);
		 	window.circle(xLastwagen - 55, yLastwagen + 10, 11);
		 	*/
		 /** //Antenne
		 	window.fill(150);
		 	window.rect(xLastwagen-55, yLastwagen+3, 30, 2);
		*/
	}

		
}
