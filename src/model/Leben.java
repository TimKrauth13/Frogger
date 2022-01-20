package model;

import processing.core.PApplet;

public class Leben implements Score{

	public int life;

	
//Konstucktor der Leben-Klasse	
	public Leben(int life) {
		this.life = life;
	}

//Getter und Setter Für Leben-Klasse
	public int getScore() {
		return life;
	}

	public void setScore(int life) {
		this.life = life;
	}
	
//Drawmethode Leben
	public void drawLeben(PApplet window) {
		
		 window.fill(0);
		  window.textSize(30);
		  window.text ("Leben: "+ getScore(), 570, 913);
	}
}

