/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.awt.geom.RoundRectangle2D;


/**
 *
 * @author Mr.Hands
 */


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import pkl49.util.ImageUtilities;

public class BigButton extends JButton
{
  private static final long serialVersionUID = 1L;
  private boolean over;
  private boolean press;
  private Animator animation;
  private int percent;
  private BufferedImage image;
  private Color dark = new Color(1.0F, 1.0F, 1.0F, 0.0F);
  private Color light = new Color(1.0F, 1.0F, 1.0F, 0.4F);

  @Deprecated
  public int getPercent()
  {
    return this.percent;
  }

  @Deprecated
  public void setPercent(int percent)
  {
    this.percent = percent;
    repaint();
  }

  private boolean isOver() {
    return this.over;
  }

  private void setOver(boolean over) {
    this.over = over;
    repaint();
  }

  private boolean isPress() {
    return this.press;
  }

  private void setPress(boolean press) {
    this.press = press;
    repaint();
  }

  public BigButton()
  {
    super.setContentAreaFilled(false);
    super.setBorderPainted(false);
    setFocusPainted(false);
    setHorizontalTextPosition(0);
    setVerticalTextPosition(3);
    setFont(getFont().deriveFont(1));
    setForeground(Color.white);
    setUpAnimation();
    setOpaque(false);
    addMouseListener(new MouseAdapter()
    {
                @Override
      public void mouseEntered(MouseEvent e)
      {
        super.mouseEntered(e);
       BigButton.this.setOver(true);
        if (!(BigButton.this.animation.isRunning())) {
          BigButton.this.setPercent(-20);
          BigButton.this.animation.start();
        }
      }

                @Override
      public void mouseExited(MouseEvent e)
      {
        super.mouseExited(e);
        BigButton.this.setOver(false);
      }

                @Override
      public void mousePressed(MouseEvent e)
      {
        super.mousePressed(e);
        BigButton.this.setPress(true);
      }

                @Override
      public void mouseReleased(MouseEvent e)
      {
        super.mouseReleased(e);
        BigButton.this.setPress(false);
      }
    });
  }

    @Override
  public void setContentAreaFilled(boolean b)
  {
    super.setContentAreaFilled(false);
  }

    @Override
  public void setBorderPainted(boolean b)
  {
    super.setBorderPainted(false);
  }

    @Override
  protected void paintComponent(Graphics g)
  {
    Shape s = new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), 50.0D, 50.0D);
    Graphics2D g2 = (Graphics2D)g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    if (isOver())
    {
      GradientPaint paint;
      if (isPress()) {
        paint = new GradientPaint(0.0F, getHeight() - (getHeight() * 3 / 4), this.dark, 0.0F, getHeight(), this.light);
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
      } else {
        paint = new GradientPaint(0.0F, 0.0F, this.light, 0.0F, getHeight() * 3 / 4, this.dark);
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
      }
    }

    super.paintComponent(g);

    if (this.animation.isRunning()) {
      g2.setClip(s);
      g2.setColor(new Color(1.0F, 1.0F, 1.0F, 0.3F));
      g2.fillRect(0, getHeight() * getPercent() / 100, getWidth(), getHeight() * 20 / 100);
      g2.dispose();
    }
  }

    @Override
  public void setIcon(Icon defaultIcon)
  {
    if (defaultIcon instanceof ImageIcon) {
      ImageIcon icon = (ImageIcon)defaultIcon;
      this.image = ImageUtilities.reflectedImage(icon.getImage());
      icon = new ImageIcon(this.image);
      super.setIcon(icon);
    } else {
      super.setIcon(defaultIcon);
    }
  }

  private void setUpAnimation()
  {
    this.animation = new Animator(300);
    this.animation.addTarget(new PropertySetter(this, "percent", new Integer[] { Integer.valueOf(120) }));
  }

}

