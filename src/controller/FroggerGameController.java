package controller;

import model.Frogger;
import model.Lastwagen;
import processing.core.PApplet;
import processing.core.PImage;
import model.Baum;
import model.Auto;
import model.Stein;
import model.Seerose;

public class FroggerGameController extends PApplet{
	
	float x = 40;
	float y = 900;
	float xBaum = 200;
	float yBaum = 79;
	float xAuto = 200;
	float yAuto = 805;
	float xLastwagen = 200;
	float yLastwagen = 600;
	float xStein = 200;
	float yStein = 39;
	float xSeerose = 300;
	float ySeerose = 39;
	
	float speed = 79;
   
	Frogger f1;
	Baum b1;
	Baum b2;
	Baum b3;
	Baum b4;
	Auto a1;
	Lastwagen l1;
	Stein s1;
	Seerose r1;
	
	public static void main(String[] args) {
		//startet das Fenster
		PApplet.main("controller.FroggerGameController");
		}

	 
	 public void setup() {
	  }
	/**
	   * Aufruf Draw-Methode für Bäume und Autos
	   */
	  public void draw() {
	
		  PImage img;
	      img = loadImage("images/background.PNG");
	      image(img, 0, 0);
	      
	      f1 = new Frogger(); 
	    f1.drawFrogger(this, x, y);
		  
		  b1 = new Baum(); 
		  b1.drawBaum(this, xBaum, yBaum);
		  b2 = new Baum(); 
		  b2.drawBaum(this, xBaum, yBaum+79);
		  b3 = new Baum(); 
		  b3.drawBaum(this, xBaum, yBaum+157);
		  b3 = new Baum(); 
		  b3.drawBaum(this, xBaum, yBaum+235);
		  
		  a1 = new Auto();
		  a1.drawAuto(this, xAuto, yAuto);
		  
		  l1 = new Lastwagen();
		  l1.drawLastwagen(this, xLastwagen , yLastwagen);
		  
		  s1 = new Stein();
		  s1.drawStein(this, xStein, yStein);
		  
		  r1 = new Seerose();
		  r1.drawSeerose(this, xSeerose, ySeerose);
	  }
	  
	
	 
	/**
	 * Fenstergrösse
	 */
	  public void settings() {
	        size(710,940);
	      }
	  
 
	  /**
	   * Steuerung für Frogger Klasse
	   */
  public void keyPressed() {
		  
		  switch(keyCode) {
		  	case UP: y =  y - speed;  break;
		  	case DOWN: y = y + speed; break;
		  	case LEFT: x =  x - speed; break;
		  	case RIGHT: x = x + speed;
		  } 
	  
	 
		 
  /**		   
   * Aufruf DrawFrogger Methode
   */
		  f1.drawFrogger(this, x, y);
		  b1.drawBaum(this, xBaum, yBaum);
		  a1.drawAuto(this, xAuto, yAuto);
	  }
}
	  
