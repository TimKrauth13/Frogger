package model;


public class Bewegung{
		/**
		 * Konstruktor für moveBaum
		 * @param xBaum
		 * @param speed
		 * @param richtung
		 * @return
		 */
		public float moveBaum(float xBaum, float speed, int richtung){
	
			if(richtung == 0){
				xBaum = xBaum + speed;

			}else {
				xBaum = xBaum - speed;
			}
			
			if (xBaum >= 1040) {
				xBaum = -220;
			} 
			
			if(xBaum <= -340) {
				xBaum = 1020;
			}
			return xBaum;
		}

public float moveLastwagen(float xAuto, float speed) {
			
			xAuto = xAuto + speed + 10;
			
			if(xAuto >= 1200) {
				xAuto = -200;
			
			}
			return xAuto;
		}

		public float moveAutoRechts(float xAutoRechts, float speed) {
			
			xAutoRechts = xAutoRechts - speed - 13;
			
			if(xAutoRechts <= -300) {
				xAutoRechts = 1100;
			}
			return xAutoRechts;
		}
		
		public float moveAutoLinks(float xAutoLinks, float speed) {
			
			xAutoLinks = xAutoLinks + speed + 15;
			
			if(xAutoLinks >= 1200) {
				xAutoLinks = -200;
			}
			return xAutoLinks;
		}
		
}

		
	

	

