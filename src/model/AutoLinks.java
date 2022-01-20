package model;

import processing.core.PApplet;

public final class AutoLinks extends Auto{
	
	/**
	 * Konstruktor AutoLinks
	 * @param getxAuto()
	 * @param getyAuto()
	 */
	public AutoLinks(float xAuto, float yAuto) {
		super(xAuto, yAuto);
	}
	
	
	/**
	 * drawmethode für AutoLinks
	 * @param window
	 * @param x
	 * @param y
	 */
	public void drawAutoLinks(PApplet window){ 
	
	//Räder
		window.fill(20);
		window.rect(getxAuto(), getyAuto()-9, 25, 13);
		window.rect(getxAuto()+35, getyAuto()-9, 25, 11);
		window.rect(getxAuto(), getyAuto()+36, 25, 13);
		window.rect(getxAuto()+35, getyAuto()+37, 25, 11);
	//Auto
	 	window.fill(220,0,0);
	 	window.rect(getxAuto(), getyAuto(), 60, 40);
	//Licht vorne
	 	window.fill(250,250,0);
		window.rect(getxAuto()+55, getyAuto(), 10, 15);
		window.rect(getxAuto()+55, getyAuto()+24, 10, 15);
		window.fill(220,0,0);
	 	window.rect(getxAuto()+2, getyAuto(), 60, 40);
	
	 //Fenster
	 	window.fill(0,200,255);
	 	window.rect(getxAuto()+40, getyAuto(),15, 40 );
	 	
	 //Dach
	 	window.fill(180,0,0);
	 	window.rect(getxAuto(), getyAuto(), 40, 40);
	 	
	/** //Abgas
	 	window.fill(180);
	 	window.circle(getxAuto() - 5, getyAuto() + 10, 5);
	 	window.circle(getxAuto() - 10, getyAuto() + 10, 8);
	 	window.circle(getxAuto() - 15, getyAuto() + 10, 11);
	 	/*
	 	
	/** //Antenne
	 	window.fill(150);
	 	window.rect(getxAuto()-15, getyAuto()+3, 30, 2);
	 	*/
	}

}












