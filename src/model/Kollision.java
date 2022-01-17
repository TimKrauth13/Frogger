package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Kollision extends PApplet{	
	
	
	
	public void checkCollisionAL( float xFrogger, float yFrogger, float xAutoLinks, float yAutoLinks, Frogger f1, Leben q1) {

			if(xFrogger > xAutoLinks && xFrogger < xAutoLinks + 60 && yFrogger > yAutoLinks && yFrogger < yAutoLinks + 40) {
				f1.setXFrogger(356); 
				f1.setYFrogger(900);
				q1.life --;
			}
	}
	
	public void checkCollisionL( float xFrogger, float yFrogger, float xLastwagen, float yLastwagen, Frogger f1, Leben q1) {

		if(xFrogger > xLastwagen && xFrogger < xLastwagen + 100 && yFrogger > yLastwagen && yFrogger < yLastwagen + 40) {
			f1.setXFrogger(356); 
			f1.setYFrogger(900);
			q1.life --;
			}
		}
	
	
	public void checkCollisionAR( float xFrogger, float yFrogger, float xAutoRechts, float yAutoRechts, Frogger f1, Leben q1) {

		if(xFrogger > xAutoRechts && xFrogger < xAutoRechts + 60 && yFrogger > yAutoRechts && yFrogger < yAutoRechts + 40) {
			f1.setXFrogger(356); 
			f1.setYFrogger(900);
			q1.life --;
			}
		}
	
	
	public void checkCollisionSR( float xFrogger, float yFrogger, float xSeerose, float ySeerose, Frogger f1, Highscore h1) {

		if(xFrogger > xSeerose - 25 && xFrogger < xSeerose + 50 && yFrogger > ySeerose - 25 && yFrogger < ySeerose + 25) {
			f1.setXFrogger(356); f1.setYFrogger(900);
				h1.score ++;
			}
		} 
	
	
	public void checkAufBaum( float xFrogger, float yFrogger, Frogger f1, Leben q1, ArrayList<Baum> trees) {
		Boolean isOnTree = false;
		if(yFrogger < 350) {
		for(Baum b : trees) {
			if(xFrogger <= b.getXBaum() + 180 && xFrogger >= b.getXBaum() - 30 && yFrogger >= b.getYBaum() && yFrogger <= b.getYBaum() + 60) {
				isOnTree = true;
			}
		}
		
		if(isOnTree == false) {
			f1.setXFrogger(356); f1.setYFrogger(900);
			q1.life --;
		}
		}
		
		
	}
	
}	

		
	

