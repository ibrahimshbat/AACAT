package Components;



import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import AVLTreeDataStructure.MainPanel;

/**
 * Label - This class is extends the JLabel class and it uses to create
 * Labels that can translate its text from English to Arabic and vice  versa.
 * 
 * @author Ibrahim EL-Sanosi
 * @version (02/07/2014)
 */

public class Label extends JLabel{
	private static final long serialVersionUID = 1L;
	MainPanel m;
	  String s;
	  
	  /**
		 * Constructor for Label class
		 * 
		 * @param m
		 *            - object of MainPanel class
		 * @param s
		 *            - String
		 */
	  public Label(MainPanel m, String s)
	  {
	    super(m.getString(s));
		setFont(new Font("Default", 1, 13));
	    this.m = m;
	    this.s = s;
	  }
	  
		/**
		 * This method invokes when the user change the language and it acts as translator
		 * between the two languages
		 */
	  public void refresh()
	  {
	    setText(this.m.getString(this.s));
	  }
	  
	  public void setColor(Color c)
	  {
		  setForeground(c);
	  }


}
