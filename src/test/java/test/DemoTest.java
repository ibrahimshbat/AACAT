package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import AVLTreeDataStructure.Demo;

/**
 * DemoTest - This class is used to test the Demo class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (15/08/2014)
 */

public class DemoTest {

	Demo d;
	public  DemoTest() {}
		
	@Before
	public void setUp(){
		d = new Demo();
	}
	
	@Test
	public void testDemo(){
		 
		assertNotNull(d);
	}

	
	
}
