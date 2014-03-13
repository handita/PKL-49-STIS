/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.ImageIcon;

/**
 *
 * @author kean
 */
public class PanelGradient extends PanelTransparan{

    private Color firstColor;
    private Color secondColor;
    private boolean gambar;
    private Image image;

    public PanelGradient() {
        setGambar(true);
        firstColor = Color.black;
        secondColor = Color.blue;
        image = new ImageIcon(getClass().getResource("/pkl49/image/background_1.png")).getImage();
    }

    public boolean isGambar() {
        return gambar;
    }

    public void setGambar(boolean gambar) {
        this.gambar = gambar;
    }


    public Color getFirstColor() {
        return firstColor;
    }

    public void setFirstColor(Color firstColor) {
        this.firstColor = firstColor;
    }

    public Color getSecondColor() {
        return secondColor;
    }

    public void setSecondColor(Color secondColor) {
        this.secondColor = secondColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint paint = new GradientPaint(0, 0, firstColor, 0, getHeight(), secondColor);
        int w = getWidth();
        int h = getHeight();
        gd.setPaint(paint);
        gd.fillRect(0, 0, w, h);
        
        int width = getWidth();
        int height = getHeight()*5/100;
        Color dark = new Color(1F, 1F, 1F, 0.5F);
        Color light = new Color(1F, 1F, 1F, 0F);


        if(isGambar()){
            gd.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
        paint = new GradientPaint(0, 0, dark, 0, height, light);
        GeneralPath path = new GeneralPath();
        path.moveTo(0, 0);
        path.lineTo(0, height);
        path.curveTo(0, height, width/2, height/2, width, height);
        path.lineTo(width, 0);
        path.closePath();
        gd.setPaint(paint);
        gd.fill(path);

        paint = new GradientPaint(0, getHeight(), dark, 0, getHeight() - height, light);
        path = new GeneralPath();
        path.moveTo(0, getHeight());
        path.lineTo(0, getHeight() - height);
        path.curveTo(0, getHeight() - height, width / 2, getHeight() - height / 2, width, getHeight() - height);
        path.lineTo(width, getHeight());
        path.closePath();

        gd.setPaint(paint);
        gd.fill(path);

        gd.dispose();
    }

}
