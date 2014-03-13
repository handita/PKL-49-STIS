/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Ken
 */
public class HorizontalCaret extends DefaultCaret{

    public HorizontalCaret() {
        setBlinkRate(500);
    }


    @Override
    protected synchronized void damage(Rectangle r) {
        if (r == null) return;
        // Give values to x,y,width,height (inherited from java.awt.Rectangle).
        x = r.x;
        y = r.y + (r.height * 4 / 5 - 3);
        width = 5;
        height = 5;
        repaint( ); // Calls getComponent( ).repaint(x, y, width, height)
    }



    @Override
    public void paint(Graphics g) {
        JTextComponent comp = getComponent( );
        if (comp == null) return;

        int dot = getDot( );
        Rectangle r = null;
        try {
          r = comp.modelToView(dot);
        } catch (BadLocationException e) { return; }
        if (r == null) return;

        int dist = r.height * 4 / 5 - 3; // Will be distance from r.y to top

        if ( (x != r.x) || (y != r.y + dist) ) {
          // paint( ) has been called directly, without a previous call to
          // damage( ), so do some cleanup. (This happens, for example, when the
          // text component is resized.)
          repaint( ); // Erase previous location of caret.
          x = r.x; // Set new values for x,y,width,height.
          y = r.y + dist;
          width = 5;
          height = 5;
        }

        if ( isVisible( ) ) {
          g.setColor(comp.getCaretColor( ));
//          g.drawLine(r.x, r.y + dist, r.x, r.y + dist + 4);  // Five vertical pixels
          g.drawLine(r.x, r.y + dist + 4, r.x + 4, r.y + dist + 4); // Five horiz px
        }
    }


}

