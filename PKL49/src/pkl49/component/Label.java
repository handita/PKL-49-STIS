/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import pkl49.util.ImageUtilities;

/**
 *
 * @author Administrator
 */
public class Label extends JLabel{

    private BufferedImage image;
    public Label(String label) {
        super(label);
    }

    public Label() {

    }

    @Override
    public void setIcon(Icon icon) {
        if (icon  instanceof ImageIcon){
            ImageIcon ico = (ImageIcon) icon;
            image = ImageUtilities.reflectedImage(ico.getImage());
            ico = new ImageIcon(image);
            super.setIcon(ico);
        }else{
            super.setIcon(icon);
        }
    }

}
