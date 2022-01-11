package model;

import processing.core.PApplet;

public class Kollision extends PApplet{	
	
	
	
	public void checkCollisionAL( float xFrogger, float yFrogger, float xAutoLinks, float yAutoLinks, Frogger f1) {

			if(xFrogger > xAutoLinks && xFrogger < xAutoLinks + 60 && yFrogger > yAutoLinks && yFrogger < yAutoLinks + 40) {
				f1.setXFrogger(356); f1.setYFrogger(900);
				System.out.println("ded");
			}
	}
	}
		
	

