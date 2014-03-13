/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Ken
 */
public class PasswordField extends JPasswordField{

    private boolean focus;
    private boolean contain;
    private Color color;

    public PasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(3, 6, 3, 6));
        setForeground(Color.BLACK);
        setSelectionColor(Color.GREEN.brighter());
        setCaretColor(Color.BLACK);
        setColor(Color.WHITE);
        setFont(getFont().deriveFont(Font.BOLD));
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setFocus(true);
                selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            }

        });
    }

   

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isContain() {
        return contain;
    }

    public void setContain(boolean contain) {
        this.contain = contain;
    }

    public boolean isFocus() {
        return focus;
    }

    public void setFocus(boolean focus) {
        this.focus = focus;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Paint paint = new GradientPaint(0, 0, new Color(color.getRed(), 
                            color.getGreen(), color.getBlue(), 255), 0,
                            getHeight(), new Color(color.getRed(), color.getGreen(), color.getBlue(), 150));
        gd.setPaint(paint);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight()/2, getHeight()/2);
        gd.setPaint(Color.BLACK);
//        gd.setStroke(new BasicStroke(1f));
        gd.drawRoundRect(0, 0, getWidth()-1, getHeight()-1,getHeight()/2,getHeight()/2);

        super.paintComponent(g);
        paint = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0.0F));
        gd.setPaint(paint);
        gd.fillRoundRect(0, 0, getWidth()-1, getHeight()/2, getHeight()/2, getHeight()/2);
//        gd.setStroke(new BasicStroke(1.5f));
//        gd.drawRoundRect(0, 0, getWidth()-2, getHeight()-1,getHeight()/2,getHeight()/2);
        gd.dispose();
    }


}
