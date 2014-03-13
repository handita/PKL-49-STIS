/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pkl49.util.ImageUtilities;

/**
 *
 * @author Administrator
 */
public class ButtonGloss extends JButton{

    private Color colorOver;
    private Color colorPress;
    private Color color;
    private Color colorOverUpper;
    private Color colorPressUpper;
    private Color colorUpper;
    private boolean press;
    private boolean over;
    private BufferedImage image;
    private boolean round;
    public ButtonGloss() {
        setColorOver(Color.RED);
        setColorPress(Color.BLUE);
        setColor(new Color(0,153,102));
        setColorOverUpper(Color.BLACK);
        setColorPressUpper(Color.BLACK);
        setColorUpper(Color.BLACK);
        setOpaque(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setRound(false);
        setForeground(Color.WHITE);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setPress(true);
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setPress(false);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
                repaint();
            }

        });
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public boolean isPress() {
        return press;
    }

    public void setPress(boolean press) {
        this.press = press;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorPress() {
        return colorPress;
    }

    public void setColorPress(Color colorPress) {
        this.colorPress = colorPress;
    }

    public Color getColorOverUpper() {
        return colorOverUpper;
    }

    public void setColorOverUpper(Color colorOverUpper) {
        this.colorOverUpper = colorOverUpper;
    }

    public Color getColorPressUpper() {
        return colorPressUpper;
    }

    public void setColorPressUpper(Color colorPressUpper) {
        this.colorPressUpper = colorPressUpper;
    }

    public Color getColorUpper() {
        return colorUpper;
    }

    public void setColorUpper(Color colorUpper) {
        this.colorUpper = colorUpper;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint paint = null;
        int w = getWidth();
        int h = getHeight();
        if (isEnabled()){
            if (over){
                if (press){
                    paint = new GradientPaint(0, 0, colorPressUpper, 0, getHeight(), colorPress.brighter());
                }else{
                    paint = new GradientPaint(0, 0, colorOverUpper, 0, getHeight(), colorOver.brighter());
                }
            }else{
                paint = new GradientPaint(0, 0, colorUpper, 0, getHeight(), color.brighter());
            }
        } else{
            paint = new GradientPaint(0, 0, Color.GRAY.darker(), 0, getHeight(), Color.GRAY.brighter());
        }
        gd.setPaint(paint);
        if (round){
            gd.fillRoundRect(0, 0, w, h, h, h);
        } else{
            gd.fillRoundRect(0, 0, w, h, h/2, h/2);
        }
        paint = new GradientPaint(0, 0, new Color(1f, 1f, 1f, 0.5f), 0, getHeight()/2, new Color(1f, 1f, 1f, 0.1f));
        gd.setPaint(paint);
        if (round){
            gd.fillRoundRect(0, 0, w, h/2, h, h);
            gd.drawRoundRect(0, 0, w-1, h-1, h, h);
        } else{
            gd.fillRoundRect(0, 0, w, h/2, h/2, h/2);
            gd.drawRoundRect(0, 0, w-1, h-1, h/2, h/2);
        }
        super.paintComponent(g);
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
