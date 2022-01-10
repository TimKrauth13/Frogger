package model;

import processing.core.PApplet;

public class AutoRechts extends PApplet {

	public void drawAutoRechts(PApplet window, float x, float y){ 
		 
	//Räder
			window.fill(20);
			window.rect(x, y-9, 25, 13);
			window.rect(x+35, y-9, 25, 11);
			window.rect(x, y+36, 25, 13);
			window.rect(x+35, y+37, 25, 11);
		//Auto
		 	window.fill(100,200,200);
		 	window.rect(x, y, 60, 40);
		//Licht vorne
		 	window.fill(250,250,0);
			window.rect(x-3, y, 10, 15);
			window.rect(x-3, y+24, 10, 15);
			window.fill(100,160,160);
		 	window.rect(x, y, 60, 40);
		
		 //Fenster
		 	window.fill(0,200,255);
		 	window.rect(x+5, y,15, 40 );
		 	
		 //Dach
		 	window.fill(100,160,160);
		 	window.rect(x+20, y, 40, 40);
		 	
		 //Antenne
		 	window.fill(150);
		 	window.rect(x+45, y+36, 30, 2);
		}
}
