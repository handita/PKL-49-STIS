/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kean
 */
public class ScroolPane extends JScrollPane{

    public ScroolPane() {
        super();
        setOpaque(false);
        setViewport(new ViewPort());
    }

}
