package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.MainPanel;
import Components.ColourLabels;



/**
 * ColourLablesText - This class is used to test the ColourLables class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (26/08/2014)
 */

public class ColourLablesText {
	
	 MainPanel m;
	 ColourLabels lables;

	public  ColourLablesText() {}
	
	@Before
	public void setUp(){
		m = new MainPanel();
		lables = new ColourLabels(m);
	}
	
	@Test
	public void testControlButtons(){
		 
		assertNotNull(lables);
	}

	/**
	 * Test the Blue node label in the ColourLabels panel
	 */

	@Test
	public void testLabel1(){
		assertNotNull(lables.getLabel1());
		assertEquals("Blue node: ", lables.getLabel1().getText());
		
	}

	/**
	 * Test the Orange node label in the ColourLabels panel
	 */

	@Test
	public void testLabel3(){
		assertNotNull(lables.getLabel2());
		assertEquals("Orange node: ", lables.getLabel3().getText());
		
	}

	/**
	 * Test the Green node label in the ColourLabels panel
	 */

	@Test
	public void testLabel5(){
		assertNotNull(lables.getLabel2());
		assertEquals("Green node: ", lables.getLabel5().getText());
		
	}
	
	/**
	 * Test the Red node label in the ColourLabels panel
	 */

	@Test
	public void testLabel7(){
		assertNotNull(lables.getLabel2());
		assertEquals("Red node: ", lables.getLabel7().getText());
		
	}
}
