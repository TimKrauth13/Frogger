package model;

/**
 * Bewegung Klasse wird erstellt
 * @author Tim
 *
 */
public class Bewegung{
		/**
		 * moveBaum-Methode wird erstellt
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

		/**
		 * moveLastwagen-Methode wird erstellt
		 * @param xAuto
		 * @param speed
		 * @return
		 */
		public float moveLastwagen(float xAuto, float speed) {
			
			xAuto = xAuto + speed + 10;
			
			if(xAuto >= 1200) {
				xAuto = -200;
			
			}
			return xAuto;
		}
		
		/**
		 * moveAutoRechts-Methode wird erstellt
		 * @param xAuto
		 * @param speed
		 * @return
		 */
		public float moveAutoRechts(float xAuto, float speed) {
			
			xAuto = xAuto - speed - 13;
			
			if(xAuto <= -300) {
				xAuto = 1100;
			}
			return xAuto;
		}
		
		/**
		 * moveAutoLinks-Methode wird erstellt
		 * @param xAuto
		 * @param speed
		 * @return
		 */
		public float moveAutoLinks(float xAuto, float speed) {
			
			xAuto = xAuto + speed + 15;
			
			if(xAuto >= 1200) {
				xAuto = -200;
			}
			return xAuto;
		}
		
}

		
	

	

