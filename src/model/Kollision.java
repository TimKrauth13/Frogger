package model;

import java.util.ArrayList;


public class Kollision{	
	
	
	
	public void checkCollisionAL( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

			if(xFrogger > xAuto && xFrogger < xAuto + 60 && yFrogger > yAuto && yFrogger < yAuto + 40) {
				f1.setXFrogger(356); 
				f1.setYFrogger(900);
				q1.life --;
			}
	}
	
	public void checkCollisionL( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

		if(xFrogger > xAuto && xFrogger < xAuto + 100 && yFrogger > yAuto && yFrogger < yAuto + 40) {
			f1.setXFrogger(356); 
			f1.setYFrogger(900);
			q1.life --;
			}
		}
	
	
	public void checkCollisionAR( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

		if(xFrogger > xAuto && xFrogger < xAuto + 60 && yFrogger > yAuto && yFrogger < yAuto + 40) {
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

		
	

