package model;

import processing.core.PApplet;

/**
 * Highscore Klasse wird erstellt
 * @author Tim
 *
 */
public final class Highscore implements Score{

	public int score;
	
	/**
	 * Konstruktor der Highscore Klasse
	 * @param score
	 */
	public Highscore(int score) {
		this.score = 0;
	}

	/**
	 * Setter und Getter für Score
	 */
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * drawHighscore-Methode wird erstellt
	 * @param window
	 */
	public void drawHighscore(PApplet window){ 
		  
		  window.fill(0);
		  window.textSize(30);
		  window.text ("Punkte: "+ getScore(), 10, 913);
	}
}