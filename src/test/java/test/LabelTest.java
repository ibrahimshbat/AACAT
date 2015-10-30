package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AVLTreeDataStructure.MainPanel;
import Components.Label;


/**
 * LabelTest - This class is used to test the Label Class.
 * 
 * @author Ibrahim EL-Sanosi
 * @version (02/08/2014)
 */
public class LabelTest {
	MainPanel m;
	
	public LabelTest(){}
	
	@Before
	public void setUp(){
		m = new MainPanel();
	}
	
	@Test
	public void testLabel(){
		Label lable1 = new Label(m, "insert");
		assertNotNull(lable1);
		
	}

	@Test
	public void testLabelText(){
		Label lable1 = new Label(m, "find");
		assertEquals("Find", lable1.getText());
		
	}

	
}
