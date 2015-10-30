package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.AVLInsert;
import AVLTreeDataStructure.AVLTree;
import AVLTreeDataStructure.MainPanel;

/**
 * AVLInsertTest - This class is used to test the AVLInsert class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (25/08/2014)
 */

public class AVLInsertTest {
	 MainPanel m;
	 AVLInsert insetNode;
	 AVLTree avl;

	public AVLInsertTest(){}
	
	@Before
	public void setUp(){
		m = new MainPanel();
		avl = new AVLTree(m);
	}

	/**
	 * Test creating an object of the AVLInsert class
	 */
	@Test
	public void testAVLInsert(){
	insetNode = new AVLInsert(avl, 5);
	assertNotNull(insetNode);
	assertEquals(-12, insetNode.getV().getX());
	assertEquals(-12, insetNode.getV().getY());

	}

	/**
	 * Test the value of the insetNode
	 */
	@Test
	public void testGetValue(){
		insetNode = new AVLInsert(avl, 7);
	assertNotNull(insetNode);
	assertEquals(7, insetNode.getValue());
	}

	/**
	 * Test the x and y position of the insetNode
	 */
	@Test
	public void testXPostion(){
	insetNode = new AVLInsert(avl, 5);
	assertNotNull(insetNode);
	assertEquals(-12, insetNode.getV().getX());
	assertEquals(-12, insetNode.getV().getY());
	}

}
