package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.MainPanel;
import Components.Description;

/**
 * DescriptionTest - This class is used to test the Description class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (22/08/2014)
 */


public class DescriptionTest {
	
	 MainPanel m;
	 Description d;

	public DescriptionTest(){}
	
	@Before
	public void setUp(){
		m = new MainPanel();
		d = new Description(m);

	}
	
	/**
	 * Test creating an object of the Description class
	 */
	@Test
	public void testADescription(){
    	assertNotNull(d);

	}

	/**
	 * Test set header method in the Description class
	 */
	@Test
	public void testHeader(){
		d.setHeader("insert");
    	assertEquals("Insert Node", d.getHeader());

	}

	/**
	 * Test set setText method in the Description class
	 */
	@Test
	public void tesTsetText(){
		d.setText();
    	assertEquals("", d.getText());

	}

	

}
