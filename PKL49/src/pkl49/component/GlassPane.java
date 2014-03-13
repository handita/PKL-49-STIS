package pkl49.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;



public class GlassPane extends JPanel implements TimingTarget{

    private float alpha;
    private Animator animator;
    private boolean hide;

    public GlassPane() {
        setOpaque(false);
        setLayout(new GridBagLayout());
        setAlpha(0);
        animator = new Animator(1000, this);

        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }
        });
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public boolean isHide() {
        return hide;
    }


    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    public void showComponent(JComponent component){
        add(component);
        setVisible(true);
        animator.start();
    }
    public void hideComponent(JComponent component){
        animator.setStartDirection(Animator.Direction.BACKWARD);
        animator.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        int w = getWidth();
        int h = getHeight();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setColor(new Color(1f, 1f, 1f, getAlpha()));
        gd.fillRect(0, 0, w, h);
        gd.dispose();
    }

    public void timingEvent(float fraction) {
        if(isHide()){
            if(fraction==0f){
                setVisible(false);
            }
        }else{
            if(fraction<.6f){
                setAlpha(fraction);
            }
        }
    }

    public void begin() {
    }

    public void end() {
    }

    public void repeat() {
    }


}