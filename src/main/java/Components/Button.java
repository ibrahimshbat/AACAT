package Components;


import javax.swing.JButton;

import AVLTreeDataStructure.MainPanel;

/**
 * Button - This class is extends the JButton class and it uses to create
 * buttons that can translate its text from English to Arabic and vice  versa
 * 
 * @author Ibrahim EL-Sanosi
 * @version (02/07/2014)
 */
public class Button extends JButton {
	private static final long serialVersionUID = 1L;
	MainPanel m;
	String s;

	/**
	 * Constructor for Button class
	 * 
	 * @param m
	 *            - object of MainPanel class
	 * @param s
	 *            - String
	 */
	public Button(MainPanel m, String s) {
		super(m.getString(s));
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
