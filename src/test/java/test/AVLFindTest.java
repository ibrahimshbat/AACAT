package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.AVLFind;
import AVLTreeDataStructure.AVLTree;
import AVLTreeDataStructure.MainPanel;

/**
 * AVLInsertTest - This class is used to test the AVLFind class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (22/08/2014)
 */
public class AVLFindTest {

	 MainPanel m;
	 AVLFind findNode;
	 AVLTree avl;

	public AVLFindTest(){}
	
	@Before
	public void setUp(){
		m = new MainPanel();
		avl = new AVLTree(m);
	}

	/**
	 * Test creating an object of the AVLFind class
	 */
	@Test
	public void testAVLFind1(){
		findNode = new AVLFind(avl);
    	assertNotNull(findNode);

	}

	/**
	 * Test creating an object of the AVLFind class
	 */
	@Test
	public void testAVLFind2(){
		findNode = new AVLFind(avl, 14);
    	assertNotNull(findNode);

	}

	/**
	 * Test the value of the AVLFind
	 */
	@Test
	public void testGetValue(){
		findNode = new AVLFind(avl, 7);
	assertNotNull(findNode);
	assertEquals(7, findNode.getValue());
	}

	/**
	 * Test the x and y position of the AVLFind
	 */
	@Test
	public void testXPostion(){
		findNode = new AVLFind(avl, 5);
	assertNotNull(findNode);
	assertEquals(-12, findNode.getAVLNode().getX());
	assertEquals(-12, findNode.getAVLNode().getY());
	}

}
