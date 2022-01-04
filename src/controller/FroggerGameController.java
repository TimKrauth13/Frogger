package controller;

import model.Frogger;
import model.Lastwagen;
import processing.core.PApplet;
import processing.core.PImage;
import model.Baum;
import model.AutoLinks;
import model.AutoRechts;
import model.Seerose;

public class FroggerGameController extends PApplet{
	
	float x = 40;
	float y = 900;
	float xBaum = 200;
	float yBaum = 79;
	float xAutoRechts = 200;
	float yAutoRechts = 805;
	float xAutoLinks = 200;
	float yAutoLinks = 500;
	float xLastwagen = 200;
	float yLastwagen = 600;
	float xStein = 200;
	float yStein = 39;
	float xSeerose = 79;
	float ySeerose = 39;
	
	float speed = 79;
   
	Frogger f1;
	
	Seerose r1;
	Seerose r2;
	Seerose r3;
	Baum b1;
	Baum b2;
	Baum b3;
	Baum b4;
	
	Lastwagen l1;
	AutoRechts c1;
	Lastwagen l2;
	AutoRechts c2;
	AutoLinks a1;
	
	
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
	      
	      r1 = new Seerose();
		  r1.drawSeerose(this, xSeerose+118, ySeerose);
		  r2 = new Seerose();
		  r2.drawSeerose(this, xSeerose+275, ySeerose);
		  r3 = new Seerose();
		  r3.drawSeerose(this, xSeerose+432, ySeerose);
		  
		  b1 = new Baum(); 
		  b1.drawBaum(this, xBaum, yBaum);
		  b2 = new Baum(); 
		  b2.drawBaum(this, xBaum, yBaum+79);
		  b3 = new Baum(); 
		  b3.drawBaum(this, xBaum, yBaum+157);
		  b3 = new Baum(); 
		  b3.drawBaum(this, xBaum, yBaum+235);
		 		  
		  l1 = new Lastwagen();
		  l1.drawLastwagen(this, xLastwagen , yLastwagen);
		  
		  c1 = new AutoRechts();
		  c1.drawAutoRechts(this, xAutoRechts, yAutoRechts);
		  
		  l2 = new Lastwagen();
		  l2.drawLastwagen(this, xLastwagen , yLastwagen);
		  
		  c2 = new AutoRechts();
		  c2.drawAutoRechts(this, xAutoRechts, yAutoRechts);
		  
		  a1 = new AutoLinks();
		  a1.drawAutoLinks(this, xAutoLinks, yAutoLinks);
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
	  }
}
	  
