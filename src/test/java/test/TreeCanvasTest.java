package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.TreeCanvas;




/**
 * TreeCanvasTest - This class is used to test the TreeCanvas class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (15/08/2014)
 */
public class TreeCanvasTest {

	TreeCanvas t;
	public  TreeCanvasTest() {}
		
	@Before
	public void setUp(){
		t = new TreeCanvas();
	}
	
	@Test
	public void testTreeCanvas(){
		 
		assertNotNull(t);
	}

}
