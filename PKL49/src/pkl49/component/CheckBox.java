/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

/**
 *
 * @author Kean
 */
public class CheckBox extends JCheckBox{

    public CheckBox() {
        super();
        setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 10));
        setForeground(Color.gray);
        setOpaque(false);
    }
}
