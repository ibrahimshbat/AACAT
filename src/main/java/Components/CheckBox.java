package Components;


import javax.swing.JCheckBox;

import AVLTreeDataStructure.MainPanel;

/**
 * CheckBox - This class is extends the JCheckBox class and it uses to create
 * CheckBox that can translate its text from English to Arabic and vice versa
 * 
 * @author Ibrahim EL-Sanosi
 * @version (02/07/2014)
 */
public class CheckBox extends JCheckBox {
	private static final long serialVersionUID = 1L;
	MainPanel m;
	String s;

	/**
	 * Constructor for CheckBox class
	 * 
	 * @param m
	 *            - object of MainPanel class
	 * @param s
	 *            - String
	 * @param b
	 * 			  - boolean (to set it is selected or not)
	 */
	public CheckBox(MainPanel m, String s, boolean b) {
		super(m.getString(s), b);
		this.m = m;
		this.s = s;
	}

	/**
	 * This method invokes when the user change the language and it acts as translator
	 * between the two languages
	 */
	public void refresh() {
		setText(this.m.getString(this.s));
	}
}
