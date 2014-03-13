/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Fahrur
 */
public class PanelImage1 extends JPanel{
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public PanelImage1(){
        image = new ImageIcon(getClass().getResource("/pkl49/image/background.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd= (Graphics2D)g.create();

        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        gd.dispose();
    }

    
}
