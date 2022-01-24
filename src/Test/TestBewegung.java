package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import model.AutoLinks;
import model.AutoRechts;
import model.Baum;
import model.Bewegung;
import model.Lastwagen;

/**
 * TestBewegung wird erstellt
 * @author Tim
 *
 */
public class TestBewegung {

	/**
	 * testMoveLastwagen Testmethode wird erstellt
	 */
	@Test
	public void testMoveLastwagen() {
		float xAuto = 100;
		float yAuto = 50;
		float speed = 5;
		
		Bewegung b1 = new Bewegung();
		Lastwagen l1 = new Lastwagen(xAuto, yAuto);
		
		l1.setxAuto(b1.moveLastwagen(xAuto, speed));

		assertEquals(115, l1.getxAuto(), 0);
	}
	
	/**
	 * testMoveAutoLinks Testmethode wird erstellt
	 */
	@Test
	public void testMoveAutoLinks() {
		float xAuto = 100;
		float yAuto = 50;
		float speed = 5;
		
		Bewegung b1 = new Bewegung();
		AutoLinks  a1 = new AutoLinks(xAuto, yAuto);
		
		a1.setxAuto(b1.moveAutoLinks(xAuto, speed));
		
		assertEquals(120, a1.getxAuto(), 0);
	}
	
	/**
	 * testMoveAutoRechts Testmethode wird erstellt
	 */
	@Test
	public void testMoveAutoRechts() {
		float xAuto = 100;
		float yAuto = 50;
		float speed = 5;
		
		Bewegung b1 = new Bewegung();
		AutoRechts  r1 = new AutoRechts(xAuto, yAuto);
		
		r1.setxAuto(b1.moveAutoRechts(xAuto, speed));
		
		assertEquals(82, r1.getxAuto(), 0);
	}
}











