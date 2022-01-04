package model;

import processing.core.PApplet;

public class Seerose extends PApplet{

	
	
	public void drawSeerose(PApplet window, float x, float y){ 
	
	//Blatt
		window.fill(0,200,0);
		window.circle(x,y,50);
		window.fill(65,110,230);
		window.triangle(x,y,x-25,y+10,x-10,y+25);
	//Blume
		//window.fill(240,60,240);
		//window.rect(x-6,y-6,12,12);
	 
		//window.rotateX((float) (PI/3.0));
		//window.rotateY((float) (PI/3.0));
		//window.rect(x-50,y,12,12);
	 
	}
}