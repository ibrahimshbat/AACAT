package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.MainPanel;
import Components.CheckBox;



/**
 * CheckBoxTest - This class is used to test the CheckBox Class.
 * 
 * @author Ibrahim EL-Sanosi
 * @version (04/08/2014)
 */
  public class CheckBoxTest {
	 MainPanel m;

	public CheckBoxTest() {}

	@Before
	public void setUp(){
		m = new MainPanel();
	}
	
	@Test
	public void testCheckBox1(){
		CheckBox pause = new CheckBox(m, "pause", true);
		assertNotNull(pause);
		assertTrue(pause.isSelected());
	}

	@Test
	public void testCheckBox2(){
		CheckBox pause = new CheckBox(m, "pause", false);
		assertNotNull(pause);
		assertFalse(pause.isSelected());
	}

}
