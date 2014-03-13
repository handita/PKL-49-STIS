/*
 *
 *
 */

package pkl49.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Kean
 */

public class TextField extends JFormattedTextField{

    
    private boolean focus;
    private boolean contain;
    private Color color;
    private Color focusColor;
    private Color containedColor;
    private Color lostColor;
    private int length;
    private int charType;
    private char maxDigit;
    private char minDigit;
    private boolean upperCase;

    public TextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(3, 6, 3, 6));
        setForeground(Color.BLACK);
        setSelectionColor(Color.GREEN.brighter());
        setCaretColor(Color.BLACK);
        setHorizontalAlignment(CENTER);
        setFocusColor(Color.WHITE);
        setLostColor(Color.white);
        setContainedColor(Color.ORANGE);
        setFont(getFont().deriveFont(Font.BOLD));
        setUpperCase(true);
        setLength(1);
        setCharType(3);
        setMaxDigit('9');
        setMinDigit('0');
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setFocus(true);
                selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

                if (getText().equals("")){
                    setFocus(false);
                    setContain(false);
                }else{
                    setFocus(false);
                    setContain(true);
                }
            }

        });
        //Set contain
        setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                StringBuffer buffer = new StringBuffer();
                char [] cs = str.toCharArray();
                int s=0;
                if (TextField.this.getText().length()<length){
                    for (int i=0;i<cs.length;i++){
                        if(charType==3){
                            if (cs[i]>=getMinDigit() && cs[i]<=getMaxDigit()){
                                cs[s++] = cs[i];
                            }
                        }else if(charType==2){
                            if(cs[i]!=';'){
                                if(!Character.isDigit(cs[i])){
                                    if(isUpperCase()){
                                        cs[s++] = Character.toUpperCase(cs[i]);
                                    }else{
                                        cs[s++] = cs[i];
                                    }
                                }
                            }
                        }else{
                            if(cs[i]!=';'){
                                if(isUpperCase()){
                                    if(!Character.isLetter(';')){
                                        cs[s++] = Character.toUpperCase(cs[i]);
                                    }
                                }else{
                                    cs[s++] = cs[i];
                                }
                            }
                        }
                    }
                    buffer.append(cs, 0, s);
                }
                super.insertString(offs, new String(buffer), a);
            }
        });

    }

    public int getCharType() {
        return charType;
    }



    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }

    public boolean isUpperCase() {
        return upperCase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private boolean isFocus(){
        return focus;
    }
    private void setFocus(boolean focus){
        this.focus = focus;
        repaint();
    }

    public boolean isContain() {
        return contain;

    }

    public void setContain(boolean contain) {
        this.contain = contain;
        repaint();
    }

    public Color getContainedColor() {
        return containedColor;
    }

    public void setContainedColor(Color containedColor) {
        this.containedColor = containedColor;
    }

    public Color getFocusColor() {
        return focusColor;
    }

    public void setFocusColor(Color focusColor) {
        this.focusColor = focusColor;
    }

    public Color getLostColor() {
        return lostColor;
    }

    public void setLostColor(Color lostColor) {
        this.lostColor = lostColor;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getMaxDigit() {
        return maxDigit;
    }

    public void setMaxDigit(char maxDigit) {
        this.maxDigit = maxDigit;
    }

    public char getMinDigit() {
        return minDigit;
    }

    public void setMinDigit(char minDigit) {
        this.minDigit = minDigit;
    }

    public void setCharType(int charType) {
        this.charType = charType;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Paint paint;
        if (isFocus()){
            paint = new GradientPaint(0, 0, new Color(focusColor.getRed(), focusColor.getGreen(), 
                    focusColor.getBlue(), 255), 0, getHeight(), new Color(focusColor.getRed(), focusColor.getGreen(), focusColor.getBlue(), 150));
        }else{
            if (isEnabled()){
                if (isContain()){
                    paint = new GradientPaint(0, 0, new Color(containedColor.getRed(), 
                            containedColor.getGreen(), containedColor.getBlue(), 255), 0,
                            getHeight(), new Color(containedColor.getRed(), containedColor.getGreen(), containedColor.getBlue(), 150));
                }else{
                    paint = new GradientPaint(0, 0, new Color(lostColor.getRed(), 
                            lostColor.getGreen(), lostColor.getBlue(), 255), 0, getHeight(), new Color(lostColor.getRed(), lostColor.getGreen(), lostColor.getBlue(), 150));
                }
            }else{
                paint = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
            }
        }
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
    public Integer getInt(){
        if (getText().equals("")){
            return null;
        }
        try{
            Integer data = new Integer(getText());
            return data;
        }catch(NumberFormatException ex){
            return null;
        }
    }
    public Integer getNol(){
        if (getText().equals("")){
            return 0;
        }
        try{
            Integer data = new Integer(getText());
            return data;
        }catch(NumberFormatException ex){
            return null;
        }
    }
    public void setInt(Integer data){
        if(data==null){
            setText(null);
        }else{
            String str = data.toString();
            setText(str);
        }
    }
}