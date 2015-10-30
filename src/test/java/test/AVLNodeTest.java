package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AVLTreeDataStructure.AVLNode;
import AVLTreeDataStructure.AVLTree;
import AVLTreeDataStructure.MainPanel;


/**
 * AVLNodeTest - This class is used to test the AVLNode class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (25/08/2014)
 */

public class AVLNodeTest {
	 MainPanel m;
	 AVLNode node;
	 AVLTree avl;
	public  AVLNodeTest() {}
	
	@Before
	public void setUp(){
		m = new MainPanel();
		avl = new AVLTree(m);
	}

	/**
	 * Test creating an object of the AVLNode class
	 */
	@Test
	public void testAVLNode1(){
	node = new AVLNode(avl, 5);
	assertNotNull(node);
	assertEquals(-12, node.getX());
	assertEquals(-12, node.getY());

	}

	/**
	 * Test creating an object of the AVLNode class
	 */
	@Test
	public void testAVLNode2(){
	node = new AVLNode(avl, 11);
	AVLNode node2 = new AVLNode(node);
    	assertNotNull(node2);
	}

	/**
	 * Test creating an object of the AVLNode class
	 */
	@Test
	public void testAVLNode3(){
	node = new AVLNode(avl, 5, 10, 10);
	assertNotNull(node);
	assertEquals(5, node.getValue());
	}
	

	/**
	 * Test the value of the AVLNode
	 */
	@Test
	public void testGetValue(){
	node = new AVLNode(avl, 7);
	assertNotNull(node);
	assertEquals(7, node.getValue());
	}

	/**
	 * Test the x position of the AVLNode
	 */
	@Test
	public void testXPostion(){
	node = new AVLNode(avl, 10, 15,12);
	assertNotNull(node);
	assertEquals(15, node.getX());
	}
	
	/**
	 * Test the y position of the AVLNode
	 */
	@Test
	public void testYPostion(){
	node = new AVLNode(avl, 10, 15,12);
	assertNotNull(node);
	assertEquals(12, node.getY());
	}
	
	/**
	 * Test if the AVLNode is the root of the tree
	 */
	@Test
	public void testIsRoot(){
	node = new AVLNode(avl, 12);
	assertNotNull(node);
	assertTrue(node.isRoot());
	}

	/**
	 * Test height of the AVLNode.
	 */
	@Test
	public void testCalcuMethod(){
	node = new AVLNode(avl, 10, 5,5);
	assertNotNull(node);
	node.calc();
	assertEquals(1,node.getHeight());
	}

	/**
	 * Test phi value.
	 */
	@Test
	public void testPhiValue(){
	node = new AVLNode(avl,25);
	assertNotNull(node);
	int n =  (int) (Math.PI / 5);
	assertEquals(n , (int) node.getPhi());
	}

	/**
	 * Test barb value.
	 */
	@Test
	public void testBarbValue(){
	node = new AVLNode(avl,25);
	assertNotNull(node);
	assertEquals(10 , node.getBarb());
	}
	
	/**
	 * Test if the node is marked or not.
	 */
	@Test
	public void testNodeIsMarled(){
	node = new AVLNode(avl,25);
	assertNotNull(node);
	assertFalse(node.isMarkedNode());
	}

}

