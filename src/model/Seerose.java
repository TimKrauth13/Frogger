package model;

import processing.core.PApplet;

/**
 * Seerose Klasse wird erstellt
 * @author Tim
 *
 */
public final class Seerose extends PApplet{

	private float xSeerose = 79;
	private float ySeerose = 39;
	
	
	/**
	 * Konstruktor für Seerosen-Klasse
	 * @param xSeerose
	 * @param ySeerose
	 */
	public Seerose(float xSeerose, float ySeerose) {
		this.xSeerose = xSeerose;
		this.ySeerose = ySeerose;
	}

	/**
	 * Getter und Setter für Seerosen-Klasse 
	 * @return
	 */
	public float getXSeerose() {
		return xSeerose;
	}

	public void setXSeerose(float xSeerose) {
		this.xSeerose = xSeerose;
	}

	public float getYSeerose() {
		return ySeerose;
	}

	public void setYSeerose(float ySeerose) {
		this.ySeerose = ySeerose;
	}

	/**
	 * drawSeerose-Methode wird erstellt
	 * @param window
	 */
	public void drawSeerose(PApplet window){ 
	
	//Blatt
		window.fill(0,200,0);
		window.circle(xSeerose,ySeerose,50);
		window.fill(65,110,230);
		window.triangle(xSeerose,ySeerose,xSeerose-25,ySeerose+10,xSeerose-10,ySeerose+25);
		window.fill(0,160,0);
		window.triangle(xSeerose+13,ySeerose-4,xSeerose-14,ySeerose-4,xSeerose,ySeerose+6);
		window.triangle(xSeerose+8,ySeerose+10,xSeerose-10,ySeerose,xSeerose+8,ySeerose-10);
	//Blume
		window.fill(240,60,240);
		window.circle(xSeerose,ySeerose,15);
		window.fill(250,250,0);
		window.circle(xSeerose, ySeerose, 5);
	}
}