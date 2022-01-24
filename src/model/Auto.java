package model;

public abstract class Auto {

	private float xAuto;
	private float yAuto;
	
	public Auto(float xAuto, float yAuto) {
		this.xAuto = xAuto;
		this.yAuto = yAuto;
	}
	
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


