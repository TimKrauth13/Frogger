package model;


public class Bewegung {

	

		/**
		 * Konstruktor f�r moveBaum
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

		public float moveLastwagen(float xLastwagen, float speed) {
			
			xLastwagen = xLastwagen + speed + 10;
			
			if(xLastwagen >= 1200) {
				xLastwagen = -200;
			}
			return xLastwagen;
		}
		
		public float moveAutoRechts(float xAutoRechts, float speed) {
			
			xAutoRechts = xAutoRechts - speed - 13;
			
			if(xAutoRechts <= -300) {
				xAutoRechts = 1100;
			}
			return xAutoRechts;
		}
		
		public float moveAutoLinks(float xAutoLinks, float speed) {
			
			xAutoLinks = xAutoLinks + speed+15;
			
			if(xAutoLinks >= 1200) {
				xAutoLinks = -200;
			}
			return xAutoLinks;
		}
}
		
	

	
