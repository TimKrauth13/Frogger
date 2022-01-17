package controller;

import model.Frogger;
import model.Kollision;
import model.Lastwagen;
import processing.core.PApplet;
import processing.core.PImage;
import model.Baum;

import java.util.ArrayList;

import model.AutoLinks;
import model.AutoRechts;
import model.Seerose;
import model.Bewegung;
import model.Highscore;
import model.Leben;

public class FroggerGameController extends PApplet{
	
	
//Enum für Spielzustand wird erstellt	
	enum SpielZustand{
		Start, Spielen, Spielende;
	}
	SpielZustand state = SpielZustand.Start;
	
	
//Speed Variabele
	float speed = 5;
		  
	
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
	Baum b7;
	
	Lastwagen l1;
	Lastwagen l2;
	Lastwagen l3;
	Lastwagen l4;
	
	AutoRechts c1;
	AutoRechts c2;
	AutoRechts c3;
	
	AutoLinks a1;
	AutoLinks a2;
	
	Bewegung m1;
	Bewegung m2;
	Bewegung m3;
	Bewegung m4;
	
	Kollision k1;
	Kollision k2;
	Kollision k3;
	Kollision k4;
	Kollision k5;
	
	Highscore h1;
	
	Leben q1;
	
	ArrayList<Baum> trees;
	
//startet das Fenster	
	public static void main(String[] args) {
		PApplet.main("controller.FroggerGameController");
		}

//Objekte erstellung	 
	 public void setup() {
		 
		 f1 = new Frogger(356, 900, 79); 
		 
		 m1 = new Bewegung();
		 m2 = new Bewegung();
		 m3 = new Bewegung();
		 m4 = new Bewegung();
		 
		 a1 = new AutoLinks(200, 805);
		 a2 = new AutoLinks(800, 805);
		 
		 c1 = new AutoRechts(800, 568);
		 c2 = new AutoRechts(0, 568);
		 c3 = new AutoRechts(450, 726);
		 
		 l1 = new Lastwagen(200, 490);
		 l2 = new Lastwagen(700, 490);
		 l3 = new Lastwagen(50, 647);
		 l4 = new Lastwagen(500, 647);
		 
		 r1 = new Seerose(198, 39);
		 r2 = new Seerose(354, 39);
		 r3 = new Seerose(511, 39);
		 
		 b1 = new Baum(0, 79, 0); 
		 b2 = new Baum(1000, 236, 0); 
		 b3 = new Baum(600, 79, 0); 
		 
		 b4 = new Baum(1000, 158, 1); 
		 b5 = new Baum(100, 314, 1); 
		 b6 = new Baum(700, 314, 1); 
		 b7 = new Baum(400, 158, 1); 
		 
		 k1 = new Kollision();
		 k2 = new Kollision();
		 k3 = new Kollision();
		 k4 = new Kollision();
		 k5 = new Kollision();
		 
		 h1 = new Highscore(0);
		 
		 q1 = new Leben(3);
		 
		trees = new ArrayList<>();
		trees.add(b1);
		trees.add(b2);
		trees.add(b3);
		trees.add(b4);
		trees.add(b5);
		trees.add(b6);
		trees.add(b7);
		 
	  }
	 
	
	//SSwitch Case für SpielZustand
	  public void keyPressed() {
		  	switch(state) {
	        case Start: keyPressedStartScreen(); break;
	        case Spielen: keyPressedInGame(); break;
	        case Spielende: keyPressedEndScreen(); break;
	        }
	  }
	  
	  public void keyPressedStartScreen() {
	        if (key == 's') {
	        state = SpielZustand.Spielen;
	        }
	    }	
		  
		  
		        
	 
		    public void keyPressedInGame() {
		    	
	//Steuerungs Funktion für Frogger  	
		    	switch(keyCode) {
			  	case UP: f1.yFrogger =  f1.yFrogger - f1.speedFrogger;  break;
			  	case DOWN: f1.yFrogger = f1.yFrogger + f1.speedFrogger; break;
			  	case LEFT: f1.xFrogger =  f1.xFrogger - f1.speedFrogger;break;
			  	case RIGHT: f1.xFrogger = f1.xFrogger + f1.speedFrogger;break;
		    	}
		    	//Frogger border wird erstellt	  
				  if(f1.xFrogger >= 673) {
					  f1.xFrogger = 672;  
				  }else if(f1.xFrogger <= 39) {
					  f1.xFrogger = 40;
				  }else if(f1.yFrogger >= 901) {
					  f1.yFrogger = 900;
				  }else if(f1.yFrogger <= 30) {
					  f1.yFrogger = 31;
				  }
				  
		    	
		    }
		    	
		    	public void keyPressedEndScreen() {
			        if (key =='n') {
			            state = SpielZustand.Start;
			        }
 	}  
	  
	/**
	   * Aufruf Draw-Methode für Bäume und Autos
	   */
	  public void draw() {
	
	//Leben werden zurückgesetzt
		  if (q1.life == 0) {
		  		state = SpielZustand.Spielende;
		  		q1.life = 3;
		  	}
		  
	//SpielZustand Start
		  if(state == SpielZustand.Start) {
			  PImage img;
		      img = loadImage("images/background.PNG");
		      image(img, 0, 0);
		      
		      fill(255);
			  textSize(100);
			  text ("Frogger", 170, 150);
			  
			  textSize(50);
			  text ("Drücke 's' für Start", 130, 250);
			  
			  q1.life = 3;
			  h1.score = 0;
			  f1.xFrogger = 356;
			  f1.yFrogger = 900;
		  }
		  
	//SpielZustand Spielende
		  if(state == SpielZustand.Spielende) {
			  
			  PImage img;
		      img = loadImage("images/background.PNG");
		      image(img, 0, 0);
		      
			  fill(255);
			  textSize(100);
			  text ("Ende", 240, 150);
			  textSize(50);
			  text ("Erreichte Punktzahl: " + h1.getScore(), 90, 250);
			  textSize(30);
			  text ("Drücke 'n' für neuen Versuch", 150, 300);
			  
		  }
		  
	 //SpielZustand Spielen 
		  if(state == SpielZustand.Spielen) {
			  
			 	  
	//Hintergrundbild wird geladen
		  PImage img;
	      img = loadImage("images/background.PNG");
	      image(img, 0, 0);
	      
	//Erstellung Seerosen-Objekte
		  r1.drawSeerose(this);
		  r2.drawSeerose(this);
		  r3.drawSeerose(this);
		  
		//Kollision Frogger mit Seerose
		  k4.checkCollisionSR(f1.xFrogger, f1.yFrogger, r1.getXSeerose(), r1.getYSeerose(), f1, h1);
		  k4.checkCollisionSR(f1.xFrogger, f1.yFrogger, r2.getXSeerose(), r2.getYSeerose(), f1, h1);
		  k4.checkCollisionSR(f1.xFrogger, f1.yFrogger, r3.getXSeerose(), r3.getYSeerose(), f1, h1);
		  
	//Bewegung für Baum-Objekte	  
		  b1.setXBaum(m1.moveBaum(b1.getXBaum(), speed + 2, b1.getRichtung()));
		  b2.setXBaum(m1.moveBaum(b2.getXBaum(), speed + 2, b2.getRichtung()));
		  b3.setXBaum(m1.moveBaum(b3.getXBaum(), speed + 2, b3.getRichtung()));
		  b4.setXBaum(m1.moveBaum(b4.getXBaum(), speed - 2, b4.getRichtung()));
		  b5.setXBaum(m1.moveBaum(b5.getXBaum(), speed - 2, b5.getRichtung()));
		  b6.setXBaum(m1.moveBaum(b6.getXBaum(), speed - 2, b6.getRichtung()));
		  b7.setXBaum(m1.moveBaum(b7.getXBaum(), speed -2, b7.getRichtung()));
			
	//Erstellung Baum-Objekte	  
		  b1.drawBaum(this);
		  b2.drawBaum(this);
		  b3.drawBaum(this);
		  b4.drawBaum(this);
		  b5.drawBaum(this);
		  b6.drawBaum(this);  
		  b7.drawBaum(this); 
	
	//Kollision Frogger mit Baum
		  k5.checkAufBaum(f1.xFrogger, f1.yFrogger,  f1, q1, trees);
		
	//Bewegung LastwagenObjekte
	      l1.setXLastwagen(m2.moveLastwagen(l1.getXLastwagen(), speed));
	      l2.setXLastwagen(m2.moveLastwagen(l2.getXLastwagen(), speed));
	      l3.setXLastwagen(m2.moveLastwagen(l3.getXLastwagen(), speed));
	      l4.setXLastwagen(m2.moveLastwagen(l4.getXLastwagen(), speed));
	      
	//Erstellung Lastwagen-Objekte 
		  l1.drawLastwagen(this);
		  l3.drawLastwagen(this);
		  l2.drawLastwagen(this);
		  l4.drawLastwagen(this);
		 	
	//Kollision Frogger mit Lastwagen
		  k2.checkCollisionL(f1.xFrogger, f1.yFrogger, l1.getXLastwagen(), l1.getYLastwagen(), f1, q1);
		  k2.checkCollisionL(f1.xFrogger, f1.yFrogger, l2.getXLastwagen(), l2.getYLastwagen(), f1, q1);
		  k2.checkCollisionL(f1.xFrogger, f1.yFrogger, l3.getXLastwagen(), l3.getYLastwagen(), f1, q1);
		  k2.checkCollisionL(f1.xFrogger, f1.yFrogger, l4.getXLastwagen(), l4.getYLastwagen(), f1, q1);
		  
	//Bewegung AutoLinks
		  a1.setXAutoLinks(m3.moveAutoLinks(a1.getXAutoLinks(), speed)); 
		  a2.setXAutoLinks(m3.moveAutoLinks(a2.getXAutoLinks(), speed)); 
		  
    //Erstellung AutoLinks-Objekte
		  a1.drawAutoLinks(this);
		  a2.drawAutoLinks(this);
		  
	//Kollision Frogger mit AutoLinks
		  k1.checkCollisionAL(f1.xFrogger, f1.yFrogger, a1.getXAutoLinks(), a1.getYAutoLinks(), f1, q1);
		  k1.checkCollisionAL(f1.xFrogger, f1.yFrogger, a2.getXAutoLinks(), a2.getYAutoLinks(), f1, q1);
		  
	//Bewegung AutoRechts
		  c1.setXAutoRechts(m4.moveAutoRechts(c1.getXAutoRechts(), speed));
		  c2.setXAutoRechts(m4.moveAutoRechts(c2.getXAutoRechts(), speed));
		  c3.setXAutoRechts(m4.moveAutoRechts(c3.getXAutoRechts(), speed));
		  
	//Erstellung AutoRechts-Objekte
		  c1.drawAutoRechts(this);
		  c3.drawAutoRechts(this);
		  c2.drawAutoRechts(this);
		  
	//Kollision Frogger mit AutoRechts
		  k3.checkCollisionAR(f1.xFrogger, f1.yFrogger, c1.getXAutoRechts(), c1.getYAutoRechts(), f1, q1);
		  k3.checkCollisionAR(f1.xFrogger, f1.yFrogger, c2.getXAutoRechts(), c2.getYAutoRechts(), f1, q1);
		  k3.checkCollisionAR(f1.xFrogger, f1.yFrogger, c3.getXAutoRechts(), c3.getYAutoRechts(), f1, q1);
		  
	//Erstellung Highscore-Objekt
		  h1.drawHighscore(this);
	
	//Erstellung Leben-Objekt
		  q1.drawLeben(this);
		  
	//Erstellung Frogger-Objekt
	      f1.drawFrogger(this);
	  
		  }
	  }
	
	//Fenstergrösse wird festgelegt
	  public void settings() {
	        size(710,940);
	      }
  }
  
  
	

	  
