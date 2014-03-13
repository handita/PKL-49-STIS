/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author Kean
 */
public class ImageUtilities {

    public static BufferedImage reflectedImage(Image image){
        int height = image.getHeight(null);

        BufferedImage result = new BufferedImage(image.getWidth(null),
              height * 2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = result.createGraphics();
            // Paints original image
           g2.drawImage(image, 0, 0, null);

           // Paints mirrored image
           g2.scale(1.0, -1.0);
           g2.drawImage(image, 0,  - height - height, null);
           g2.scale(1.0, -1.0);

            //Move to the origin of the clone
           g2.translate(0, height);

           // Creates the alpha mask
           GradientPaint mask;
           mask = new GradientPaint(0, 0, new Color(1.0f, 1.0f,
                                                                1.0f, 0.5f),
              0, height / 2, new Color(1.0f, 1.0f, 1.0f, 0.0f));
           g2.setPaint(mask);

           // Sets the alpha composite
           g2.setComposite(AlphaComposite.DstIn);

           // Paints the mask
           g2.fillRect(0, 0, image.getWidth(null), height);

           g2.dispose();
        return result;
    }
}
