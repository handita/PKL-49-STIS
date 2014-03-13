/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author kean
 */
public class PanelTransparan extends JPanel{

    private Color color;
    private int alpha;
    private boolean sabit;
    private boolean round;
    private boolean gambar;
    private Image image;
    public PanelTransparan() {
        setGambar(false);
        setOpaque(false);
        setSabit(false);
        setAlpha(0);
        setColor(Color.WHITE);
        setRound(false);
        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public boolean isGambar() {
        return gambar;
    }

    public void setGambar(boolean gambar) {
        this.gambar = gambar;
        image = new ImageIcon(getClass().getResource("/pkl49/image/header.png")).getImage();
    }


    public int getAlpha() {
        return alpha;
    }


    public void setAlpha(int alph) {
        if (alph>255){
            this.alpha = 255;
        }else if (alph<0){
            this.alpha = 0;
        }else{
            this.alpha = alph;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSabit() {
        return sabit;
    }

    public void setSabit(boolean sabit) {
        this.sabit = sabit;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        int w = getWidth();
        int h = getHeight();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(isGambar()){
            gd.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            gd.drawImage(image, 0, 0, w, h, null);
        }

        if (sabit){
            GeneralPath path = new GeneralPath();
            path.moveTo(0, 0);
            path.lineTo(0, h);
            path.curveTo(0, h, w/3, h/3, w, 0);
            path.closePath();
            gd.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));
            gd.fill(path);
        } else{
            if (round){
                gd.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));
                gd.fillRoundRect(0, 0, w, h, h/8, h/8);
                gd.setColor(color);
                gd.drawRoundRect(0, 0, w-1, h-1, h/8-1, h/8-1);
            }else{
                gd.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));
                gd.fillRect(0, 0, w, h);
            }
        }
        gd.dispose();
    }
}
