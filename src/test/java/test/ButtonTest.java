package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.MainPanel;
import Components.Button;


/**
 * ButtonTest - This class is used to test the Button Class.
 * 
 * @author Ibrahim EL-Sanosi
 * @version (04/08/2014)
 */
public class ButtonTest {
 MainPanel m;
	public ButtonTest(){
		
	}
	
	@Before
	public void setUp(){
		m = new MainPanel();
	}
	
	@Test
	public void testButton(){
		Button button = new Button(m, "find");
		assertNotNull(button);
	}

	@Test
	public void testButtonText(){
		Button button = new Button(m, "insert");
		assertEquals("Insert Node", button.getText());
		
	}

}
