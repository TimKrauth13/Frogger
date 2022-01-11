package model;

import processing.core.PApplet;

public class Seerose extends PApplet{

	private float xSeerose = 79;
	private float ySeerose = 39;
	
	
	/**
	 * Konstruktor f�r Seerosen-Klasse
	 * @param xSeerose
	 * @param ySeerose
	 */
	public Seerose(float xSeerose, float ySeerose) {
		this.xSeerose = xSeerose;
		this.ySeerose = ySeerose;
	}

	/**
	 * Getter und Setter f�r Seerosen-Klasse 
	 * @return
	 */
	public float getxSeerose() {
		return xSeerose;
	}

	public void setxSeerose(float xSeerose) {
		this.xSeerose = xSeerose;
	}

	public float getySeerose() {
		return ySeerose;
	}

	public void setySeerose(float ySeerose) {
		this.ySeerose = ySeerose;
	}

	/**
	 * Drawmethode f�r Seerosen-Klasse
	 * @param window
	 * @param x
	 * @param y
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