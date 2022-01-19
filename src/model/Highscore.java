package model;

import processing.core.PApplet;

public class Highscore{

	public int score;
	
//Konstruktor für Highscore-Klasse	
	public Highscore(int score) {
		this.score = 0;
	}

//Getter für Highscore-Klasse
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

//Drawmethode Highscore
	public void drawHighscore(PApplet window){ 
		  
		  window.fill(0);
		  window.textSize(30);
		  window.text ("Punkte: "+ getScore(), 10, 913);
	}
}