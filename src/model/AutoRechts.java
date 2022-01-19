package model;

import processing.core.PApplet;

public final class AutoRechts extends Auto{
	
	/**
	 * Konstruktor AutoRechts
	 * @param getxAuto()
	 * @param getyAuto()
	 */
	public AutoRechts(float xAuto, float yAuto) {
		super(xAuto, yAuto);
	}

	
	/**
	 * Drawmethode für AutoRechts
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
		 	
		/** //Abgas
		 	window.fill(180);
		 	window.circle(getxAuto() + 60, getyAuto() + 30, 5);
		 	window.circle(getxAuto() + 65, getyAuto() + 30, 8);
		 	window.circle(getxAuto() + 70, getyAuto() + 30, 11);
		 	*/
		/** //Antenne
		 	window.fill(150);
		 	window.rect(getxAuto()+45, getyAuto()+36, 30, 2);
		 	*/
		}
}
