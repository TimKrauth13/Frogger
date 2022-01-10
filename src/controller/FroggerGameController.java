package controller;

import model.Frogger;
import model.Kollision;
import model.Lastwagen;
import processing.core.PApplet;
import processing.core.PImage;
import model.Baum;
import model.AutoLinks;
import model.AutoRechts;
import model.Seerose;
import model.Bewegung;

public class FroggerGameController extends PApplet{
	
	//X und Y Koordinaten
	float xFrogger = 40;
	float yFrogger = 900;
	float xBaumR = 200;
	float yBaumR = 79;
	float xBaumL = 200;
	float yBaumL = 79;
	float xAutoRechts = 390;
	float yAutoRechts = 570;
	float xAutoLinks = 200;
	float yAutoLinks = 805;
	float xLastwagen = 200;
	float yLastwagen = 490;
	float xStein = 200;
	float yStein = 39;
	float xSeerose = 79;
	float ySeerose = 39;
	float speedFrogger = 79;
	float speed = 5;
   
	int i = 3;
	
	//Objekte
	Frogger f1;
	Seerose r1;
	Seerose r2;
	Seerose r3;
	Baum b1;
	Baum b2;
	Baum b3;
	Baum b4;
	Baum b5;
	Baum b6;
	Lastwagen l1;
	Lastwagen l2;
	Lastwagen l3;
	Lastwagen l4;
	AutoRechts c1;
	AutoRechts c2;
	AutoRechts c3;
	AutoLinks a1;
	
	Kollision k1;
	
	
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
	      
	     
	      
	      r1 = new Seerose();
		  r1.drawSeerose(this, xSeerose+118, ySeerose);
		  r2 = new Seerose();
		  r2.drawSeerose(this, xSeerose+275, ySeerose);
		  r3 = new Seerose();
		  r3.drawSeerose(this, xSeerose+432, ySeerose);
		  
		  Bewegung m1 = new Bewegung();
		  xBaumR = m1.moveBaum(xBaumR, speed+4, 0);
		  b1 = new Baum(); 
		  b1.drawBaum(this, xBaumR, yBaumR);
		  b3 = new Baum(); 
		  b3.drawBaum(this, xBaumR-200, yBaumR+157);
		  b5 = new Baum(); 
		  b5.drawBaum(this, xBaumR+100, yBaumR);
		  
		  xBaumL = m1.moveBaum(xBaumL, speed, 34);
		  b2 = new Baum(); 
		  b2.drawBaum(this, xBaumL+200, yBaumL+79);
		  b4 = new Baum(); 
		  b4.drawBaum(this, xBaumL-100, yBaumL+235);
		  b6 = new Baum(); 
		  b6.drawBaum(this, xBaumL, yBaumL+235);  
		 
		 
		  
		  f1 = new Frogger(); 
	      f1.drawFrogger(this, xFrogger, yFrogger);
	      
	      Bewegung m2 = new Bewegung();
		  xLastwagen = m2.moveLastwagen(xLastwagen, speed);
	      l1 = new Lastwagen();
		  l1.drawLastwagen(this, xLastwagen , yLastwagen);
		  l3 = new Lastwagen();
		  l3.drawLastwagen(this, xLastwagen - 236 , yLastwagen);
		  
		  l2 = new Lastwagen();
		  l2.drawLastwagen(this, xLastwagen + 50, yLastwagen + 157);
		  l4 = new Lastwagen();
		  l4.drawLastwagen(this, xLastwagen + 200, yLastwagen + 157);
		  
		  Kollision k1 = new Kollision();
		  k1.checkCollision(xFrogger, yFrogger, xAutoLinks, yAutoLinks, xAutoLinks);
		  Bewegung m3 = new Bewegung();
		  xAutoLinks = m3.moveAutoLinks(xAutoLinks, speed);
		  a1 = new AutoLinks();
		  a1.drawAutoLinks(this, xAutoLinks, yAutoLinks);
		  
		  Bewegung m4 = new Bewegung();
		  xAutoRechts = m4.moveAutoRechts(xAutoRechts, speed);
		  c1 = new AutoRechts();
		  c1.drawAutoRechts(this, xAutoRechts + 200, yAutoRechts - 2);
		  c3 = new AutoRechts();
		  c3.drawAutoRechts(this, xAutoRechts + 50, yAutoRechts - 2);
		  c2 = new AutoRechts();
		  c2.drawAutoRechts(this, xAutoRechts - 200, yAutoRechts + 156);
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
		  	case UP: yFrogger =  yFrogger - speedFrogger;  break;
		  	case DOWN: yFrogger = yFrogger + speedFrogger; break;
		  	case LEFT: xFrogger =  xFrogger - speedFrogger; break;
		  	case RIGHT: xFrogger = xFrogger + speedFrogger;
		  } 
	  }
  
  
	}

	  
