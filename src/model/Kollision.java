package model;

import java.util.ArrayList;

/**
 * Kollision Klasse wird erstellt
 * @author Tim
 *
 */
public class Kollision{	
	
	
	/**
	 * checkCollisionAL-Methode wird erstellt
	 * Kollision von Autolinks und Frogger Objekten
	 * @param xFrogger
	 * @param yFrogger
	 * @param xAuto
	 * @param yAuto
	 * @param f1
	 * @param q1
	 */
	public void checkCollisionAL( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

			if(xFrogger > xAuto && xFrogger < xAuto + 60 && yFrogger > yAuto && yFrogger < yAuto + 40) {
				f1.setXFrogger(356); 
				f1.setYFrogger(900);
				q1.life --;
			}
	}
	
	/**
	 * checkCollisionL-Methode wird erstellt
	 * Kollision von Lastwagen und Frogger Objekten
	 * @param xFrogger
	 * @param yFrogger
	 * @param xAuto
	 * @param yAuto
	 * @param f1
	 * @param q1
	 */
	public void checkCollisionL( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

		if(xFrogger > xAuto && xFrogger < xAuto + 100 && yFrogger > yAuto && yFrogger < yAuto + 40) {
			f1.setXFrogger(356); 
			f1.setYFrogger(900);
			q1.life --;
			}
		}
	
	
	/**
	 * checkCollisionAR-Methode wird erstellt
	 * Kollision von AutoRecht und Frogger Objekten
	 * @param xFrogger
	 * @param yFrogger
	 * @param xAuto
	 * @param yAuto
	 * @param f1
	 * @param q1
	 */
	public void checkCollisionAR( float xFrogger, float yFrogger, float xAuto, float yAuto, Frogger f1, Leben q1) {

		if(xFrogger > xAuto && xFrogger < xAuto + 60 && yFrogger > yAuto && yFrogger < yAuto + 40) {
			f1.setXFrogger(356); 
			f1.setYFrogger(900);
			q1.life --;
			}
		}
	
	/**
	 * checkCollisionSR-Methode wird erstellt
	 * Kollision zwischen Seerosen und Frogger Objekten
	 * @param xFrogger
	 * @param yFrogger
	 * @param xSeerose
	 * @param ySeerose
	 * @param f1
	 * @param h1
	 */
	public void checkCollisionSR( float xFrogger, float yFrogger, float xSeerose, float ySeerose, Frogger f1, Highscore h1) {

		if(xFrogger > xSeerose - 25 && xFrogger < xSeerose + 50 && yFrogger > ySeerose - 25 && yFrogger < ySeerose + 25) {
			f1.setXFrogger(356); f1.setYFrogger(900);
				h1.score ++;
			}
		} 
	
	/**
	 * checkAufBaum-Methode wird erstellt
	 * Um zu prüfen, dass Frogger auf einem Baum ist und nicht im Wasser
	 * @param xFrogger
	 * @param yFrogger
	 * @param f1
	 * @param q1
	 * @param trees
	 */
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

		
	

