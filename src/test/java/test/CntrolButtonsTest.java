package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import AVLTreeDataStructure.ControlButtons;
import AVLTreeDataStructure.MainPanel;


/**
 * CntrolButtonsTest - This class is used to test the CntrolButtons panel components
 * 
 * @author Ibrahim EL-Sanosi
 * @version (15/08/2014)
 */
public class CntrolButtonsTest {
	 MainPanel m;
	 ControlButtons buttons;


	public CntrolButtonsTest(){}
	
	@Before
	public void setUp(){
		m = new MainPanel();
	    buttons = new ControlButtons(m);
	}
	
	@Test
	public void testControlButtons(){
		 
		assertNotNull(buttons);
	}
	
	/**
	 * Test the Input Data label in the ControlButtons panel
	 */

	@Test
	public void testInputDataLabel(){
		assertNotNull(buttons.getInputL());
		assertEquals("Input Data", buttons.getInputL().getText());
		
	}

	/**
	 * Test the Animation Speed label in the ControlButtons panel
	 */

	@Test
	public void testAnimationSpeedLabel(){
		assertNotNull(buttons.getSpeedL());
		assertEquals("Animation Speed", buttons.getSpeedL().getText());
		
	}


	/**
	 * Test the number of columns of the first text field in the ControlButtons panel
	 */

	@Test
	public void testInputTextFeild1(){
		assertNotNull(buttons.getInputTF1());
		assertEquals(5, buttons.getInputTF1().getColumns());
		
		}

	/**
	 * Test the number of columns of the second text field in the ControlButtons panel
	 */

	@Test
	public void testInputTextFeild2(){
		assertNotNull(buttons.getInputTF2());
		assertEquals(5, buttons.getInputTF2().getColumns());
		
		}
	

	/**
	 * Test the Insert button in the ControlButtons panel
	 */

	@Test
	public void testInsertButton(){
		assertNotNull(buttons.getInsert());
		assertEquals("Insert Node", buttons.getInsert().getText());
		assertTrue(buttons.getInsert().isEnabled());
		assertEquals(73, buttons.getInsert().getMnemonic());
		
	}
	
	/**
	 * Test the Insert Subtree button in the ControlButtons panel
	 */

	@Test
	public void testInsertSubtreeButton(){
		assertNotNull(buttons.getRandom());
		assertEquals("Insert Subtree", buttons.getRandom().getText());
		assertTrue(buttons.getRandom().isEnabled());
		assertEquals(82, buttons.getRandom().getMnemonic());
		
	}


	/**
	 * Test the Find button in the ControlButtons panel
	 */

	@Test
	public void testFindButton(){
		assertNotNull(buttons.getFind());
		assertEquals("Find", buttons.getFind().getText());
		assertTrue(buttons.getFind().isEnabled());
		assertEquals(73, buttons.getFind().getMnemonic());
		
	}

	/**
	 * Test the Next button in the ControlButtons panel
	 */

	@Test
	public void testNextButton(){
		assertNotNull(buttons.getNext());
		assertEquals("Next", buttons.getNext().getText());
		assertFalse(buttons.getNext().isEnabled());
		assertEquals(78, buttons.getNext().getMnemonic());
		
	}
	

	/**
	 * Test the Clear button in the ControlButtons panel
	 */

	@Test
	public void testClearButton(){
		assertNotNull(buttons.getClear());
		assertEquals("Clear", buttons.getClear().getText());
		assertTrue(buttons.getClear().isEnabled());
		assertEquals(67, buttons.getClear().getMnemonic());
		
	}

	/**
	 * Test the Print button in the ControlButtons panel
	 */

	@Test
	public void testPrintButton(){
		assertNotNull(buttons.getPrint());
		assertEquals("Print", buttons.getPrint().getText());
		assertTrue(buttons.getPrint().isEnabled());
		assertEquals(78, buttons.getPrint().getMnemonic());
		
	}

	/**
	 * Test the check box Pause in the ControlButtons panel
	 */

	@Test
	public void testPause(){
		assertNotNull(buttons.getPause());
		assertEquals("Pause", buttons.getPause().getText());
		assertTrue(buttons.getPause().isSelected());
		
	}

	/**
	 * Test the Animation Speed label in the ControlButtons panel
	 */

	@Test
	public void testspeedSlider(){
		assertNotNull(buttons.getSpeedSlider());
		assertEquals(0, buttons.getSpeedSlider().getMinimum());
		assertEquals(100, buttons.getSpeedSlider().getMaximum());
		
	}

}
