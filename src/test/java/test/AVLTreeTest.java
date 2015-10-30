package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import AVLTreeDataStructure.AVLTree;
import AVLTreeDataStructure.MainPanel;

/**
 * AVLTreeTest - This class is used to test the AVLTree class
 * 
 * @author Ibrahim EL-Sanosi
 * @version (22/08/2014)
 */

public class AVLTreeTest {
	
	 MainPanel m;
	 AVLTree avlTree;

	public  AVLTreeTest() {}
	@Before
	public void setUp(){
		m = new MainPanel();
	}
	
	/**
	 * Test creating an object of the AVLTree
	 */
	@Test
	public void testAVLTree(){
	avlTree = new AVLTree(m);
	assertNotNull(avlTree);
	}

	/**
	 * Test the radius of the AVLNode
	 */
	@Test
	public void testRadius(){
	avlTree = new AVLTree(m);
	assertEquals(0, avlTree.getRadius());
	}

	/**
	 * Test the height 
	 */
	@Test
	public void testHeight(){
	avlTree = new AVLTree(m);
	assertEquals(0, avlTree.getSheight());
	}

	/**
	 * Test the width 
	 */
	@Test
	public void testWidth(){
	avlTree = new AVLTree(m);
	assertEquals(0, avlTree.getSwidth());
	}

	/**
	 * Test the root of the AVLTree
	 */
	@Test
	public void testRoot(){
	avlTree = new AVLTree(m);
	assertEquals(null, avlTree.getRoot());
	}

}
