package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.MainPanel;

/**
 * MainPanelTest - This class is used to test the MainPanel class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (16/08/2014)
 */
public class MainPanelTest {
	
	MainPanel m;
	public  MainPanelTest() {}
	
	@Before
	public void setUp(){
		m = new MainPanel();
	}

	@Test
	public void testControlButtons(){
		 
		assertNotNull(m);
	}
	
	/**
	 * Test number of steps
	 */
	@Test
	public void testInitialSteps(){
		 
		assertEquals(10, m.getSTEPS());
	}

	/**
	 * Test is the pause is true 
	 */
	@Test
	public void testIsPause(){
		 
		assertTrue(m.isPause());
	}
	
	/**
	 * Test the help button 
	 */

	@Test
	public void testHelpButton(){
		assertNotNull(m.getHelp());
		assertEquals("Help", m.getHelp().getText());
		assertTrue(m.getHelp().isEnabled());
		
	}

	/**
	 * Test the about button 
	 */

	@Test
	public void testAboutButton(){
		assertNotNull(m.getAbout());
		assertEquals("About", m.getAbout().getText());
		assertTrue(m.getAbout().isEnabled());
		
	}

	/**
	 * Test the change language label 
	 */
	@Test
	public void testInputDataLabel(){
		assertNotNull(m.getLabel9());
		assertEquals("Change language to", m.getLabel9().getText());
		
	}


}
