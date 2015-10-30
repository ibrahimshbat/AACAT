package Util;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Printer - this class is used to print out the TreeCanvs panel that used to draw the AVL tree on it
 * @author Ibrahim EL-Sanosi
 * @version (15/08/2014)
 *
 */
public class Printer implements Printable {
    final Component comonent;

    /**
     * Constructor for the Printer class
     * @param component
     * 					- Component
     */
    public Printer(Component component){
        this.comonent = component;
    }

    /**
     * Method used to print the content of the page.
     */
    public int print(Graphics g, PageFormat formatPage, int pageIndex) 
            throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // get the bounds of the component
        Dimension dimension = comonent.getSize();
        double componentHeight = dimension.getHeight();
        double componentWidth = dimension.getWidth();

        // get the bounds of the printable area
        double pageHeight = formatPage.getImageableHeight();
        double pageWidth = formatPage.getImageableWidth();

        double pageXStart = formatPage.getImageableX();
        double pageYStart = formatPage.getImageableY();

        double xRatio = pageWidth / componentWidth;
        double yRatio = pageHeight / componentHeight;


        Graphics2D graphic = (Graphics2D) g;
        graphic.translate(pageXStart, pageYStart);
        graphic.scale(xRatio, yRatio);
        comonent.paint(graphic);

        return Printable.PAGE_EXISTS;
    }
}

