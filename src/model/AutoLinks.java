package model;

import processing.core.PApplet;

public class AutoLinks extends PApplet {
	
	private float xAutoLinks;
	private float yAutoLinks;
	
	/**
	 * Konstruktor AutoLinks
	 * @param xAutoLinks
	 * @param yAutoLinks
	 */
	public AutoLinks(float xAutoLinks, float yAutoLinks) {
		
		this.xAutoLinks = xAutoLinks;
		this.yAutoLinks = yAutoLinks;
	}
	
	/**
	 * Getter und Setter der AutoLinks-Klasse
	 * @return
	 */
	public float getXAutoLinks() {
		return xAutoLinks;
	}
	
	public float getYAutoLinks() {
		return yAutoLinks;
	}
	
	public void setXAutoLinks(float xAutoLinks) {
		this.xAutoLinks = xAutoLinks;
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
		window.rect(xAutoLinks, yAutoLinks-9, 25, 13);
		window.rect(xAutoLinks+35, yAutoLinks-9, 25, 11);
		window.rect(xAutoLinks, yAutoLinks+36, 25, 13);
		window.rect(xAutoLinks+35, yAutoLinks+37, 25, 11);
	//Auto
	 	window.fill(220,0,0);
	 	window.rect(xAutoLinks, yAutoLinks, 60, 40);
	//Licht vorne
	 	window.fill(250,250,0);
		window.rect(xAutoLinks+55, yAutoLinks, 10, 15);
		window.rect(xAutoLinks+55, yAutoLinks+24, 10, 15);
		window.fill(220,0,0);
	 	window.rect(xAutoLinks+2, yAutoLinks, 60, 40);
	
	 //Fenster
	 	window.fill(0,200,255);
	 	window.rect(xAutoLinks+40, yAutoLinks,15, 40 );
	 	
	 //Dach
	 	window.fill(180,0,0);
	 	window.rect(xAutoLinks, yAutoLinks, 40, 40);
	 	
	 //Antenne
	 	window.fill(150);
	 	window.rect(xAutoLinks-15, yAutoLinks+3, 30, 2);
	}

}












