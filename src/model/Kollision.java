package model;

import processing.core.PApplet;

public class Kollision extends PApplet{	
	
	
	
	public void checkCollisionAL( float xFrogger, float yFrogger, float xAutoLinks, float yAutoLinks, Frogger f1) {

			if(xFrogger > xAutoLinks && xFrogger < xAutoLinks + 60 && yFrogger > yAutoLinks && yFrogger < yAutoLinks + 40) {
				f1.setXFrogger(356); f1.setYFrogger(900);
				System.out.println("ded");
			}
	}
	
	public void checkCollisionL( float xFrogger, float yFrogger, float xLastwagen, float yLastwagen, Frogger f1) {

		if(xFrogger > xLastwagen && xFrogger < xLastwagen + 100 && yFrogger > yLastwagen && yFrogger < yLastwagen + 40) {
			f1.setXFrogger(356); f1.setYFrogger(900);
			System.out.println("ded");
			}
		}
	
	
	public void checkCollisionAR( float xFrogger, float yFrogger, float xAutoRechts, float yAutoRechts, Frogger f1) {

		if(xFrogger > xAutoRechts && xFrogger < xAutoRechts + 100 && yFrogger > yAutoRechts && yFrogger < yAutoRechts + 40) {
			f1.setXFrogger(356); f1.setYFrogger(900);
			System.out.println("ded");
			}
		}
	}
		
	

