package model;

import processing.core.PApplet;

/**
 * Leben Klasse wird erstellt
 * @author Tim
 *
 */
public class Leben implements Score{

	public int life;

	
	/**
	 * Konstruktor der Leben Klasse
	 * @param life
	 */
	public Leben(int life) {
		this.life = life;
	}

	/**
	 * Getter und Setter für Score
	 */
	public int getScore() {
		return life;
	}

	public void setScore(int life) {
		this.life = life;
	}
	
	/**
	 * drawLeben-Methode wird erstellt
	 * @param window
	 */
	public void drawLeben(PApplet window) {
		
		 window.fill(0);
		  window.textSize(30);
		  window.text ("Leben: "+ getScore(), 570, 913);
	}
}

