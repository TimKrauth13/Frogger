package model;

import processing.core.PApplet;

public class Seerose extends PApplet{

	
	
	public void drawSeerose(PApplet window, float x, float y){ 
	
	//Blatt
		window.fill(0,200,0);
		window.circle(x,y,50);
		window.fill(65,110,230);
		window.triangle(x,y,x-25,y+10,x-10,y+25);
		window.fill(0,160,0);
		window.triangle(x+13,y-4,x-14,y-4,x,y+6);
		window.triangle(x+8,y+10,x-10,y,x+8,y-10);
	//Blume
		window.fill(240,60,240);
		window.circle(x,y,15);
		window.fill(250,250,0);
		window.circle(x, y, 5);
	}
}