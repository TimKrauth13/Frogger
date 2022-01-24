package model;

/**
 * Auto Klasse wird erstellt
 * @author Tim
 *
 */
public abstract class Auto {

	private float xAuto;
	private float yAuto;

/**
 * Konstruktor der Klasse Auto
 * @param xAuto
 * @param yAuto
 */
	public Auto(float xAuto, float yAuto) {
		this.xAuto = xAuto;
		this.yAuto = yAuto;
	}

/**
 * Getter und Setter der Klasse Auto werden erstellt
 * @return
 */
	public float getxAuto() {
		return xAuto;
	}
	
	public void setxAuto(float xAuto) {
		this.xAuto = xAuto;
	}
	
	public float getyAuto() {
		return yAuto;
	}
	
	public void setyAuto(float yAuto) {
		this.yAuto = yAuto;
	}
}


